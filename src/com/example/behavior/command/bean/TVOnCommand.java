package com.example.behavior.command.bean;

/**
 * 开电视机命令实现
 *
 * @author tianma
 * @date 2022/ 10/10 16:25:12
 */
public class TVOnCommand implements Command {
    private TV tv;
    public TVOnCommand(TV tv){
        this.tv = tv;
    }
    @Override
    public void exe() {
       tv.on();
    }

    @Override
    public void unexe() {
        tv.off();
    }
}
