package com.example.pattern.singleton.demo3;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class PrintSpoolerSingleton {
    private static PrintSpoolerSingleton instance=null;

    public PrintSpoolerSingleton() {
    }

    public static PrintSpoolerSingleton getInstance() throws PrintSpoolerException{
        if(instance==null){
            System.out.println("创建打印池!");
            instance=new PrintSpoolerSingleton();
        }else{
            throw new PrintSpoolerException("打印池正在工作中!");
        }
        return instance;
    }

    public  void manageJobs(){
        System.out.println("管理打印任务!");
    }
}
