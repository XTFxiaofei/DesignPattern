package com.example.pattern.prototype.demo1;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class Client {
    public static void main(String[] args) {
        Email email,copyEmail;

        email=new Email();
        copyEmail=(Email)email.clone();

        System.out.println("email==copyEamil？");
        System.out.println(email==copyEmail);

        System.out.println("email.getAttachment==copyEmail.getAttachment？");
        System.out.println(email.getAttachment()==copyEmail.getAttachment());
    }
}
