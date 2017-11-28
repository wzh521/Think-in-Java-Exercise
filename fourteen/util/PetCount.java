package com.wzh.thik.in.java.fourteen.util;/**
 * Created by Administrator on 2017/11/27.
 */

import java.util.HashMap;

/**
 * @author:Administrator
 * @date:2017/11/27
 * @description:
 */

public class PetCount {
    static class PetCounter extends HashMap<String,Integer>{
        public void count(String type){
            Integer quantity = get(type);
            if(quantity == null){
                put(type,1);
            }else {
                put(type,quantity+1);
            }
        }
    }
}
