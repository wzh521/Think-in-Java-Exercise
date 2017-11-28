package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/27.
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * @author:Administrator
 * @date:2017/11/27
 * @description:
 */
class E17_ShowMethods2{
    private static String usage =
            "usage:\n" +
                    "E17_ShowMethods2 qualified.class.name\n" + "To show all methods in class or:\n" +
                    "E17_ShowMethods2 qualified.class.name word\n" + "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.|native\\s|final\\s");

    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }
        int lines = 0;
        try{
            Class<?>c =Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] constructors = c.getConstructors();
            if(args.length == 1){
                for(Method method : methods){
                    System.out.println(p.matcher(method.toString()).replaceAll(""));
                }
                for(Constructor constructor:constructors){
                    System.out.println(p.matcher(constructor.toString()).replaceAll(""));
                }
                lines = methods.length+constructors.length;
            }else{
                for(Method method:methods){
                    if(method.toString().indexOf(args[1])!= -1){
                        System.out.println(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                }
                for(Constructor constructor:constructors){
                    if(constructor.toString().indexOf(args[1])!= -1){
                        System.out.println(p.matcher(constructor.toString()).replaceAll(""));
                        lines++;
                    }
                }
            }
        }catch (ClassNotFoundException e){
            System.out.println("no find "+e);
        }
    }
}
public class ExSeventeen {

}
