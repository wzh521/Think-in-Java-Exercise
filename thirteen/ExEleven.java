package com.wzh.thik.in.java.thirteen;/**
 * Created by Administrator on 2017/11/21.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:Administrator
 * @date:2017/11/21
 * @description:
 */

public class ExEleven {
    public static void main(String[] args) {
        String regex ="(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        Pattern p = Pattern.compile(
                regex);
        Matcher m = p.matcher("Arline ate eight apples and " +
                "one orange while Anita hadn't any");
        while(m.find()) {
            System.out.println("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
        }

    }
}
