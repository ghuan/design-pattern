package com.example.behavior.responsibility;

import com.example.behavior.responsibility.bean.AbstractLogger;
import com.example.behavior.responsibility.bean.ConsoleLogger;
import com.example.behavior.responsibility.bean.ErrorLogger;
import com.example.behavior.responsibility.bean.FileLogger;

/**
 * 责任链模式：避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    private static AbstractLogger getLoggerChain(){
        AbstractLogger errorLogger = new ErrorLogger();
        AbstractLogger fileLogger = new FileLogger(errorLogger);
        AbstractLogger consoleLogger = new ConsoleLogger(fileLogger);
        return consoleLogger;
    }
    public static void main(String[] args){
        AbstractLogger logger = getLoggerChain();
        logger.log(AbstractLogger.INFO,"info message");
        logger.log(AbstractLogger.WARN,"warn message");
        logger.log(AbstractLogger.ERROR,"error message");
    }
}
