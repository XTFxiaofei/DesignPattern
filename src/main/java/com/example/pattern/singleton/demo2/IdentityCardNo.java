package com.example.pattern.singleton.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class IdentityCardNo {
    private static IdentityCardNo instance=null;
    private String no;
    private IdentityCardNo(){

    }

    public static IdentityCardNo getInstance(){
        if(instance==null){
            System.out.println("第一次办理身份证，分配新号码!");
            instance=new IdentityCardNo();
            instance.setIdentityCardNo("No113123131");
        }else{
            System.out.println("重复办理身份证，获取旧号码!");
        }
        return instance;
    }

    private void setIdentityCardNo(String no){
        this.no=no;
    }

    public String getIdentityCardNo(){
        return this.no;
    }
}
