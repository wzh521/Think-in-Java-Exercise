package com.wzh.thik.in.java.four;/**
 * Created by Administrator on 2017/11/7.
 */

/**
 * @author:Administrator
 * @date:2017/11/7
 * @description:
 */

public class ExSeven {
    public static void printNumber(){
        for(int i = 1 ;i<=100;i++){
            if(i==99){
               // break;
                return ;
            }else{
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        printNumber();
    }
}
