package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/27.
 */

import com.sun.glass.ui.Size;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author:Administrator
 * @date:2017/12/27
 * @description:
 */
class SimpleHashMap3<K,V> extends SimpleHashMap<K,V>{
    @Override
    public void clear(){
        buckets = new LinkedList[SIZE];
    }
    @Override
    public V remove (Object key){
        int index = Math.abs(key.hashCode())% SIZE;
        if(buckets[index] == null ){ return null;}
        Iterator<MapEntry<K,V>> it = buckets[index].iterator();
        while (it.hasNext()){
            MapEntry<K,V> iPair = it.next();
            if(iPair.getKey().equals(key)){
                V value = iPair.getValue();
                it.remove();
                return value;
            }

        }
        return null;
    }

}
public class ExTwentyTwo {
    public static void main(String[] args) {
        SimpleHashMap3<String,String> m = new
                SimpleHashMap3<>();
        m.put("wzh1","nub");
        m.put("wzh","nb");
        m.put("wzh2","hnb");
        m.remove("wzh");
        System.out.println(m);
        m.clear();
        System.out.println(m);
    }
}
