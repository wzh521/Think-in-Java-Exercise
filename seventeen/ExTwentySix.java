package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/27.
 */
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.*;
/**
 * @author:Administrator
 * @date:2017/12/27
 * @description:
 */
class CountedString2 {
    private static List<String> created = new ArrayList<String>();
    private String s;
    private char c;
    private int id;
    public CountedString2(String str, char ci) { s = str;
        c = ci;
        created.add(s);

     for(String s2 : created)
        if(s2.equals(s)) id++;
    }
    @Override
    public String toString() {
        return "String: " + s + " id: " + id + " char: " + c + " hashCode(): " + hashCode();
    }
    public int hashCode() {
     int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;
        result = 37 * result + c;
        return result;
    }
    @Override
    public boolean equals(Object o) { return o instanceof CountedString2 &&
            s.equals(((CountedString2)o).s) && id == ((CountedString2)o).id &&
            c == ((CountedString2)o).c;
    }
}

public class ExTwentySix {
    public static void main(String[] args) {
        Map<CountedString2,Integer> map =
                new HashMap<CountedString2,Integer>();
        CountedString2[] cs = new CountedString2[5];
        for(int i = 0; i < cs.length; i++) {
            cs[i] = new CountedString2("hi", 'c'); map.put(cs[i], i);

        }
        System.out.println(map);
        for(CountedString2 cstring : cs) {
            System.out.println("Looking up " + cstring);
            System.out.println(map.get(cstring));
        }

    }
}
