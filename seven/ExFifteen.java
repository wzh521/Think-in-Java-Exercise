package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/12.
 */

import com.wzh.thik.in.java.seven.outpackage.Villain;

/**
 * @author:Administrator
 * @date:2017/11/12
 * @description:
 */
class  XiaoM extends Villain{
    public XiaoM(String s){
        super(s);
    }
    public void setName1(String s){
        setName(s);
    }
}

public class ExFifteen {
    public static void main(String[] args) {
        Villain villain = new Villain("heello");
//        villain.setName("sssss");
       XiaoM xiaoM= new XiaoM("sss");
        System.out.println(xiaoM);
        xiaoM.setName1("qqqq");
        System.out.println(xiaoM);
    }
}
