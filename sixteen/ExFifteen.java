package com.wzh.thik.in.java.sixteen;/**
 * Created by Administrator on 2017/12/4.
 */

import com.wzh.thik.in.java.eleven.Generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:Administrator
 * @date:2017/12/4
 * @description:
 */
class BSGenerator implements Generator<BerylliumSphere> { public BerylliumSphere next() {
    return new BerylliumSphere();
}
}
public class ExFifteen {
    public static void main(String[] args) {
        BSGenerator gen = new BSGenerator(); 
        BerylliumSphere[] spheres = Generated.array(
                BerylliumSphere.class, gen, 5);
        System.out.println(Arrays.toString(spheres)); 
        System.out.println(spheres[4]);

        List<BerylliumSphere> sphereList = Arrays.asList( Generated.array(BerylliumSphere.class, gen, 5));
        System.out.println(sphereList); 
        System.out.println(sphereList.get(4));

        int[] integers = { 0, 1, 2, 3, 4, 5 }; 
        System.out.println(Arrays.toString(integers));
        System.out.println(integers[4]);

        List<Integer> intList = new ArrayList<Integer>( Arrays.asList(0, 1, 2, 3, 4, 5));
        intList.add(97); 
        System.out.println(intList); 
        System.out.println(intList.get(4));
    }
}
