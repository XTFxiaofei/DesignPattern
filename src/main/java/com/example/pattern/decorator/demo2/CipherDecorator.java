package com.example.pattern.decorator.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class CipherDecorator implements Cipher {
    private Cipher cipher;

    public CipherDecorator(Cipher cipher) {
        this.cipher = cipher;
    }

    @Override
    public String encrypt(String plainText) {
        return cipher.encrypt(plainText);
    }
}
