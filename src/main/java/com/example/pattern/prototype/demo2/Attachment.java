package com.example.pattern.prototype.demo2;

import java.io.Serializable;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class Attachment implements Serializable {
    public void download(){
        System.out.println("下载附件");
    }
}
