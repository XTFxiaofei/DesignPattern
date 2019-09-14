package com.example.pattern.singleton.demo3;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class Client {
    public static void main(String[] args) {
        PrintSpoolerSingleton ps1,ps2;
        try{
            ps1=PrintSpoolerSingleton.getInstance();
            ps1.manageJobs();
        }catch (PrintSpoolerException e){
            System.out.println(e.getMessage());
        }

        System.out.println("-------------------------");

        try{
            ps2=PrintSpoolerSingleton.getInstance();
            ps2.manageJobs();
        }catch (PrintSpoolerException e){
            System.out.println(e.getMessage());
        }
    }
}
