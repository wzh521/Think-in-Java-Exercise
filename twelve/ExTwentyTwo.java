package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */
class ConstructionException extends Exception {}
class FailingConstructor{
    FailingConstructor(boolean fail)
            throws ConstructionException {
        if(fail) throw new ConstructionException();
    }
}
public class ExTwentyTwo {
    public static void main(String[] args) {
        try {
            FailingConstructor failingConstructor = new FailingConstructor(true);
            try {
                System.out.println("Processing...");
            } finally { System.out.println("Cleanup...");
            }
        }catch (ConstructionException e){

        }
    }
}
