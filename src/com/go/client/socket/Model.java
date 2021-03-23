package com.go.client.socket;

import com.alibaba.fastjson.JSON;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import lombok.Data;
import org.msgpack.annotation.Message;

import java.io.Serializable;

/**
 * 消息类型分离器
 *
*
 * @author biws
 * @date 2020/11/20
 **/
@Message
public class Model implements Serializable {

    private static final long serialVersionUID = 1L;

    //类型
    private short type;

    //内容
    private byte[] body;

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Model{" +
                "type=" + type +
                ", body='" + body + '\'' +
                '}';
    }


    public byte[] toByteArray() {
        int bodyLength = 0;
        if (this.getBody()!=null&&this.getBody().length>0){
            bodyLength = this.getBody().length;
        }
        ByteBuf buf = Unpooled.buffer(2+bodyLength);
        buf.writeShort(this.type);
        if (this.getBody()!=null&&this.getBody().length>0){
            buf.writeBytes(this.body);
        }
        return buf.array();
    }

}