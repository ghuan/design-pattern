package com.example.behavior.interpreter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 鼠标脚本
 *
 * @author tianma
 * @date 2022/ 10/17 14:59:41
 */
public class MouseScript {
    private Sequence sequence;
    public MouseScript(){
        this.sequence = new Sequence(Arrays.asList(
                new MouseMove(100,200),
                new Delay(1),
                new MouseLeftKeyClick(),
                new Delay(1),
                new Sequence(Arrays.asList(new Loop(5,() ->{
                    new MouseRightKeyDown().interpret();
                })))
        ));
    }
    public void interpret() {
        this.sequence.interpret();
    }
}
