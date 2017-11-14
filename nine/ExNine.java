package com.wzh.thik.in.java.nine;/**
 * Created by Administrator on 2017/11/14.
 */

/**
 * @author:Administrator
 * @date:2017/11/14
 * @description:
 */
enum Note{
    MIDDLE_C,C_SHARP,B_FLAT;
}
abstract class Instrument {
    public void play(Note n) {
    System.out.println(this + ".play() " + n);
    }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public abstract String toString();
}

class Wind extends Instrument {
    @Override
    public String toString() { return "Wind"; }
}

class Percussion extends Instrument {
    @Override
    public String toString() { return "Percussion"; }
}


class Stringed extends Instrument {
    @Override
    public String toString() { return "Stringed"; }
}

class Brass extends Wind {
    @Override
    public String toString() { return "Brass"; }
}

class Woodwind extends Wind {
    @Override
    public String toString() { return "Woodwind"; }
}
public class ExNine {
    static void tune(Instrument i) {
        i.adjust();
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for(Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(), new Stringed(), new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
