package com.wzh.thik.in.java.thirteen;/**
 * Created by Administrator on 2017/11/21.
 */

import java.util.Arrays;

/**
 * @author:Administrator
 * @date:2017/11/21
 * @description:
 */

public class ExFourteen {
    public static void main(String[] args) {
        String input =
                "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(input.split("!!")));
        System.out.println(Arrays.toString(input.split("!!", 3)));
    }
}
