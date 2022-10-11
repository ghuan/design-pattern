package com.example.behavior.responsibility;

/**
 * 日志抽象类
 *
 * @author tianma
 * @date 2022/ 10/09 15:06:47
 */
public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int WARN = 2;
    public static final int ERROR = 3;
    private int level;
    private AbstractLogger nextLogger;
    public void setLevel(int level) {
        this.level = level;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
    public AbstractLogger(int level){
        this.level = level;
    }
    public AbstractLogger(int level,AbstractLogger nextLogger){
        this.level = level;
        this.nextLogger = nextLogger;
    }
    public void log(int level,String message){
        if(this.level <= level){
            write(message);
        }
        if(this.nextLogger != null){
            this.nextLogger.log(level,message);
        }
    }
    abstract void write(String message);
}
