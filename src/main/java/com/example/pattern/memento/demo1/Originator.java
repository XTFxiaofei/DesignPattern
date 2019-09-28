package com.example.pattern.memento.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/23 23:45
 */
public class Originator {
    private String state;

    public Originator(){}
    //创建一个备忘录对象
    public Memento createMemento(){
        return new Memento(this);
    }
    //根据备忘录对象恢复原发器状态
    public void restoreMemento(Memento m){
        state=m.state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    class Memento {
        private String state;

        public Memento(Originator o){
            state=o.state;
        }

        public void setState(String state){
            this.state=state;
        }

        public String getState(){
            return this.state;
        }
    }
}
