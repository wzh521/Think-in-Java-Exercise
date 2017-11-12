package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/12.
 */

/**
 * @author:Administrator
 * @date:2017/11/12
 * @description:
 */
class WithBlankFinalField{
    private final Integer i;
    public WithBlankFinalField( int i1){
        i = new Integer(i1);
    }
    public Integer getI(){
//        if(i!=null){
//            i = new Integer(2);
//        }
        return i;
    }
}
public class ExNineteen {
    public static void main(String[] args) {
        WithBlankFinalField withBlankFinalField = new WithBlankFinalField(10);
        System.out.println(withBlankFinalField.getI());
    }
}
