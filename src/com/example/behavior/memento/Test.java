package com.example.behavior.memento;

import com.example.behavior.memento.bean.Doc;

/**
 * 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        Editor editor = new Editor(new Doc());
        editor.setTitle("备忘录模式");
        editor.show();
        System.out.println("=====添加内容======");
        editor.append("备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。");
        editor.append("备忘录模式属于行为型模式。");
        editor.show();
        editor.append("在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。");
        editor.append("所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。");
        editor.delete();
        editor.undo();
        editor.undo();
        editor.redo();
        editor.show();

    }
}
