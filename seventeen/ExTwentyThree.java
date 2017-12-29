package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/27.
 */

import java.util.LinkedList;

/**
 * @author:Administrator
 * @date:2017/12/27
 * @description:
 */
class SimpleHashMap4<K,V> extends SimpleHashMap3<K,V> {
    @Override
    public int size(){
        int sz = 0;
        for(LinkedList<MapEntry<K,V>> bucket : buckets){
            if (bucket != null ){
                sz += bucket.size();
            }
        }
        return sz;
    }
    @Override
    public boolean isEmpty() {
// Could just say return size() == 0;
     for(LinkedList<MapEntry<K,V>> bucket : buckets)
        if(bucket != null) return false;
        return true;
    }
    @Override
    public boolean containsKey(Object key) {
        for(LinkedList<MapEntry<K,V>> bucket : buckets) {
        if(bucket == null) continue;
            for(MapEntry<K,V> mPair : bucket)
            if(mPair.getKey().equals(key)) return true;
    }
    return false;
}


}



public class ExTwentyThree {
    public static void main(String[] args) {
        SimpleHashMap4 <String,String> m = new SimpleHashMap4<>();
        m.put("wzh1","nub");
        m.put("wzh","nb");
        m.put("wzh2","hnb");
        System.out.println(m.size());
        System.out.println(m.containsKey("wzh"));
    }
}
