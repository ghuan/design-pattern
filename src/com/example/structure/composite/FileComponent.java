package com.example.structure.composite;

import java.io.File;

/**
 * 文件系统组件抽象类
 *
 * @author tianma
 * @date 2022/ 09/30 10:23:58
 */
public abstract class FileComponent {
    public File file;
    public FileComponent(String path){
        this.file = new File(path);
        if(!this.file.exists()){
            throw new RuntimeException(path+" not exists");
        }
    }
    public abstract void show(String prefix);
}
