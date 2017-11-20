package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */
class WithDispose { private final int id;
    WithDispose(int id) { this.id = id; }
    void dispose() {
        System.out.println("WithDispose.dispose(): " + id);
    }
}
class FailingConstructor2 {
    private final WithDispose wd1, wd2;
    FailingConstructor2(boolean fail)
            throws ConstructionException {
        wd1 = new WithDispose(1);
        try {
     if(fail) throw new ConstructionException();
        } catch(ConstructionException e) {
            wd1.dispose();
            throw e;
        }
        wd2 = new WithDispose(2);
    }
}
public class ExTwentyThree {
    public static void main(String[] args) {
        for(boolean b = false; ; b = !b) try {
            System.out.println("Constructing...");
            FailingConstructor2 fc = new FailingConstructor2(b);
            try {
                System.out.println("Processing...");
            } finally {
             System.out.println("Cleanup...");
            }
        } catch(ConstructionException e) { System.out.println("Construction has failed: " + e);
            break;
        }

    }

}
