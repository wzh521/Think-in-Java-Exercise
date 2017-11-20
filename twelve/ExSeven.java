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

public class ExSeven {
    private static Logger logger =
            Logger.getLogger("ExThree");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        char[] array = new char[10];
        try {
            array[10] = 'x';
        } catch(ArrayIndexOutOfBoundsException e) {
            logException(e);
        }
    }
}
