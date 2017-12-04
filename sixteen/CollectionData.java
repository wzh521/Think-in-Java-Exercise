package com.wzh.thik.in.java.sixteen;/**
 * Created by Administrator on 2017/12/4.
 */

import com.wzh.thik.in.java.eleven.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author:Administrator
 * @date:2017/12/4
 * @description:
 */

public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> generator ,int quantity){
        for(int i=0; i<quantity; i++){
            add(generator.next());
        }
    }
    public static<T> CollectionData<T> list(Generator<T> gen,int quantity){
        return new CollectionData<T>(gen,quantity);
    }
}
