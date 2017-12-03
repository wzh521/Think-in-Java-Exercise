package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/30.
 */

import com.wzh.thik.in.java.eleven.Generator;

/**
 * @author:Administrator
 * @date:2017/11/30
 * @description:
 */
class BaseGenerator<T>implements Generator<T>{
    private Class<T> type;
    public BaseGenerator(Class<T> type){
        this.type=type;
    }
    @Override
    public T next() {
        try{
            return type.newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public static <T> Generator<T> create(Class<T> type){
        return new BaseGenerator<T>(type);
    }
}
class CountedObject{
    private static long counter=0;
    private final long id = counter++;
    public long id(){ return id; }
    @Override
    public String toString(){
        return "CountedObject " + id;
    }
}
public class ExFourteen {
    public static void main(String[] args) {
        Generator<CountedObject> gen =
                BaseGenerator.create(CountedObject.class);
        for(int i=0; i<5; i++){
            System.out.println(gen.next());
        }
        Generator<CountedObject> generator =
                new BaseGenerator<>(CountedObject.class);
        for(int i=0; i<5; i++){
            System.out.println(generator.next());
        }
    }
}
