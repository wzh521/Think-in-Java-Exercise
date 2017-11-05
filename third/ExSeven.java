package com.wzh.thik.in.java.third;/**
 * Created by Administrator on 2017/11/5.
 */

import java.util.Random;

/**
 * @author:Administrator
 * @date:2017/11/5
 * @description:
 */

public class ExSeven {
    public static void main(String[] args) {
        Random random =new Random();
        boolean flip = random.nextBoolean();
        System.out.println(flip ? "HEAD":"TITAL");
    }
}
