package com.example.behavior.responsibility.bean;

/**
 * 错误日志类
 *
 * @author tianma
 * @date 2022/ 10/09 15:15:55
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger() {
        super(ERROR, null);
    }

    @Override
    void write(String message) {
        System.out.println("error:"+message);
    }
}
