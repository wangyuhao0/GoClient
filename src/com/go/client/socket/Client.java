package com.go.client.socket;

import com.go.client.socket.codec.ProtobufDecoder;
import com.go.client.socket.codec.ProtobufEncoder;
import com.go.client.socket.handler.HeartHandler;
import com.go.client.socket.handler.LoginHandler;
import com.go.client.socket.proto.message.Login;
import com.go.client.socket.proto.message.Msgdef;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.GenericFutureListener;

public class Client {

	/**
	 * 唯一标记
	 */


	public  static void StartClient(String host,int port,long userId,String token) {

		/**
		 * 客户端的是Bootstrap，服务端的则是 ServerBootstrap。
		 * 都是AbstractBootstrap的子类。
		 **/

		/**
		 * 通过nio方式来接收连接和处理连接
		 */

		EventLoopGroup g = new NioEventLoopGroup();
		doConnect(host,port,g,userId,token);

		//连接成功发送 登录信息


	}

	/**
	 * 重连
	 */
	public static void doConnect(String host,int port,EventLoopGroup g,long userId,String token) {
		try {
			Bootstrap b = new Bootstrap();

			b.group(g);
			b.channel(NioSocketChannel.class);
			b.option(ChannelOption.SO_KEEPALIVE, true);
			b.option(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT);
			b.remoteAddress(host, port);

			// 设置通道初始化
			b.handler(
					new ChannelInitializer<SocketChannel>() {
						public void initChannel(SocketChannel ch) {
							ch.pipeline().addLast("decoder", new ProtobufDecoder());
							ch.pipeline().addLast("encoder", new ProtobufEncoder());
							ch.pipeline().addLast("loginHandler", new LoginHandler());
							//ch.pipeline().addLast("chatMsgHandler", chatMsgHandler);
							//ch.pipeline().addLast("exceptionHandler", exceptionHandler);
						}
					}
			);
			//log.info("客户端开始连接 [IM]");

			//GenericFutureListener<ChannelFuture> connectedListener = ;
			ChannelFuture f = b.connect();
			final Channel channel = f.channel();
			//f.addListener(connectedListener);
			System.out.println("发送登录请求");
			Model model = new Model();
			model.setType((short) Msgdef.MsgType.LoginReq_VALUE);
			Login.MsgLoginReq loginReq = Login.MsgLoginReq.newBuilder().setUserId(userId).setToken(token).build();
			model.setBody(loginReq.toByteArray());
			channel.writeAndFlush(model);

			// 阻塞
			//f.channel().closeFuture().sync();

		} catch (Exception e) {
			System.out.println("客户端连接失败!" + e.getMessage());
			g.shutdownGracefully();
		}
	}


}