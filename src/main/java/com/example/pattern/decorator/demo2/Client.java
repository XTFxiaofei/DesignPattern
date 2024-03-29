package com.example.pattern.decorator.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class Client {
    public static void main(String[] args) {
        String password="sunnyLiu";
        String cpassword;
        Cipher sc,cc,ac;
        sc=new SimpleCipher();
        cpassword=sc.encrypt(password);
        System.out.println(cpassword);
        System.out.println("-------------------");

        cc=new ComplexCipher(sc);
        cpassword=cc.encrypt(password);
        System.out.println(cpassword);
        System.out.println("----------------------");

        ac=new AdvancedCipher(cc);
        cpassword=ac.encrypt(password);
        System.out.println(cpassword);
        System.out.println("----------------------");
    }
}
