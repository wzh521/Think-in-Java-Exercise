package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/11.
 */

/**
 * @author:Administrator
 * @date:2017/11/11
 * @description:
 */
class Cleaner{
    private String s = "Cleaner";
    public void append(String a){ s+=a; }
    public void dilute(){append("dilute()");}
    public void apply(){append("apply()");}
    public void scrub(){append("scrub()");}
    @Override
    public String toString(){ return s;}

}
class Detergent extends Cleaner{
    @Override
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }
    public void foam(){append("foam");}
}
class NewDetergent extends Detergent{
    @Override
    public void scrub(){
        append(" newDetergent.scrub()");
        super.scrub();
    }
    public void sterilize(){
        append(" sterilize()");
    }
}


public class ExTwo {
    public static void main(String[] args) {
        NewDetergent newDetergent = new NewDetergent();
        newDetergent.dilute();
        newDetergent.apply();
        newDetergent.scrub();
        newDetergent.foam();
        newDetergent.sterilize();
        System.out.println(newDetergent);
     }
}
