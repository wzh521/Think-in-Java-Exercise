 package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/27.
 */
import java.util.*;
/**
 * @author:Administrator
 * @date:2017/12/27
 * @description:
 */

public class SimpleHashMap<K,V> extends AbstractMap<K,V> {
    static final int SIZE = 997;
    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K,V>>[] buckets =
            new LinkedList[SIZE];

    @Override
    public V put(K key, V value){
        V oldValue = null;
        int index = Math.abs(key.hashCode())%SIZE;
        if(buckets[index] == null){
            buckets[index] = new LinkedList<>();
        }
        LinkedList<MapEntry<K,V>> bucket = buckets[index];
        MapEntry<K,V> pair = new MapEntry<K, V>(key,value);
        boolean found = false;
        ListIterator<MapEntry<K,V>> it = bucket.listIterator();
        while(it.hasNext()){
            MapEntry<K,V> iPair = it.next();
            if(iPair.getKey().equals(key)){
                oldValue = iPair.getValue();
                it.set(pair);
                found = true;
                break;
            }
        }
        if(!found){
            buckets[index].add(pair);

        }
        return oldValue;
    }
    @Override
    public V get(Object key){
        int index = Math.abs(key.hashCode())%SIZE;
        if(buckets[index] == null ){
            return null;
        }
        for(MapEntry<K,V> iPair : buckets[index]){
            if(iPair.getKey().equals(key)){
                return iPair.getValue();
            }
        }
        return null;
    }
    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Map.Entry<K,V>> set  =  new HashSet<>();
        for(LinkedList<MapEntry<K,V>> bucket : buckets){
            if(bucket == null){ continue; }
            for(MapEntry<K,V> mpair : bucket){
                set.add(mpair);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        SimpleHashMap<String,String> m = new SimpleHashMap<>();
        m.put("wzh1","nub");
        m.put("wzh","nb");
        m.put("wzh2","hnb");
        System.out.println(m);
        System.out.println(m.get("wzh"));
        System.out.println(m.entrySet());
    }
}
