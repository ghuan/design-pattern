package com.example.structure.adapter.clazz;

import com.example.structure.adapter.bean.MediaPlayer;

/**
 * 类模式适配器-专属适配器
 *
 * @author tianma
 * @date 2022/ 09/30 17:10:43
 */
public class MediaPlayerAdapter extends MediaPlayer {
    @Override
    public void play(String fileName) {
        try{
            //模拟格式转换
            String fs[] = fileName.split("\\.");
            fileName = fs[0]+".mp3";
            System.out.println("播放:"+fileName);
        }catch (Exception e){
            System.out.println("文件格式错误");
        }
    }
}
