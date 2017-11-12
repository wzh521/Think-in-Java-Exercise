package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/12.
 */

/**
 * @author:Administrator
 * @date:2017/11/12
 * @description:
 */
class SelfCounter{
    private static int count;
    private int id = count++;
    @Override
    public String toString()
    { return "SelfCounter " + id; }
}
class WithFinalFields {
    final SelfCounter scf = new SelfCounter();
    static final SelfCounter scsf = new SelfCounter();
    @Override
    public String toString() {
        return "scf = " + scf + "\nscsf = " + scsf;
    }
}
public class ExEightteen {
    public static void main(String[] args) {
        System.out.println("First object:");
        System.out.println(new WithFinalFields());
        System.out.println("Second object:");
        System.out.println(new WithFinalFields());
    }

}
