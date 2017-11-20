package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */
class FailingConstructor3 {
    private final WithDispose wd1, wd2; FailingConstructor3(boolean fail)
            throws ConstructionException { wd1 = new WithDispose(1);
        try {
         if(fail) throw new ConstructionException();
        } catch(ConstructionException e) { wd1.dispose();
            throw e;
        }
        wd2 = new WithDispose(2);
    }
    void dispose() { wd2.dispose(); wd1.dispose();
    }
}
public class TwentyFour {
    public static void main(String[] args) {
        for(boolean b = false; ; b = !b)
            try {
            System.out.println("Constructing...");
            FailingConstructor3 fc = new FailingConstructor3(b);
            try {


                System.out.println("Processing...");
            } finally { System.out.println("Cleanup...");
                fc.dispose();
            }
        } catch(ConstructionException e) { System.out.println("Construction has failed: " + e);
                break;
        }
    }
}
