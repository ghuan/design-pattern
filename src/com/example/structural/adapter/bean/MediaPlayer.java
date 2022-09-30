package com.example.structural.adapter.bean;

/**
 * media播放器，默认只能播放mp3格式的文件
 *
 * @author tianma
 * @date 2022/ 09/30 16:49:43
 */
public class MediaPlayer implements Player{
    @Override
    public void play(String fileName) {
        try{
            String type = fileName.split("\\.")[1];
            if(!type.toUpperCase().equals("MP3")){
                System.out.println("不支持的文件类型");
            }else {
                System.out.println("播放:"+fileName);
            }
        }catch (Exception e){
            System.out.println("文件格式错误");
        }
    }
}
