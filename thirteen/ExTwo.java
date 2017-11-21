package com.wzh.thik.in.java.thirteen;/**
 * Created by Administrator on 2017/11/21.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Administrator
 * @date:2017/11/21
 * @description:
 */
class InfiniteRecursion{
    @Override
    public String toString(){
        return super.toString();
    }
}
public class ExTwo {
    public static void main(String[] args) {
        List<InfiniteRecursion> list = new ArrayList<>();
        for (int i=0; i<10; i++){
            list.add(new InfiniteRecursion());
        }
        System.out.println(list);
    }
}
