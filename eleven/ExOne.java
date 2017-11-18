package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/17.
 */

import java.util.ArrayList;

/**
 * @author:Administrator
 * @date:2017/11/17
 * @description:
 */
class Gerbil{
    private int gerbilNumber ;
    public Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }
    public void hop(){
        System.out.println("Gerbil " + gerbilNumber);
    }
}
public class ExOne {
    public static void main(String[] args) {
        ArrayList<Gerbil>list = new ArrayList<>();
        for(int i=0; i<5; i++){
            list.add(new Gerbil(i));
        }
        for(int i=0; i<list.size();i++){
            list.get(i).hop();
        }
    }
}
