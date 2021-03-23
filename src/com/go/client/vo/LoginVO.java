package com.go.client.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @ClassName LoginVO
 * @Description TODO
 * @Author BigFace
 * @Date 2021/3/22 15:33
 * @Version v1.0
 **/
@Data
public class LoginVO {

    //Err        error
    // 	Header     http.Header
    // 	StatusCode int
    // 	Status     string
    // 	Body       []byte

    @JSONField(name = "ECode")
    Integer ecode;
    @JSONField(name = "UserId")
    Long userId;
    @JSONField(name = "Token")
    String token;
    @JSONField(name = "GateServerUrl")
    GateServer[] gateServerUrl;


    // type LoginHttpGateData struct {
    // 	UserId 			uint64
    // 	Token  			string
    // 	GateServerUrl 	[]GateServer
    // }

    @Data
    public static class GateServer {

        //type GateServer struct {
        // 	Weight int
        // 	Url    string
        // }

        @JSONField(name = "Weight")
        Integer weight;
        @JSONField(name = "Url")
        String url;
    }

    public static String GetBestWeight(GateServer[] gateServerUrl){

        String url  = "";
        Integer flag = 0;
        for (GateServer one: gateServerUrl){
            if (one.getWeight()<=flag){
                url = one.getUrl();
            }
        }
        return url;

    }


}
