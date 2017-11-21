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

public class ExTen {
    public static void main(String[] args) {
        String source = "Java now has regular expressions";
        String[] regEx = {"^Java", "\\Breg.*",
                "n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "s{1}.", "s{0,3}"};
        System.out.println("Source string: " + source);
        for(String regex :regEx){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(source);
            while(matcher.find()) {
                System.out.println("Match \"" + matcher.group() + "\" at positions " +
                        matcher.start() + "-" + (matcher.end() - 1));
            }
        }

    }
}
