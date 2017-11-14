package com.wzh.thik.in.java.nine;/**
 * Created by Administrator on 2017/11/14.
 */

/**
 * @author:Administrator
 * @date:2017/11/14
 * @description:
 */
interface Processor{
    String name();
    Object process(Object input);
}
class Waveform{
    private static long counter;
    private final long id = counter++;
    @Override
    public String toString(){
        return "Waveform "+id;
    }

}
class Apply{
    public static void process(Processor p ,Object s){
        System.out.println("Using Processor "+p.name());
        System.out.println(p.process(s));
    }
}
class CharacterPairSwapper{
    public static String reverse(String s){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        return stringBuilder.reverse().toString();
    }
}
class SwapperAdapter implements Processor {


    @Override
    public String name() {
        return CharacterPairSwapper.class.getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return CharacterPairSwapper.reverse((String)input);
    }
}
public class ExEleven {
    public static void main(String[] args) {
        SwapperAdapter swapperAdapter = new SwapperAdapter();
        Apply.process(swapperAdapter,"1234");
        Apply.process(swapperAdapter,"abc");

    }
}
