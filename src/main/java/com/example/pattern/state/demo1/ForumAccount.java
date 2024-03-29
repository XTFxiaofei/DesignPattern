package com.example.pattern.state.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/26 13:46
 */
public class ForumAccount {
    private AbstractState state;
    private String name;

    public ForumAccount(String name) {
        this.name = name;
        this.state=new PrimaryState(this);
        System.out.println(this.name+"注册成功!");
        System.out.println("--------------------------------");
    }

    public void setState(AbstractState state){
        this.state=state;
    }

    public AbstractState getState(){
        return this.state;
    }

    public String getName(){
        return this.name;
    }

    public void downloadFile(int score){
        state.downloadFile(score);
    }

    public void writeNote(int score){
        state.writeNote(score);
    }

    public void replyNote(int score){
        state.replyNote(score);
    }
}
