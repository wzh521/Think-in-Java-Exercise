package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/18.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author:Administrator
 * @date:2017/11/18
 * @description:
 */

public class ExEight {
  public  static void display(Iterator<Gerbil>it){
        while (it.hasNext()){
            Gerbil g= it.next();
            g.hop();
        }
    }
    public static void main(String[] args) {
        List <Gerbil>list = new ArrayList<>();
        for(int i=0; i<5; i++){
            list.add(new Gerbil(i));
        }
        display(list.iterator());
    }
}
