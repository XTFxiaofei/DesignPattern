package com.example.pattern.adapter.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class NewCipherAdapter extends DataOperation {

    private NewCipher cipher;
    public NewCipherAdapter(){
        cipher=new NewCipher();
    }
    @Override
    public String doEncrypt(int key, String ps) {
        return cipher.doEncrypt(key,ps);
    }
}
