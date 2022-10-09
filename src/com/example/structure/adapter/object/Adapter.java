package com.example.structure.adapter.object;

import com.example.structure.adapter.bean.MediaPlayer;
import com.example.structure.adapter.bean.Player;

/**
 * 通用播放适配器-对象适配器模式
 *
 * @author tianma
 * @date 2022/ 09/30 16:58:55
 */
public class Adapter implements Player {
    private MediaPlayer mediaPlayer;
    public Adapter(MediaPlayer mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }
    @Override
    public void play(String fileName) {
        try{
            //模拟格式转换
            String fs[] = fileName.split("\\.");
            fileName = fs[0]+".mp3";
            this.mediaPlayer.play(fileName);
        }catch (Exception e){
            System.out.println("文件格式错误");
        }
    }
}
