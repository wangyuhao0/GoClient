package com.go.client.params;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @ClassName LoginParams
 * @Description TODO
 * @Author BigFace
 * @Date 2021/3/22 15:25
 * @Version v1.0
 **/
@Data
public class LoginParams {

    // 	loginBody := fmt.Sprintf(`{"PlatType":1, "PlatId":"%s", "AccessToken":"%s","Account":"%s","PassWord":"%s"}`, botModule.data.BotName, botModule.data.BotName, botModule.data.BotName, botModule.data.BotName)
    @JSONField(name = "PlatType")
    Integer platType;
    @JSONField(name = "PlatId")
    String platId;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "Account")
    String account;
    @JSONField(name = "PassWord")
    String passWord;


    public LoginParams(Integer platType, String platId, String accessToken, String account, String passWord) {
        this.platType = platType;
        this.platId = platId;
        this.accessToken = accessToken;
        this.account = account;
        this.passWord = passWord;
    }
}
