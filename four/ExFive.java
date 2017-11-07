package com.wzh.thik.in.java.four;/**
 * Created by Administrator on 2017/11/7.
 */

/**
 * @author:Administrator
 * @date:2017/11/7
 * @description:
 */

public class ExFive {
    public static void toBinaryString(int i){
        char[] charBuff = new char[32];
        int position = 32;
        do{
            charBuff[--position] =
                    ((i&0x01)!=0) ?'1':'0';
            i>>>=1;

        }while (i!=0);
        for(int j=position;j<32;j++){
            System.out.print(charBuff[j]);
        }
        System.out.print("\n");

    }

    public static void main(String[] args) {
        int i1 = 0xaaaaaaaa;
        int i2 = 0x55555555;
        System.out.print("i1 = ");
        toBinaryString(i1);
        System.out.print("i2 = ");
        toBinaryString(i2);
        System.out.print("~i1 = ");
        toBinaryString(~i1);
        System.out.print("~i2 = ");
        toBinaryString(~i2);
        System.out.print("i1 & i1 = ");
        toBinaryString(i1 & i1);
        System.out.print("i1 | i1 = ");
        toBinaryString(i1 | i1);
        System.out.print("i1 ^ i1 = ");
        toBinaryString(i1 ^ i1);
        System.out.print("i1 & i2 = ");

        toBinaryString(i1 & i2);
        System.out.print("i1 | i2 = ");
        toBinaryString(i1 | i2);
        System.out.print("i1 ^ i2 = ");
        toBinaryString(i1 ^ i2);
    }
}
