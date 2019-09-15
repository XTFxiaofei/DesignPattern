package com.example.pattern.flyweight.demo2;



/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class Switch implements NetworkDevice {
    private String type;

    public Switch(String type){
        this.type=type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use(Port port) {
     System.out.println("Linked by switch,type is "+this.type+" ,port is "+port.getPort());
    }
}
