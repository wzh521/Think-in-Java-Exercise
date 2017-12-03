package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/2.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @author:Administrator
 * @date:2017/12/2
 * @description:
 */
class FactoryCapture {
    Map<String,FactoryI<?>> factories =
        new HashMap<String,FactoryI<?>>();
    public Object createNew(String factoryname, int arg) {
        FactoryI<?> f = factories.get(factoryname);
        try {
            return f.create(arg);
        } catch(NullPointerException e) {
            System.out.println("Not a registered factoryname: " + factoryname);


            return null;
        }
    }
    public void
    addFactory(String factoryname, FactoryI<?> factory) { factories.put(factoryname, factory);
    }
}
public class ExTwentyFour {
    public static void main(String[] args) {
        FactoryCapture fc = new FactoryCapture();
        fc.addFactory("Integer", new IntegerFactory());
        fc.addFactory("Widget", new Widget.Factory());
        System.out.println(fc.createNew("Integer", 1));
        System.out.println(fc.createNew("Widget", 2));
        fc.createNew("Product", 3);
    }
}
