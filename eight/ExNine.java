package com.wzh.thik.in.java.eight;/**
 * Created by Administrator on 2017/11/13.
 */

/**
 * @author:Administrator
 * @date:2017/11/13
 * @description:
 */
class NonSharedMember {
    public NonSharedMember(String id) {
        System.out.println("Non shared member constructor " + id);
    }
}

class SharedMember {
    private int refcount;


    public void addRef() {
        System.out.println("Number of references " + ++refcount);
    }
    protected void dispose() { if(--refcount == 0) {
        System.out.println("Disposing " + this);
    }
    }
    public SharedMember()  {
        System.out.println("Shared member constructor");
    }
    @Override
    public String toString() { return "Shared member"; }
}
class Member {
    public Member(String id) {
        System.out.println("Member constructor " + id);
    }
}
class Rodent{
    Member m1 = new Member("r1"), m2 = new Member("r2");
    private SharedMember sharedMember;
    NonSharedMember m11 = new NonSharedMember("r1"),
            m21 = new NonSharedMember("r2");
    Rodent(SharedMember sharedMember){
        System.out.println("Rodent Constructor");
        this.sharedMember =sharedMember;
        sharedMember.addRef();
    }
    Rodent(){
        System.out.println("Rodent constructor");
    }
    public void hop() { System.out.println("Rodent hopping"); }
    public void scurry() { System.out.println("Rodent scurrying"); }
    public void reproduce() { System.out.println("Making more Rodents"); }
    @Override
    public String toString() { return "Rodent"; }
    protected void dispose() {
        System.out.println("Disposing " + this);
        sharedMember.dispose();
    }
}
class Mouse extends Rodent {
    Member m1 = new Member("m1"), m2 = new Member("m2");


    private SharedMember sharedMember;
    NonSharedMember m11 = new NonSharedMember("m1"),
            m21 = new NonSharedMember("m2");
    Mouse(SharedMember sharedMember){
        super(sharedMember);
        System.out.println("Mouse constructor");
    }
    Mouse(){
        System.out.println("Mouse constructor");
    }
    @Override
    public void hop() { System.out.println("Mouse hopping"); }
    @Override
    public void scurry() { System.out.println("Mouse scurrying"); }
    @Override
    public void reproduce() { System.out.println("Making more Mice"); }
    @Override
    public String toString() { return "Mouse"; }
}

class Gerbil extends Rodent {
    private SharedMember sharedMember;
    NonSharedMember m11 = new NonSharedMember("g1"),
            m21 = new NonSharedMember("g2");
    Gerbil(SharedMember sharedMember){
        super(sharedMember);
        System.out.println("Gerbil constructor");

    }
    Gerbil(){
        System.out.println("Gerbil constructor");
    }
    Member m1 = new Member("g1"), m2 = new Member("g2");
    @Override
    public void hop() { System.out.println("Gerbil hopping"); }
    @Override
    public void scurry() { System.out.println("Gerbil scurrying"); }
    @Override
    public void reproduce() { System.out.println("Making more Gerbils"); }
    @Override
    public String toString() { return "Gerbil"; }
}

class Hamster extends Rodent {
    Member m1 = new Member("h1"), m2 = new Member("h2");
    private SharedMember sharedMember;
    NonSharedMember m11 = new NonSharedMember("g1"),
            m21 = new NonSharedMember("g2");

    Hamster(SharedMember sharedMember){
        super(sharedMember);
        System.out.println("Hamster constructor");

    }
    Hamster (){
        System.out.println("Hamster");
    }
    @Override
    public void hop() { System.out.println("Hamster hopping"); }
    @Override
    public void scurry() { System.out.println("Hamster scurrying"); }
    @Override
    public void reproduce() { System.out.println("Making more Hamsters"); }
    @Override
    public String toString() { return "Hamster"; }
}
public class ExNine {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster(),
        };


        for(Rodent r : rodents) {
            r.hop();
            r.scurry();
            r.reproduce();
            System.out.println(r);
        }
    }
}
