package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/27.
 */
import  java.util.*;
/**
 * @author:Administrator
 * @date:2017/12/27
 * @description:
 */

public class CountedString {
    private static List<String> created = new
            ArrayList<>();
    private String s ;
    private  int id = 0;
    public CountedString(String str){
        s = str;
        created.add(s);
        for(String s2 : created){
            if(s2.equals(s)){
                id++;
            }
        }
    }
    @Override
    public String toString(){
        return "String: " + s +" id: "+ id+" hashCode(): " + hashCode();
    }
    @Override
    public int hashCode(){
        int result = 17;
        result = 37 * result+ s.hashCode();
        result = 37 *result + id;
        return result;
    }
    @Override
    public boolean equals(Object o){
        return o instanceof CountedString
                && s.equals(((CountedString)o).s) &&
                id == ((CountedString) o).id;
    }

    public static void main(String[] args) {
        Map<CountedString,Integer> map =
                new HashMap<>();
        CountedString[] cs = new CountedString[5];
        for (int i = 0;i < cs.length ;i++){
            cs[i] = new CountedString("hi");
            map.put(cs[i],i);
        }
        System.out.println(map);
        for(CountedString cstring : cs ){
            System.out.println("looking up "+ cstring);
            System.out.println(map.get(cstring));
        }
    }
}
