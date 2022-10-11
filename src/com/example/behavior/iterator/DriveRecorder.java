package com.example.behavior.iterator;

import java.util.Iterator;

/**
 * 行车记录仪
 *
 * @author tianma
 * @date 2022/ 10/09 13:43:06
 */
public class DriveRecorder {
    //初始化保存10个视频
    private String[] records = new String[10];
    private int index = 0;
    public void add(String record){
        if(index > 9){
            index = 0;
        }
        records[index] = record;
        index++;
    }
    public Iterator<String> iterator(){
        return new Itr();
    }
    private class Itr implements Iterator<String>{
        private int itrIndex = 0;
        @Override
        public boolean hasNext() {
            return itrIndex == 10 ? false : true;
        }

        @Override
        public String next() {
            return this.hasNext() ? records[itrIndex++] : null;
        }
    }
}
