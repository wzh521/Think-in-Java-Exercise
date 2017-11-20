package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */
class Level1Exception extends Exception {}
class Level2Exception extends Level1Exception {} class Level3Exception extends Level2Exception {}

class A {
    public void f() throws Level1Exception { throw new Level1Exception();
    }
}


class B extends A {
    @Override
    public void f() throws Level2Exception { throw new Level2Exception();
    }
}

class C extends B {
    @Override
    public void f() throws Level3Exception { throw new Level3Exception();
    }
}
public class ExTwentyFive {
    public static void main(String[] args) {
        A a = new C();
        try{
            a.f();
        }catch (Level1Exception e){

        }
    }
}
