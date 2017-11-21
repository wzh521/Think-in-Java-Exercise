package com.wzh.thik.in.java.thirteen;/**
 * Created by Administrator on 2017/11/21.
 */

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:Administrator
 * @date:2017/11/21
 * @description:
 */
class Groups{
    static public final String POEM ="" +
            "Twas brilling, and the slithy";
}
public class ExTwelve {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String regex = "\\b((?![A-Z])\\w+)\\b";
      Matcher m= Pattern.compile(regex)
                .matcher(Groups.POEM);
        while(m.find()) {
            set.add(m.group(1));
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}
