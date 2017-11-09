package com.wzh.thik.in.java.five;/**
 * Created by Administrator on 2017/11/9.
 */

/**
 * @author:Administrator
 * @date:2017/11/9
 * @description:
 */
enum PaperCurrencyTypes {
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY
}
public class Extwentyone {
    public static void main(String[] args) {
        for (PaperCurrencyTypes s:PaperCurrencyTypes.values()){
            System.out.println(s+".ordinal" +s.ordinal());
        }
    }
}
