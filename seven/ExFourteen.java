package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/12.
 */

/**
 * @author:Administrator
 * @date:2017/11/12
 * @description:
 */
class Engine{
    public void start(){}
    public void rev(){}
    public void stop(){}
    public void service(){}
}
class Wheel{
    public void inflate(int psi){}
}
class Window{
    public void rollup(){}
    public void rolldown(){}
}
class Door{
   public Window window = new Window();
    public void open(){}
    public void close(){}
 }
 class Car{
    public Engine engine = new Engine();
    public Wheel[] wheels = new Wheel[4];
    public Door left = new Door(),right = new Door();
     public Car(){
         for (int i= 0 ;i<4;i++){
             wheels[i]=new Wheel();
         }
     }
}
public class ExFourteen {
    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheels[0].inflate(72);
        car.engine.service();
    }
}
