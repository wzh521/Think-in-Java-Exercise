package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/27.
 */

import java.util.Comparator;

/**
 * @author:Administrator
 * @date:2017/12/27
 * @description:
 */

public class Individual implements Comparable<Individual> {
    private static long counter = 0;
    private final long id  = counter ++;
    private String name;
    public Individual(String name ){ this.name = name;}
    public Individual(){}
    @Override
    public String toString(){
        return getClass().getSimpleName() + (name == null ? "" : "" + name);
    }
    public long id(){
         return id;
    }
    @Override
    public boolean equals(Object o ){
        return o instanceof  Individual && id == ((Individual)o).id;
    }
    public int hashCode(){
        int result = 17;
        if(name != null){
            result = 37 *result + name.hashCode();
        }
        result = 37* result+ (int)id;
        return result;
    }


    @Override
    public int compareTo(Individual arg) {
        String first = getClass().getSimpleName();
        String argFirst = arg.getClass().getSimpleName();
        int firstCompare = first.compareTo(argFirst);
        if(firstCompare!=0){
            return firstCompare;
        }
        if(name !=null && arg.name !=null){
            int secondCompare = name.compareTo(arg.name);
            if(secondCompare != 0){
                return secondCompare;
            }
        }
        return (arg.id < id ? -1 : (arg.id == id ?0:1));
    }
}
