package com.example.behavior.command;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 键盘
 *
 * @author tianma
 * @date 2022/ 10/10 16:33:20
 */
public class Keyboard {
    public enum KeyCode{F1,F2,F3,F4,F5}
    private Map<KeyCode, List<Command>> keyCommands = new HashMap<>();
    public void bindKeyCommands(KeyCode keyCode,List<Command> commands){
        keyCommands.put(keyCode,commands);
    }
    public void keyPressed(KeyCode keyCode){
        if(keyCommands.containsKey(keyCode)){
            List<Command> commands = keyCommands.get(keyCode);
            commands.forEach(c -> c.exe());
        }
    }
}
