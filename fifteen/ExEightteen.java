package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/30.
 */

import com.wzh.thik.in.java.eleven.Generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author:Administrator
 * @date:2017/11/30
 * @description:
 */
class BigFish{
    private static long counter=1;
    private final long id = counter++;
    private BigFish(){}
    @Override
    public String toString(){
        return "BigFish "+id;
    }
    public static Generator<BigFish> generator= new Generator<BigFish> (){
        @Override
        public BigFish next() {
            return new BigFish();
        }
    };

}
class LittleFish{
    private static long counter=1;
    private final long id = counter++;
    private LittleFish(){}
    @Override
    public String toString(){
        return "LittleFish "+id;
    }
    public static Generator<LittleFish> generator= new Generator<LittleFish> (){
        @Override
        public LittleFish next() {
            return new LittleFish();
        }
    };

}
public class ExEightteen {
    public static void eat(BigFish bf, LittleFish lf) {
        System.out.println(bf + " eat " + lf);
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        List<LittleFish> list= new ArrayList<>();
        Generators.fill(list,LittleFish.generator,15);
        List<BigFish> list1 =new ArrayList<>();
        Generators.fill(list1,BigFish.generator,15);
        for(LittleFish lf : list) {
            eat(list1.get(random.nextInt(list1.size())), lf);
        }

    }
}
