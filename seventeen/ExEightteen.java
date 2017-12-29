package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/18.
 */
import java.util.*;
/**
 * @author:Administrator
 * @date:2017/12/18
 * @description:
 */
class SlowSet<K> extends AbstractSet<K> {
    private List<K> keys = new ArrayList<K>();
    public boolean add(K key) {
    if(!contains(key)) { keys.add(key);
        return true;
    }
    return false;
}

    public Iterator<K> iterator() { return keys.iterator(); }
    public int size() { return keys.size(); }
}


public class ExEightteen {
    public static void main(String[] args) {
        SlowSet<String> slowSet = new SlowSet<String>();
        slowSet.addAll(Countries.names(10));
        slowSet.addAll(Countries.names(10));
        slowSet.addAll(Countries.names(10));
        System.out.println(slowSet);
    }
}
