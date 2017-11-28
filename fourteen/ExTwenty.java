package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/27.
 */

/**
 * @author:Administrator
 * @date:2017/11/27
 * @description:
 */

public class ExTwenty {
    public static void display(String msg, Object[] vals) { System.out.println(msg);
        for(Object val : vals) System.out.println("	" + val);
    }
    public static void
    classInfo(Class<?> c) throws Exception { System.out.println("c.getName(): " + c.getName()); System.out.println("c.getPackage(): " + c.getPackage()); System.out.println("c.getSuperclass(): " + c.getSuperclass());
         display("c.getDeclaredClasses()",
        c.getDeclaredClasses()); display("c.getClasses()", c.getClasses()); display("c.getInterfaces()", c.getInterfaces());

            display("c.getDeclaredMethods()",
        c.getDeclaredMethods()); display("c.getMethods()", c.getMethods()); display("c.getDeclaredConstructors()",
                c.getDeclaredConstructors());


        display("c.getConstructors()", c.getConstructors()); display("c.getDeclaredFields()",
                c.getDeclaredFields()); display("c.getFields()", c.getFields()); if(c.getSuperclass() != null) {
            System.out.println("Base class: --------"); classInfo(c.getSuperclass());
        }
        System.out.println("End of " + c.getName());
    }
    public static void main(String[] args) throws Exception { for(String arg : args)
        classInfo(Class.forName(arg));
    }
}
