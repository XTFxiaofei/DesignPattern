package com.example.pattern.interator.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 21:38
 */
public class NewCollection implements MyCollection {

    private Object[] obj={"dog","pig","cat","monkey","pig"};

    public MyIterator createIterator(){
        return new NewIterator();
    }

   private class NewIterator implements MyIterator{
        private int currentIndex=0;
        public void first(){
            currentIndex=0;
        }

        public void next(){
            if(currentIndex<obj.length){
                currentIndex++;
            }
        }

        public boolean isLast(){
            return currentIndex==obj.length;
        }

        public Object currentItem(){
            return obj[currentIndex];
        }
   }
}
