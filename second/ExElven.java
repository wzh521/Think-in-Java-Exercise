package com.wzh.thik.in.java.second;/**
 * Created by Administrator on 2017/11/4.
 */

/**
 * @author:Administrator
 * @date:2017/11/4
 * @description:
 */

public class ExElven {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue){
        anIntegerRepresentingColors = newHue;
        System.out.println(anIntegerRepresentingColors);
    }

    public static void main(String[] args) {
        ExElven exElven = new ExElven();
        exElven.changeTheHueOfTheColor(27);
    }
}
