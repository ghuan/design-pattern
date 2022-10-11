package com.example.behavior.responsibility;

/**
 * 文件日志类
 *
 * @author tianma
 * @date 2022/ 10/09 15:15:55
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(AbstractLogger nextLogger) {
        super(WARN, nextLogger);
    }

    @Override
    void write(String message) {
        System.out.println("file warning:"+message);
    }
}
