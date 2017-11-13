package com.wzh.thik.in.java.eight;/**
 * Created by Administrator on 2017/11/13.
 */

/**
 * @author:Administrator
 * @date:2017/11/13
 * @description:
 */

public class ExSeven {
    static Instrument[] orchestra = {
            new Wind(),
            new Percussion(), new Stringed(), new Brass(),
            new Woodwind(), new Electronic()
    };

    public static void main(String[] args) {

        for (Instrument i : orchestra) {
            i.play(Note.MIDDLE_C);
            i.adjust();
            System.out.println(i);
        }
    }
}
