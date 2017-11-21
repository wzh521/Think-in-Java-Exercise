package com.wzh.thik.in.java.thirteen;/**
 * Created by Administrator on 2017/11/21.
 */

import java.io.PrintStream;
import java.util.Formatter;

/**
 * @author:Administrator
 * @date:2017/11/21
 * @description:
 */
class Turtle{
    private String name;
    private Formatter formatter;
    public Turtle(String name ,Formatter formatter){
        this.name=name;
        this.formatter=formatter;
    }
    public void move(int x,int y){
        formatter.format("%s The Turtle is at (%d,%d)\n",name,x,y);
    }
}
public class ExThree {
    public static void main(String[] args) {
        PrintStream outAlias = System.err;
        Turtle tommy = new Turtle("Tommy",new Formatter(System.out));
        Turtle terry = new Turtle("Terry", new Formatter(outAlias));
        tommy.move(0,0);
        terry.move(1,1);
    }
}
