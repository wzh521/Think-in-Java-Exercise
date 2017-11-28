package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/22.
 */

/**
 * @author:Administrator
 * @date:2017/11/22
 * @description:
 */
class Candy {
    static { System.out.println("Loading Candy"); }
}

class Gum {
    static { System.out.println("Loading Gum"); }
}

class Cookie {
    static { System.out.println("Loading Cookie"); }
}
public class ExSeven {
    public static void main(String[] args) throws ClassNotFoundException {
        for(String arg : args)
            Class.forName(arg);
    }

}
