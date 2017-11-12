package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/12.
 */

/**
 * @author:Administrator
 * @date:2017/11/12
 * @description:
 */
class Detergent1{
   private Cleaner cleaner = new Cleaner();
    public void append(String s){
        cleaner.append(s);
    }
    public void dilute(){
        cleaner.dilute();
    }
    public void apply(){
        cleaner.apply();
    }
    public void scrub(){
        append("Detergent1.scrub()");
        cleaner.scrub();
    }
    @Override
    public String toString(){
     return cleaner.toString();
    }
}
public class ExEleven {
    public static void main(String[] args) {
        Detergent1 detergent1 = new Detergent1();
        detergent1.dilute();
        detergent1.apply();
        detergent1.scrub();
        System.out.println(detergent1);
        detergent1.append("sssssss");
        System.out.println(detergent1);
    }
}
