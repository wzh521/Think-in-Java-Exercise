package com.wzh.thik.in.java.four;/**
 * Created by Administrator on 2017/11/7.
 */

import com.sun.org.apache.xpath.internal.functions.FuncFloor;

/**
 * @author:Administrator
 * @date:2017/11/7
 * @description:
 */
import static java.lang.Math.*;
public class ExFour {
    public static void main(String[] args) {
        int max = 100;
      /*  for(int i = 1; i < max; i++){
            boolean flag =true;
            for(int j = 2; j < i;j++){
                if(i % j == 0){
                    flag=false;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }*/
        /*另一种方法*/
        System.out.println("1");
        System.out.println("2");
        int limit = (int) floor(sqrt(max));
        boolean[] sushu = new boolean[max +1];
        for(int i = 3; i <= limit; i+=2){
            if (!sushu[i]){
                for (int j = 2*i; j <= max; j += i){
                    sushu[j] = true;
                }

            }

        }
        for(int i=3;i<=max;i+=2){
            if(!sushu[i]){
                System.out.println(i);
            }
        }
    }
}
