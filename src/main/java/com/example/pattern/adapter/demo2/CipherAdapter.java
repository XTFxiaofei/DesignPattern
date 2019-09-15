package com.example.pattern.adapter.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class CipherAdapter extends DataOperation {
    private Caesar cipher;

    public CipherAdapter(){
        cipher=new Caesar();
    }

    @Override
    public String doEncrypt(int key, String ps) {
        return cipher.doEncrypt(key,ps);
    }
}
