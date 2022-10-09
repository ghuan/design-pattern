package com.example.structure.composite.bean;

/**
 * 文件
 *
 * @author tianma
 * @date 2022/ 09/30 09:42:29
 */
public class File extends FileComponent {
    public File(String path){
        super(path);
    }

    @Override
    public void show(String prefix){
        System.out.println(prefix+file.getName());
    }
}
