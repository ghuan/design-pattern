package com.example.structure.composite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹
 *
 * @author tianma
 * @date 2022/ 09/30 09:42:29
 */
public class Directory extends FileComponent {
    private List<FileComponent> children;
    public Directory(String path){
        super(path);
        children = new ArrayList<>();
        init();
    }
    public void init(){
        if(this.file.isDirectory()){
            for(File childF : this.file.listFiles()){
                children.add(childF.isDirectory() ? new Directory(childF.getPath()) : new com.example.structure.composite.File(childF.getPath()));
            }
        }
    }

    @Override
    public void show(String prefix){
        System.out.println(prefix+file.getPath()+":");
        children.forEach(f -> f.show(prefix+prefix));
    }
}
