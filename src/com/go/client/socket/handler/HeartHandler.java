package com.go.client.socket.handler;

import com.go.client.socket.Model;
import com.go.client.socket.proto.message.Base;
import com.go.client.socket.proto.message.Msgdef;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.concurrent.TimeUnit;


//心跳
@ChannelHandler.Sharable
public class HeartHandler extends ChannelInboundHandlerAdapter {


    //心跳的时间间隔，单位为s
    private static final int HEARTBEAT_INTERVAL = 5;

    //在Handler被加入到Pipeline时，开始发送心跳
    @Override
    public void handlerAdded(ChannelHandlerContext ctx)
            throws Exception {

        /*final Base.MsgPing.Builder builder = Base.MsgPing.newBuilder();
        final Base.MsgPing msgPing = builder.build();*/
        //发送心跳
        Model model = new Model();
        model.setType((short) Msgdef.MsgType.Ping_VALUE);
        model.setBody(null);
        heartBeat(ctx, model);
    }

    //使用定时器，发送心跳报文
    public void heartBeat(ChannelHandlerContext ctx,
                          Model heartbeatMsg) {
        ctx.executor().schedule(() -> {

            if (ctx.channel().isActive()) {
                System.out.println(" 发送 心跳 to server");
                ctx.channel().writeAndFlush(heartbeatMsg);

                //递归调用，发送下一次的心跳
                heartBeat(ctx, heartbeatMsg);
            }

        }, HEARTBEAT_INTERVAL, TimeUnit.SECONDS);
    }


    /**
     * 业务逻辑处理
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
        //判断消息实例
        if (null == msg || !(msg instanceof Model)) {
            super.channelRead(ctx, msg);
            return;
        }

        //判断类型
        final Model model = (Model) msg;

        final int type = model.getType();

        if (type != Msgdef.MsgType.Pong_VALUE){
            //心跳的
            super.channelRead(ctx, msg);
            return;
        }
        System.out.println("收到心跳信息");
        //处理心跳



    }


}