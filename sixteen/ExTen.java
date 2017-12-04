package com.wzh.thik.in.java.sixteen;/**
 * Created by Administrator on 2017/12/4.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Administrator
 * @date:2017/12/4
 * @description:
 */
class ArrayOfGenerics{
    public static void main(String[] args) {
        ArrayList<List<String>> ls  = new ArrayList<List<String>>();
        ls.add(new ArrayList<String>());
    //    ls.add(new ArrayList<Integer>());
        ls.get(0).add("Array of Generics");
        System.out.println(ls.toString());
    }
}
public class ExTen {
}
