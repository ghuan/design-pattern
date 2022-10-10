package com.example.behavior.memento;

import com.example.behavior.memento.bean.Doc;
import com.example.behavior.memento.bean.History;

import java.util.ArrayList;
import java.util.List;

/**
 * 文档编辑器
 *
 * @author tianma
 * @date 2022/ 10/10 11:38:03
 */
public class Editor {
    private Doc doc;
    private List<History> histories = new ArrayList<>();
    private int historyIndex = 0;
    public Editor(Doc doc){
        this.doc = doc;
    }
    public void setTitle(String title){
        this.doc.setTitle(title);
    }
    public void append(String content){
        this.doc.addContent(content);
        this.addHistory();
    }
    public void show(){
        System.out.println("标题:\n"+this.doc.getTitle()+"\n内容:");
        List<String> content = this.doc.getContent();
        content.stream().forEach(System.out::println);
    }
    public void delete(){
        List<String> cs = this.doc.getContent();
        if(cs.size() > 0){
            cs.remove(cs.size() - 1);
            this.addHistory();
        }
    }
    private void addHistory(){
        histories.add(this.doc.createHistory());
        historyIndex = histories.size() - 1;
    }
    public void undo(){
        if(histories.size() > 0){
            if(historyIndex > 0){
                this.doc.setContent(histories.get(historyIndex - 1).getContent());
                historyIndex--;
            }else {
                this.doc.getContent().clear();
                historyIndex = 0;
            }
        }
    }
    public void redo(){
        if(histories.size() > 0 && historyIndex < histories.size() - 1){
            this.doc.setContent(histories.get(historyIndex+1).getContent());
            historyIndex++;
        }
    }

}
