package com.example.structure.adapter;

import com.example.structure.adapter.bean.MediaPlayer;
import com.example.structure.adapter.clazz.MediaPlayerAdapter;
import com.example.structure.adapter.object.Adapter;

/**
 * 适配器模式：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.play("test.mp4");
        //对象适配器模式
        new Adapter(mediaPlayer).play("test.mp4");
        //类适配器模式
        new MediaPlayerAdapter().play("test.mp4");
    }
}
