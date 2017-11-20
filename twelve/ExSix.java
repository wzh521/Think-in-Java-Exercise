package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */
class LoggingException extends  Exception{
    private  static Logger logger = Logger.getLogger("LoggingException");
    public LoggingException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
class LoggingException1 extends  Exception{
    private  static Logger logger = Logger.getLogger("LoggingException1");
    public LoggingException1(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
public class ExSix {
    public static void main(String[] args) {
        try {
            throw new LoggingException1();
        } catch(LoggingException1 e) { System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException();
        } catch(LoggingException e) { System.err.println("Caught " + e);
        }
    }
}
