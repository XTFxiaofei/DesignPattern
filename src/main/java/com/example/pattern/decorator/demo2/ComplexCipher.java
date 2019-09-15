package com.example.pattern.decorator.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class ComplexCipher extends CipherDecorator {

    public ComplexCipher(Cipher cipher) {
        super(cipher);
    }

    public String encrypt(String plainText){
        String result=super.encrypt(plainText);
        result=reverse(result);
        return result;
    }

    public String reverse(String text){
        String str="";
        for(int i=text.length();i>0;i--){
            str+=text.substring(i-1,i);
        }
        return str;
    }
}
