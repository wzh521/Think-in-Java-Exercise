package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/28.
 */

/**
 * @author:Administrator
 * @date:2017/11/28
 * @description:
 */
interface Instrument { void play();
    String what(); void adjust();
    void prepareInstrument();
}

class Wind implements Instrument {
    public void play() { System.out.println("Wind.play()"); } public String what() { return "Wind"; } public void adjust() {}
    public void clearSpitValve() { System.out.println("Wind.clearSpitValve");
    }
    public void prepareInstrument() { clearSpitValve();
    }
}

class Percussion implements Instrument {
    public void play() { System.out.println("Percussion.play()"); } public String what() { return "Percussion"; } public void adjust() {}
    public void prepareInstrument() { System.out.println("Percussion.prepareInstrument");
    }
}

class Stringed implements Instrument {
    public void play() { System.out.println("Stringed.play()"); } public String what() { return "Stringed"; } public void adjust() {}
    public void prepareInstrument() { System.out.println("Stringed.prepareInstrument");
    }
}
class Brass extends Wind {
    public void play() { System.out.println("Brass.play()"); } public void adjust() { System.out.println("Brass.adjust()"); } public void clearSpitValve() {
        System.out.println("Brass.clearSpitValve");
    }
}

class Woodwind extends Wind {
    public void play() { System.out.println("Woodwind.play()"); } public String what() { return "Woodwind"; } public void clearSpitValve() {
        System.out.println("Woodwind.clearSpitValve");
    }
}

class Music5 {
    static void tune(Instrument i) {
// ...
        i.play();
    }
    static void tuneAll(Instrument[] e) { for(Instrument instrument : e)
        tune(instrument);
    }
    static void prepareAll(Instrument[] e) { for(Instrument instrument : e)
        instrument.prepareInstrument();
    }
}

public class ExTwentySix {
    public static void main(String[] args) {
        Instrument[] orchestra = {
            new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(),
    };
        Music5.prepareAll(orchestra); Music5.tuneAll(orchestra);
    }
}
