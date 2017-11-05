package com.wzh.thik.in.java.third;/**
 * Created by Administrator on 2017/11/5.
 */

/**
 * @author:Administrator
 * @date:2017/11/5
 * @description:
 */
class Tank{
    float level;
}
public class ExTwo {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9f;
        t2.level = 47f;
        System.out.println("t1.level" + t1.level+" t2.level"+t2.level);
        t1 = t2;
        System.out.println("t1.level" + t1.level+" t2.level"+t2.level);
        t1.level=27f;
        System.out.println("t1.level" + t1.level+" t2.level"+t2.level);

    }

}
