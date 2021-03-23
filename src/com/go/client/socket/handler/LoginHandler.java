package com.go.client.socket.handler;


import com.go.client.socket.Model;
import com.go.client.socket.proto.message.Errcode;
import com.go.client.socket.proto.message.Login;
import com.go.client.socket.proto.message.Msgdef;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;


@ChannelHandler.Sharable
public class LoginHandler extends ChannelInboundHandlerAdapter {


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
        if (   model.getType()  != Msgdef.MsgType.LoginRes_VALUE){
            super.channelRead(ctx, msg);
            return;
        }

        model.getBody();
        final Login.MsgLoginRes msgLoginRes = Login.MsgLoginRes.parseFrom(model.getBody());

        final int retValue = msgLoginRes.getRetValue();

        if (retValue != Errcode.ErrCode.OK_VALUE){
            //登录失败
            System.out.println("登录失败");
        }else {
            System.out.println("登录成功");
            ctx.channel().pipeline().addAfter("loginHandler", "hearthandler", new HeartHandler());
            ctx.channel().pipeline().remove("loginHandler");
        }






    }


}
