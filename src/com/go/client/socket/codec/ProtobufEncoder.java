package com.go.client.socket.codec;


import com.go.client.socket.Model;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * 编码器
 */
// 2 长度 2 msgType msg..
public class ProtobufEncoder extends MessageToByteEncoder<Model> {

    @Override
    protected void encode(ChannelHandlerContext ctx,
                          Model msg, ByteBuf out)
            throws Exception {

        byte[] bytes = msg.toByteArray();// 将对象转换为byte

        // 加密消息体
        /*ThreeDES des = channel.channel().attr(Constants.ENCRYPT).get();
        byte[] encryptByte = des.encrypt(bytes);*/
        int length = bytes.length;// 读取消息的长度


        // 先将消息长度写入，也就是消息头
        out.writeShort(length);
        // 消息体中包含我们要发送的数据
        out.writeBytes(msg.toByteArray());
/*        log.debug("send "
                + "[remote ip:" + ctx.channel().remoteAddress()
                + "][total length:" + length
                + "][bare length:" + msg.getSerializedSize() + "]");*/


    }

}
