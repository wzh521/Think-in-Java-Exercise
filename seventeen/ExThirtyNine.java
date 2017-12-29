package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/29.
 */
import  java.util.*;
/**
 * @author:Administrator
 * @date:2017/12/29
 * @description:
 */
@SuppressWarnings("unchecked")
class SimpleHashMap7<K,V> extends SimpleHashMap<K,V> {
    private int count;
    private static final double loadFactor = 0.75;
    private final static int initialCapacity = 11;
    private int capacity = initialCapacity;
    private int threshold = (int) (capacity * loadFactor);

    {
        buckets = new LinkedList[capacity];
    }

    @Override
    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % capacity;
        if (buckets[index] == null)
            buckets[index] = new LinkedList<MapEntry<K, V>>();
        LinkedList<MapEntry<K, V>> bucket = buckets[index];
        MapEntry<K, V> pair = new MapEntry<K, V>(key, value);
        boolean found = false;
        ListIterator<MapEntry<K, V>> it = bucket.listIterator();
        while (it.hasNext()) {
            MapEntry<K, V> iPair = it.next();
            if (iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair);
                found = true;
                break;
            }
        }
        if (!found) {
            if (count >= threshold)
                rehash();
            if (buckets[index] == null)
                buckets[index] = new LinkedList<MapEntry<K, V>>();
            buckets[index].add(pair);
            ++count;
        }
        return oldValue;
    }

    private boolean isPrime(int candidate) {
        for (int j = 2; j < candidate; j++)
            if (candidate % j == 0)
                return false;
        return true;
    }

    private int nextPrime(int candidate) {
        while (!isPrime(candidate))
            candidate++;
        return candidate;
    }

    private void rehash() {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        capacity = nextPrime(capacity * 2);
        System.out.println(
                "Rehashing, new capacity = " + capacity);
        buckets = new LinkedList[capacity];
        threshold = (int) (capacity * loadFactor);
        count = 0;
        while (it.hasNext()) {
            Map.Entry<K, V> me = it.next();
            put(me.getKey(),
                    me.getValue());
        }
    }
}

public class ExThirtyNine {
    public static void main(String[] args) {
        SimpleHashMap7<String,String> m =
                new SimpleHashMap7<String,String>();
        m.put("wzh","1");
        m.put("wzh1","2");
        m.put("wzh2","3");
        System.out.println(m);
    }
}
