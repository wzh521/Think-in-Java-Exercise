package com.wzh.thik.in.java.eight;/**
 * Created by Administrator on 2017/11/13.
 */

import java.util.Random;

/**
 * @author:Administrator
 * @date:2017/11/13
 * @description:
 */
enum Note{
    MIDDLE_C,C_SHARP,B_FLAT;
}
class Instrument {
    void play(Note n) { System.out.println("Instrument.play() " + n); }
    @Override
    public String toString() { return "Instrument"; }


    void adjust() {}
}

class Wind extends Instrument {
    @Override
    void play(Note n) { System.out.println("Wind.play() " + n); }
    @Override
    public String toString () { return "Wind"; }
}

class Percussion extends Instrument {
    @Override
    void play(Note n) { System.out.println("Percussion.play() " + n); }
    @Override
    public String toString () { return "Percussion"; }
}

class Stringed extends Instrument {
    @Override
    void play(Note n) { System.out.println("Stringed.play() " + n); }
    @Override
    public String toString () { return "Stringed"; }
}

class Brass extends Wind {
    @Override
    void play(Note n) { System.out.println("Brass.play() " + n); }
    @Override
    void adjust() { System.out.println("Brass.adjust()"); }
}

class Woodwind extends Wind {
    @Override
    void play(Note n) { System.out.println("Woodwind.play() " + n); }
    @Override
    public String toString () { return "Woodwind"; }
}
class Electronic extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Electronic.play() " + n);
    }
    @Override
    public String toString() { return "Electronic"; }
}
class RandomInstrument{
    Random random = new Random(47);
    public Instrument getInstrument(){
        switch (random.nextInt(6)){
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new Electronic();
        }

    }
}
class  RandomInstrument2{
    Random random = new Random(47);
    Class<?>[] instruments = {
            Wind.class,
            Percussion.class,
            Stringed.class,
            Brass.class,
            Woodwind.class,
            Electronic.class
    };
    public Instrument getInstrument(){
        try {
            int id = Math.abs(random.nextInt(instruments.length));
            return (Instrument)instruments[id].newInstance();
        }catch (Exception e){
            throw new RuntimeException("Cannot create",e);
        }
    }
}
public class ExSix {
    static Instrument[] orchestra = {
            new Wind(),
            new Percussion(), new Stringed(), new Brass(),
            new Woodwind()
    };
    public static void printAll(Instrument[] orch) {
        for(Instrument i : orch) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printAll(orchestra);
    }
}
