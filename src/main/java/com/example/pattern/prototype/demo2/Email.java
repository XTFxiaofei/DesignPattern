package com.example.pattern.prototype.demo2;

import com.example.pattern.prototype.demo2.Attachment;

import java.io.*;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class Email implements Serializable {
    private Attachment attachment=null;

    public Email(){
        this.attachment=new Attachment();
    }

    public Object deepClone() throws Exception{
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(this);


        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return ois.readObject();
    }

    public Attachment getAttachment(){
        return this.attachment;
    }

    public void display(){
        System.out.println("查看邮件!");
    }
}
