package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/12.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author:Administrator
 * @date:2017/12/12
 * @description:
 */

public class ExSix {
    static void test(String msg, List<String> list){
        System.out.println("--- "+list+" ---");
        List<String> sbList =
                new ArrayList<>(list.subList(1,8));
        try{
            list.add(0,"Test");
        }catch (Exception e){
            System.out.println("add(index, element): " + e);
        }
        try { list.addAll(0, sbList);
        } catch(Exception e) {
            System.out.println("addAll(index, c): " + e);
        }
        try { list.remove(0);
        } catch(Exception e) {
            System.out.println("remove(index): " + e);
        }


    }

    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("A B C D E F G H I J K L".split(" "));
        test("Modifiable Copy", new ArrayList<String>(list));
        test("Arrays.asList()", list); test("unmodifiableList()",
                Collections.unmodifiableList( new ArrayList<String>(list)));

    }
}
