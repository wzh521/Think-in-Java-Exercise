package com.wzh.thik.in.java.eight;/**
 * Created by Administrator on 2017/11/13.
 */

/**
 * @author:Administrator
 * @date:2017/11/13
 * @description:
 */

public class ExFourteen {
    public static void main(String[] args) {
        SharedMember sm = new SharedMember();
        Rodent[] rodents = {
                new Hamster(sm), new Gerbil(sm), new Mouse(sm),
        };
        for(Rodent r : rodents) {
            r.dispose();
        }
    }
}
