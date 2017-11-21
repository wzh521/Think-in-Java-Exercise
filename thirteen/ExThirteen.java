package com.wzh.thik.in.java.thirteen;/**
 * Created by Administrator on 2017/11/21.
 */

import javax.sound.midi.Soundbank;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:Administrator
 * @date:2017/11/21
 * @description:
 */
 class E13_StartEnd2 {
    private static class Display {
        private boolean regexPrinted = false;
        private String regex;

        Display(String regex) {
            this.regex = regex;
        }

        void display(String message) {
            if (!regexPrinted) {
                System.out.println(regex);
                regexPrinted = true;
            }
            System.out.println(message);
        }
    }

    static void examine(String s, String regex) {
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find())
            d.display("find() '" + m.group() +
                    "' start = " + m.start() + " end = " + m.end());
        if (m.lookingAt()) // No reset() necessary
            d.display("lookingAt() start = "
                    + m.start() + " end = " + m.end());
        if (m.matches()) // No reset() necessary
            d.display("matches() start = "
                    + m.start() + " end = " + m.end());
    }
}

public class ExThirteen {
    public static void main(String[] args) {
        for(String in : Groups.POEM.split("\n")) {
            System.out.println("input : " + in);
            for(String regex : new String[] {"\\w*ere\\w*", "\\w*at", "t\\w+", "T.*?."})
              E13_StartEnd2.examine(in, regex);
        }

    }
}
