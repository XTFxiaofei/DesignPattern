package com.example.pattern.adapter.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public abstract class DataOperation {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract String doEncrypt(int key,String ps);
}
