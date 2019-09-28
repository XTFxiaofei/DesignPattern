package com.example.pattern.interator.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 21:55
 */
public class TCLTelevision implements Television {

    private Object[] obj={"化州卫视","广东卫视","珠江卫视","茂名卫视","中央卫视"};

    @Override
    public TVIterator createIterator() {
        return new TCLIterator();
    }

    class TCLIterator implements TVIterator{

        private int currentIndex=0;

        @Override
        public void setChannel(int i) {
            currentIndex=i;
        }

        @Override
        public void next() {
            if(currentIndex<obj.length){
                currentIndex++;
            }

        }

        @Override
        public void previous() {
            if(currentIndex>0){
                currentIndex--;
            }
        }

        @Override
        public boolean isLast() {
            return currentIndex==obj.length;
        }

        @Override
        public Object currentChannel() {
            return obj[currentIndex];
        }

        @Override
        public boolean isFirst() {
            return currentIndex==0;
        }
    }
}
