package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/18.
 */
import java.util.*;
/**
 * @author:Administrator
 * @date:2017/11/18
 * @description:
 */
class Counter{
    int i=1;
    @Override
    public String toString(){
        return Integer.toString(i);
    }
}
class HistoUnit implements Comparable<HistoUnit>{
    Counter counter;
    public int val;
    HistoUnit(Counter counter ,int val){
        this.counter=counter;
        this.val =val;
    }
    @Override
    public int compareTo(HistoUnit o) {
        int val1=o.val;
        int val2=val;
        return (val1<val2?-1:((val1==val1)?0:1));
    }
    @Override
    public String toString() { return "Value = " + val
            + ", Occurrences = " + counter.i + "\n";
    }
}
public class ExTwentyThree {
    private static Random rand = new Random(47);
    public static void main(String[] args) {
        Map<Integer, Counter> m =
                new HashMap<Integer, Counter>(); for(int i = 0; i < 10000000; i++) {
            int r = rand.nextInt(100);
            if(m.containsKey(r))
                m.get(r).i++;
            else
                m.put(r, new Counter());
        }
        List<HistoUnit> lst = new ArrayList<HistoUnit>(); Iterator<Map.Entry<Integer, Counter>> it =
                m.entrySet().iterator(); while(it.hasNext()) {


            Map.Entry<Integer, Counter> entry = it.next(); lst.add(new HistoUnit(
                    entry.getValue(), entry.getKey()));
        }
        Collections.sort(lst); System.out.println("lst = " + lst);
    }
}
