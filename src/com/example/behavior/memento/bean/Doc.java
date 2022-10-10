package com.example.behavior.memento.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 文档
 *
 * @author tianma
 * @date 2022/ 10/10 11:35:05
 */
public class Doc {
    private List<String> content = new ArrayList<>();
    private String title;

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }
    public void addContent(String c){
        this.content.add(c);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public History createHistory(){
        return new History(new ArrayList<>(content));
    }
    public void restoreHistory(History history){
        this.content = history.getContent();
    }
}
