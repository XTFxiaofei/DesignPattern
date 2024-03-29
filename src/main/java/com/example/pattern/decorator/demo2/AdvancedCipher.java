package com.example.pattern.decorator.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class AdvancedCipher extends CipherDecorator {
    public AdvancedCipher(Cipher cipher) {
        super(cipher);
    }

    public String encrypt(String plainText){
        String result=super.encrypt(plainText);
        result=mod(result);
        return result;
    }

    public String mod(String text){
        String str="";
        for(int i=0;i<text.length();i++){
            String c=String.valueOf(text.charAt(i)%6);
            str+=c;
        }
        return str;
    }
}
