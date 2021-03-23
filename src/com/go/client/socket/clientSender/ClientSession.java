package com.go.client.socket.clientSender;

import lombok.Data;

import java.nio.channels.Channel;

/**
 * @ClassName ClientSession
 * @Description TODO
 * @Author BigFace
 * @Date 2021/3/23 11:03
 * @Version v1.0
 **/
@Data
public class ClientSession {

    private Channel channel;

    private Long clientId;


    public ClientSession(Channel channel) {
        this.channel = channel;
    }
}
