package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/3.
 */

import java.lang.reflect.Method;

/**
 * @author:Administrator
 * @date:2017/12/3
 * @description:
 */
//class SPet extends typeinfo.pets.Individual { public SPet(String name) { super(name); } public SPet() { super(); }
//    public void speak() { System.out.println(this + " speak");
//    }
//}
//
//class SRodent extends SPet {
//    public SRodent(String name) { super(name); } public SRodent() { super(); }
//}
//
//class SRat extends SRodent {
//    public SRat(String name) { super(name); } public SRat() { super(); }
//}
//
//class SPug extends SDog {
//    public SPug(String name) { super(name); } public SPug() { super(); }
//}
//
//class SMutt extends SDog {
//    public SMutt(String name) { super(name); } public SMutt() { super(); }
//}
//
//class SMouse extends SRodent {
//    public SMouse(String name) { super(name); } public SMouse() { super(); }
//}
//
//class SManx extends SCat {
//    public SManx(String name) { super(name); } public SManx() { super(); }
//}
//
//class SHamster extends SRodent {
//    public SHamster(String name) { super(name); } public SHamster() { super(); }
//}
//
//class SEgyptianMau extends SCat {
//    public SEgyptianMau(String name) { super(name); }
//
//
//    public SEgyptianMau() { super(); }
//}
//
//class SDog extends SPet {
//    public SDog(String name) { super(name); } public SDog() { super(); }
//}
//
//class SCymric extends SManx {
//    public SCymric(String name) { super(name); } public SCymric() { super(); }
//}
//
//class SCat extends SPet {
//    public SCat(String name) { super(name); } public SCat() { super(); }
//}
//
//public class E40_SpeakingPets {
//    public static void main(String[] args) throws Exception { List<SPet> pets = Arrays.asList(new SRat(), new SPug(),
//            new SMutt(), new SMouse(), new SManx(),
//            new SHamster(), new SEgyptianMau(), new SCymric()); Apply.apply(pets, SPet.class.getMethod("speak"));
//    }
//}
class Apply{
    public static <T,S extends Iterable<? extends T>>
    void apply(S seq, Method f ,Object... args){
        try{
            for(T t:seq){
                f.invoke(t,args);
            }
        }catch (Exception e){
            throw  new RuntimeException(e);
        }
    }
}
public class ExFourty {
}
