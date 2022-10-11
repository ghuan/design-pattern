package com.example.behavior.command;

import java.util.Arrays;

/**
 * 命令模式：将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        TV tv = new TV();
        Command tvOnCommand = new TVOnCommand(tv);
        Command tvOffCommand = new TVOffCommand(tv);
        Command tvChannelUpCommand = new TVChannelUpCommand(tv);
        Command tvChannelDownCommand = new TVChannelDownCommand(tv);
        Command tvVoiceUpCommand = new TVVoiceUpCommand(tv);
        Command tvVoiceDownCommand = new TVVoiceDownCommand(tv);
        Keyboard keyboard = new Keyboard();
        keyboard.bindKeyCommands(Keyboard.KeyCode.F1, Arrays.asList(tvOnCommand));
        keyboard.bindKeyCommands(Keyboard.KeyCode.F2, Arrays.asList(tvOffCommand));
        keyboard.bindKeyCommands(Keyboard.KeyCode.F3, Arrays.asList(tvChannelUpCommand));
        keyboard.bindKeyCommands(Keyboard.KeyCode.F4, Arrays.asList(tvChannelDownCommand));
        keyboard.bindKeyCommands(Keyboard.KeyCode.F5, Arrays.asList(tvVoiceUpCommand,tvVoiceDownCommand));
        keyboard.keyPressed(Keyboard.KeyCode.F5);
    }
}
