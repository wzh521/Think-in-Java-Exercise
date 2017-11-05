package com.wzh.thik.in.java.third;/**
 * Created by Administrator on 2017/11/5.
 */

/**
 * @author:Administrator
 * @date:2017/11/5
 * @description:
 */

public class ExSix {
    static  void compare(Dog dog1 ,Dog dog2){
        System.out.println("== on top reference "+ (dog1 == dog2));
        System.out.println("equals on top reference "+(dog1.equals(dog2)));
        System.out.println("name == on top reference "+ (dog1.name == dog2.name));
        System.out.println("name equals on top reference "+(dog1.name.equals(dog2.name)));
        System.out.println("says == on top reference "+ (dog1.says == dog2.says));
        System.out.println("says equals on top reference "+(dog1.says.equals(dog2.says)));
    }

    public static void main(String[] args) {
        Dog dog1 =new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";
        Dog dog2 = new Dog();
        dog2.name = "scruffy";
        dog2.says = "Wurf!";
        Dog dog3 = dog1;
        Dog dog4 =new Dog();
        dog4.name = "spot";
        dog4.says = "Ruff!";
        System.out.println("Compare dog1 dog2");
        compare(dog1,dog2);
        System.out.println("Compare dog1 dog3");
        compare(dog1,dog3);
        System.out.println("Compare dog2 dog3");
        compare(dog2,dog3);
        System.out.println("Compare dog1 dog4");
        compare(dog1,dog4);
    }
}
