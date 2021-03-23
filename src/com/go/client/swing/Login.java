package com.go.client.swing;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.go.client.http.HttpClientUtil;
import com.go.client.params.LoginParams;
import com.go.client.socket.Client;
import com.go.client.vo.LoginVO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName Login
 * @Description TODO
 * @Author BigFace
 * @Date 2021/3/22 11:44
 * @Version v1.0
 **/

public class Login {
    private JPanel login;
    private JLabel title;
    private JTextField account;
    private JLabel accountTitle;
    private JTextField password;
    private JLabel passwordTitle;
    private JButton loginButton;
    private static JFrame jFrame;


    public Login() {


        /*JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,400);
        frame.setPreferredSize(new Dimension(300,200));
        JPanel contentPane = new JPanel();

        frame.setContentPane(contentPane);*/

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("进入到登录按钮");
                final String accountText = account.getText();
                final String passwordText = password.getText();
                //向http发起请求

                System.out.println("account,password"+accountText+","+passwordText);

                LoginParams loginParams = new LoginParams(1,accountText,accountText,accountText,passwordText);

                final String jsonString = JSON.toJSONString(loginParams);
                System.out.println("jsonString-"+jsonString);
                final String postJson = HttpClientUtil.doPostJson("http://127.0.0.1:9101/login", jsonString);

                final LoginVO loginVO = JSONObject.parseObject(postJson, LoginVO.class);

                final String token = loginVO.getToken();

                final LoginVO.GateServer[] gateServerUrl = loginVO.getGateServerUrl();

                final String socketUrl = LoginVO.GetBestWeight(gateServerUrl);

                final String[] substring = socketUrl.split(":");
                final String serverUrl = substring[0];
                final Integer port = Integer.valueOf(substring[1]);

                Client.StartClient(serverUrl,port,loginVO.getUserId(),token);

                //System.exit(0);
                new Hall();
                //关闭窗体
                jFrame.setVisible(false);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        jFrame= frame;
        frame.setContentPane(new Login().login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,400);
        frame.setPreferredSize(new Dimension(300,200));
    }
}
