package com.example.pattern.observer.demo3;

import javax.swing.*;
import java.awt.*;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/24 8:44
 */
public class LoginValidatorB extends JFrame implements LoginEventListener {

    private JPanel p;
    private LoginBean lb;
    private JLabel lblLogo;

    public LoginValidatorB(){
        super("China Mobile");
        p=new JPanel();
        this.getContentPane().add(p);
        lb=new LoginBean();
        lb.addLoginEventListener(this);

        Font f=new Font("Times NEw Roman", Font.BOLD,30);
        lblLogo=new JLabel("China Mobile");
        lblLogo.setFont(f);
        lblLogo.setForeground(Color.blue);

        p.setLayout(new GridLayout(2,1));
        p.add(lblLogo);
        p.add(lb);
        p.setBackground(new Color(163,185,255));
        this.setSize(600,200);
        this.setVisible(true);
    }



    @Override
    public void volidateLogin(LoginEvent event) {
        String userName=event.getUserName();
        String password=event.getPassword();
        if(userName.equals(password)){
            JOptionPane.showMessageDialog(this,new String("Username must be different from password"),"alert",
                    JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this,new String("Rigth details!"),"alert",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new LoginValidatorB().setVisible(true);
    }
}
