package com.wzh.thik.in.java.four;/**
 * Created by Administrator on 2017/11/7.
 */

/**
 * @author:Administrator
 * @date:2017/11/7
 * @description:
 */

public class ExNine {
    public static int Fibonacci (int i){
        if (i<=2){
            return 1;
        }else{
            return Fibonacci(i-1)+Fibonacci(i-2);
        }
    }

    public static void main(String[] args) {
        for(int i= 1;i<=5;i++){
            System.out.println(Fibonacci(i));
        }
    }
}
