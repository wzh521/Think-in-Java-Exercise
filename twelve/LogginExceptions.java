package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/10/26.
 */

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author:Administrator
 * @date:2017/10/26
 * @description:
 */

class LogginException extends Exception{
    private static Logger logger = Logger.getLogger("LogginException Exception");
    public LogginException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LogginExceptions {
    public static void main(String[] args) {
        try{
            throw new LogginException();
        }catch (LogginException e){
            System.err.println("caught"+e);
        }
    }
}
