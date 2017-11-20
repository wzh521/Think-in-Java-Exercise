package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */

public class ExNineTeen {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException { throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage2 lm = new LostMessage2();
            try {
                lm.f();
            } finally {
                try {
                lm.dispose();
            } catch(HoHumException e) { System.out.println(e);
            }
            }
        } catch(Exception e) { System.out.println(e);
        }
    }
}
