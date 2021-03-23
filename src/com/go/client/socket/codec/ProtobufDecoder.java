package com.go.client.socket.codec;

import com.go.client.socket.Model;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import lombok.extern.slf4j.Slf4j;
import org.msgpack.MessagePack;

import java.util.List;
/**
 * create by 尼恩 @ 疯狂创客圈
 **/


/**
 * <p>
 * 解码器
 */

public class ProtobufDecoder extends ByteToMessageDecoder {


    @Override
    protected void decode(ChannelHandlerContext ctx,
                          ByteBuf in,
                          List<Object> out) throws Exception {
        // 标记一下当前的readIndex的位置
        in.markReaderIndex();
        // 判断包头长度
        if (in.readableBytes() < 2) {// 不够包头
            return;
        }
        short length = in.readShort();

        // 长度如果小于0
        if (length < 0) {// 非法数据，关闭连接
            ctx.close();
        }

        if (length > in.readableBytes()) {// 读到的消息体长度如果小于传送过来的消息长度
            // 重置读取位置
            in.resetReaderIndex();
            return;
        }
        length = (short) (length-2);
        final short msgType = in.readShort();
        System.out.println("消息类型:"+msgType);
        byte[] array;
        if (in.hasArray()) {
            //堆缓冲
            ByteBuf slice = in.slice();
            array = slice.array();
        } else {
            //直接缓冲
            array = new byte[length];
            in.readBytes(array, 0, length);
        }

//        if(in.refCnt()>0)
//        {
////            log.debug("释放临时缓冲");
//            in.release();
//        }

        // 字节转成对象
        Model model = new Model();
        model.setType(msgType);
        model.setBody(array);
        out.add(model);

    }
}
