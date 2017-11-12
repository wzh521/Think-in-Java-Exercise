package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/12.
 */

/**
 * @author:Administrator
 * @date:2017/11/12
 * @description:
 */
class WithFinals{
    private  final void f(){
        System.out.println("WithFinals.f()");
    }
    private  void g(){
        System.out.println("WithFinals.g()");
    }
}
class OverridingPrivateE20 extends WithFinals { 
   // @Override
    private final void f() {
    System.out.println("OverridingPrivateE20.f()");
}
  //  @Override
    private void g() {
        System.out.println("OverridingPrivateE20.g()");
    }
}

class OverridingPrivate2E20 extends OverridingPrivateE20 {
  //  @Override
    public final void f() {


    System.out.println("OverridingPrivate2E20.f()");
}
   // @Override
    public void g() { System.out.println("OverridingPrivate2E20.g()");
    }
}
public class ExTwenty {
    public static void main(String[] args) {
        OverridingPrivate2E20 op2 = new OverridingPrivate2E20();
        op2.f();
        op2.g();
    }

}
