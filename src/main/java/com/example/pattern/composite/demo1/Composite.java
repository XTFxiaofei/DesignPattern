package com.example.pattern.composite.demo1;

import java.util.ArrayList;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class Composite extends Component {
    private ArrayList list=new ArrayList();
    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);

    }

    @Override
    public Component getChild(int i) {
        return (Component)list.get(i);
    }

    @Override
    public void operation() {
        for(Object obj:list){
            ((Component)obj).operation();
        }

    }
}
