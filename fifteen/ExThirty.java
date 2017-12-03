package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/2.
 */

/**
 * @author:Administrator
 * @date:2017/12/2
 * @description:
 */

public class ExThirty {
    public static void main(String[] args) {
        Holder1<Integer> hi = new Holder1<Integer>();
        hi.set(1);
        int i = hi.get(); System.out.println(i == 1);
        Holder1<Byte> hb = new Holder1<Byte>(); hb.set((byte)1);
        byte b = hb.get(); System.out.println(b == 1);
        Holder1<Short> hs = new Holder1<Short>(); hs.set((short)1);
        short s = hs.get(); System.out.println(s == 1);
        Holder1<Long> hl = new Holder1<Long>(); hl.set(1L);
        long l = hl.get(); System.out.println(l == 1);
        Holder1<Float> hf = new Holder1<Float>(); hf.set(1.0F);
        float f = hf.get(); System.out.println(f == 1.0F);
        Holder1<Double> hd = new Holder1<Double>(); hd.set(1.0);
        double d = hd.get(); System.out.println(d == 1.0);
        Holder1<Character> hc = new Holder1<Character>(); hc.set('A');
        char c = hc.get(); System.out.println(c == 'A');


        Holder1<Boolean> hbool = new Holder1<Boolean>(); hbool.set(true);
        boolean bool = hbool.get(); System.out.println(bool);
    }
}
