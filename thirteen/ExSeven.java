package com.wzh.thik.in.java.thirteen;/**
 * Created by Administrator on 2017/11/21.
 */

/**
 * @author:Administrator
 * @date:2017/11/21
 * @description:
 */

public class ExSeven {
    public static boolean matches(String text) { return text.matches("\\p{javaUpperCase}.*\\.");
    }

    public static void main(String[] args) {
        System.out.println(matches("This is correct."));
        System.out.println(matches("bad sentence 1."));
        System.out.println(matches("Bad sentence 2"));
        System.out.println(matches("This is also correct..."));
    }

}
