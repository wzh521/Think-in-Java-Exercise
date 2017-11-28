package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/22.
 */

/**
 * @author:Administrator
 * @date:2017/11/22
 * @description:
 */
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
class Toy {
    Toy(){}
    //Toy(){}
    Toy(int i){}
}
class FancyToy extends Toy
implements HasBatteries,Waterproof,Shoots{
    FancyToy(){
        super(1);
    }
}
class ToyTest{
    static void printInfo(Class cc){
        System.out.println("Class name: "+cc.getName()+
        "is interface"+cc.isInterface());
        System.out.println("Simple name: "+cc.getSimpleName());
        System.out.println("Canonical name : "+cc.getCanonicalName());
    }
}
public class ExOne {
    public static void main(String[] args) {
        Class c= null;
        try{
            c=Class.forName("com.wzh.thik.in.java.fourteen.FancyToy");
        }catch (Exception e){
            System.out.println("Cant find Fancytoy");
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
