package com.wzh.thik.in.java.third;/**
 * Created by Administrator on 2017/11/5.
 */

/**
 * @author:Administrator
 * @date:2017/11/5
 * @description:
 */
class Letter{
    float f;
}
public class ExThree {
    static void f(Letter l){
        l.f = 9f;
    }

    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.f = 10f;
        System.out.println(letter.f);
        f(letter);
        System.out.println(letter.f);
    }
}
