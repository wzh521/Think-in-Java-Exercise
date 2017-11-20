package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */
class  VeryImportantException extends Exception{
    @Override
    public String toString(){
        return "A very import exception";
    }
}
class HoHumException extends Exception{
    @Override
    public String toString(){
        return "A trivialexception";
    }
}
class YetAnotherException extends Exception { public String toString() {
    return "Yet another exception";
}
}

class LostMessage2 {
    void f() throws VeryImportantException { throw new VeryImportantException();
    }
    void dispose() throws HoHumException { throw new HoHumException();
    }
    void cleanup() throws YetAnotherException { throw new YetAnotherException();
    }
}

public class ExEighteen {
    public static void main(String[] args) {
        try {
            LostMessage2 lm = new LostMessage2(); try {
                try {
                    lm.f();
                } finally { lm.dispose();
                }
            } finally { lm.cleanup();
            }
        } catch(Exception e) { System.out.println(e);
        }
    }
}
