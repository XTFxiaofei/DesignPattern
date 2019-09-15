package com.example.pattern.flyweight.demo1;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class Client {
    public static void main(String[] args) {
        NetworkDevice nd1,nd2,nd3,nd4,nd5;
        DeviceFactory df=new DeviceFactory();
        nd1=df.getNetworkDevice("cisco");
        nd1.use();

        nd2=df.getNetworkDevice("cisco");
        nd2.use();

        nd3=df.getNetworkDevice("cisco");
        nd3.use();

        nd4=df.getNetworkDevice("tp");
        nd4.use();

        nd4=df.getNetworkDevice("tp");
        nd4.use();

        System.out.println("Total Device:"+df.getTotalDevice());
        System.out.println("Total Terminal:"+df.getTotalTerminal());

    }
}
