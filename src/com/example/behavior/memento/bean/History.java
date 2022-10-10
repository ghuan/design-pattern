package com.example.behavior.memento.bean;

import java.util.List;

/**
 * 历史记录
 *
 * @author tianma
 * @date 2022/ 10/10 11:33:48
 */
public class History {
    private List<String> content;
    public History(List<String> content){
        this.content = content;
    }
    public List<String> getContent() {
        return content;
    }
}
