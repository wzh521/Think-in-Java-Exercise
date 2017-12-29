package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/27.
 */
import  java.util.*;
/**
 * @author:Administrator
 * @date:2017/12/27
 * @description:
 */

class SimpleHashMap2<K,V> extends SimpleHashMap<K,V> {
    @Override
    public V put(K key, V value) {
    V oldValue = null;
    int index = Math.abs(key.hashCode()) % SIZE;
        MapEntry<K,V> pair = new MapEntry<K,V>(key, value);
        if(buckets[index] == null)

            buckets[index] = new LinkedList<MapEntry<K,V>>();

     else {
            int count = 0;
            System.out.println(
            "Collision while adding\n" + pair
                    + "\nBucket already contains:");
            Iterator<MapEntry<K,V>> it =
            buckets[index].iterator();
            while(it.hasNext()) {
                count++;
                System.out.println(it.next());
            }
            System.out.println(count);
}

    LinkedList<MapEntry<K,V>> bucket = buckets[index];
        boolean found = false;
    ListIterator<MapEntry<K,V>> it = bucket.listIterator();
        while(it.hasNext()) {
        MapEntry<K,V> iPair = it.next();
            if(iPair.getKey().equals(key)) { oldValue = iPair.getValue();


            it.set(pair);
                found = true;
            break;
        }
    }
    if(!found)
        buckets[index].add(pair);
    return oldValue;
}
}

public class ExTwenty {
    public static void main(String[] args) {
        SimpleHashMap2<String,String> m =
                new SimpleHashMap2<String,String>();
        m.put("wzh1","nub");
        m.put("wzh","nb");
        m.put("wzh2","hnb");
        m.put("wzh1","nub");
        m.put("wzh","nb");
        m.put("wzh2","hnb");
        System.out.println(m);
    }
}
