package com.example.pattern.observer.demo3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/24 8:34
 */
public class LoginBean extends JPanel implements ActionListener {
    JLabel labUserName,labPassword;
    JTextField txtUserName;
    JPasswordField txtPassword;
    JButton btnLogin,btnClear;

    //定义一个抽象观察者对象
    LoginEventListener lel;
    //定义一个事件对象用于传输数据
    LoginEvent le;

    public LoginBean(){
        this.setLayout(new GridLayout(3,2));
        labUserName=new JLabel("User Name:");
        add(labUserName);

        txtUserName=new JTextField(20);
        add(txtUserName);

        labPassword=new JLabel("Password:");
        add(labPassword);

        txtPassword=new JPasswordField(20);
        add(txtPassword);

        btnLogin=new JButton("Login");
        add(btnLogin);

        btnClear=new JButton("Clear");
        add(btnClear);

        btnClear.addActionListener(this);
        btnLogin.addActionListener(this);

    }

    public void addLoginEventListener(LoginEventListener lel){
        this.lel=lel;
    }

    private void fireLoginEvent(Object object,String userName,String password){
        le=new LoginEvent(btnLogin,userName,password);
        lel.volidateLogin(le);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(btnLogin==e.getSource()){
            String userName=this.txtUserName.getText();
            String password=this.txtPassword.getText();

            fireLoginEvent(btnLogin,userName,password);
        }
        if(btnClear==e.getSource()){
            this.txtUserName.setText("");
            this.txtPassword.setText("");
        }
    }
}
