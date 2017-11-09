package com.wzh.thik.in.java.five;/**
 * Created by Administrator on 2017/11/9.
 */

/**
 * @author:Administrator
 * @date:2017/11/9
 * @description:
 */
class  Dog {
    public Dog (){
        System.out.println("dog say barking");
    }
    public Dog(int i){
        System.out.println("int dog say howling");
    }
    public Dog(double i){
        System.out.println("double dogs say ssss");
    }
    public Dog(int a ,double b){
        System.out.println("int double say ssss");
    }
    public Dog(double b ,int a){
        System.out.println("double int say sss");
    }
}
public class ExFive {
    public static void main(String[] args) {
        new Dog();
        new Dog(1);
        new Dog(1.1);
    }
}
