package com.wzh.thik.in.java.nine;/**
 * Created by Administrator on 2017/11/14.
 */

/**
 * @author:Administrator
 * @date:2017/11/14
 * @description:
 */
interface Playable{
    void play(Note n);
}
interface Instrument2 {
    void adjust();
}
class Wind2 implements Instrument2, Playable {
    @Override
    public void play(Note n) {
    System.out.println(this + ".play() " + n);
    }
    @Override
    public String toString() { return "Wind"; }
    @Override
    public void adjust() { System.out.println(this + ".adjust()"); }
}

class Percussion2 implements Instrument2, Playable { 
    @Override
    public void play(Note n) {
    System.out.println(this + ".play() " + n);
}
    @Override
    public String toString() { return "Percussion"; }
    @Override
    public void adjust() { System.out.println(this + ".adjust()"); }
}

class Stringed2 implements Instrument2, Playable { 
    @Override
    public void play(Note n) {
    System.out.println(this + ".play() " + n);


}
    @Override
    public String toString() { return "Stringed"; } 
    @Override
    public void adjust() { System.out.println(this + ".adjust()"); }
}

class Brass2 extends Wind2 {
    @Override
    public String toString() { return "Brass"; }
}

class Woodwind2 extends Wind2 {
    @Override
    public String toString() { return "Woodwind"; }
}
public class ExTen {
    static void tune(Playable p) { p.play(Note.MIDDLE_C); }
    static void tuneAll(Playable[] e) {
        for(Playable p : e) {
            tune(p);
        }
    }

    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind2(),
                new Percussion2(), new Stringed2(), new Brass2(),
                new Woodwind2()
        };
        tuneAll(orchestra);
    }

}
