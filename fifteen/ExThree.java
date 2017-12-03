package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/29.
 */

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @author:Administrator
 * @date:2017/11/29
 * @description:
 */
class TwoTuple<A,B>{
    public final A first;
    public final B second;
    public TwoTuple(A first,B second){
        this.first=first;
        this.second=second;
    }
    @Override
    public String toString(){
        return "first "+first+"second "+second;
    }
}
class ThreeTuple<A,B,C>extends TwoTuple<A,B>{
    public final C third;
    public ThreeTuple(A first,B second ,C third){
        super(first,second);
        this.third=third;
    }
    @Override
    public String toString(){
        return "first "+first+"second "+second +"third "+third;
    }
}
class FourTuple<A,B,C,D>extends ThreeTuple<A,B,C>{
    public final D four;
    public FourTuple(A first,B second ,C third, D four){
        super(first,second,third);
        this.four=four;
    }
    @Override
    public String toString(){
        return "first "+first+"second "+second +"third "+third+" four "+four;
    }
}
class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D>{
    public final E five;
    public FiveTuple(A first,B second ,C third, D four,E five){
        super(first,second,third,four);
        this.five =five;
    }
    @Override
    public String toString(){
        return "first "+first+"second "+second +"third "+third+" four "+four + " five "+five;
    }
}
class SixTuple<A,B,C,D,E,F>extends FiveTuple<A,B,C,D,E>{
    public final F six;
    public SixTuple(A first,B second ,C third, D four,E five,F six){
        super(first,second,third,four,five);
        this.six=six;
    }
    @Override
    public String toString(){
        return "first "+first+"second "+second +"third "+third+" four "+four + " five "+five
                +" six "+six;
    }
}
public class ExThree {
    static SixTuple<String,Integer,Double,Long,Byte,String> f(){
        return new SixTuple<String,Integer,Double,Long,Byte,String>("a",1,10.0,1L,(byte)1,"b");
    }

    public static void main(String[] args) {
        System.out.println(f());
    }

}
