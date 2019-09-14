package com.example.pattern.prototype.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class Client {
    public static void main(String[] args) {
        Email email,copyEmail=null;

        email=new Email();

        try{
            copyEmail=(Email)email.deepClone();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("email==copyEamil？");
        System.out.println(email==copyEmail);

        System.out.println("email.getAttachment==copyEmail.getAttachment？");
        System.out.println(email.getAttachment()==copyEmail.getAttachment());
    }
}
