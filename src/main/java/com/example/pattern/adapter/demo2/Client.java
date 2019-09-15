package com.example.pattern.adapter.demo2;

import com.example.pattern.utils.XMLUtil;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class Client {
    public static void main(String[] args) {
        DataOperation dao=(DataOperation)XMLUtil.getBean("adapter.xml");
        dao.setPassword("sunnyLiu");
        String ps=dao.getPassword();
        String es=dao.doEncrypt(6,ps);
        System.out.println("明文为:"+ps);
        System.out.println("密文为:"+es);

    }
}
