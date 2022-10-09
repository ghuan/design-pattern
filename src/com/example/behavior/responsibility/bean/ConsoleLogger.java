package com.example.behavior.responsibility.bean;

/**
 * 控制台日志类
 *
 * @author tianma
 * @date 2022/ 10/09 15:15:55
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(AbstractLogger nextLogger) {
        super(INFO, nextLogger);
    }

    @Override
    void write(String message) {
        System.out.println("console info:"+message);
    }
}
