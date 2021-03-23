package com.go.client.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName Hall
 * @Description TODO
 * @Author BigFace
 * @Date 2021/3/22 19:48
 * @Version v1.0
 **/

public class Hall {
    private JPanel hall;
    private JLabel gameHall;


    public Hall(){
        JFrame frame = new JFrame("Hall");
        JPanel contentPane = new JPanel();
        frame.setContentPane(contentPane);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,400);
        frame.setPreferredSize(new Dimension(300,200));
        JButton close1 = new JButton("关闭");
        contentPane.add(close1);

        close1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                // System.exit(0);
                frame.dispose();
            }
        });
    }


    public static void main(String[] args) {
        new Hall();
    }
}
