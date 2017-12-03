package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/2.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Administrator
 * @date:2017/12/2
 * @description:
 */

public class ExTwentySeven {
    public static void main(String[] args) {
        // List<Number> nlist = new ArrayList<Integer>();
        // Wildcards allow covariance:
                List<? extends Number> nlist = new ArrayList<Integer>();
        // Compile Error: can't add any type of object:
        // nlist.add(new Integer(1));
        // nlist.add(new Float(1.0));
        // nlist.add(new Object());
        nlist.add(null); // Legal but uninteresting
        Number n = nlist.get(0);
            }
}
