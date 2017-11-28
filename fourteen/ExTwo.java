package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/22.
 */

/**
 * @author:Administrator
 * @date:2017/11/22
 * @description:
 */
interface HasCPU {}

class FancierToy extends FancyToy implements HasCPU {}
public class ExTwo {
    public static void main(String[] args) {
        Class c= null;
        try{
            c=Class.forName("com.wzh.thik.in.java.fourteen.FancierToy");
        }catch (Exception e){
            System.out.println("Cant find FancierToy");
        }
        ToyTest.printInfo(c);
        for(Class face : c.getInterfaces()){
            ToyTest.printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj =null;
        try{
            obj=up.newInstance();
        }catch (Exception e){
            System.out.println("Can not instance");
        }
        ToyTest.printInfo(obj.getClass());
    }
}
