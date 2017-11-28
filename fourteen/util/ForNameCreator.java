package com.wzh.thik.in.java.fourteen.util;/**
 * Created by Administrator on 2017/11/27.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Administrator
 * @date:2017/11/27
 * @description:
 */

public class ForNameCreator extends PetCreator {
    private static List<Class<?extends Pet>> types =
            new ArrayList<>();
    private static String[] typeNames={};
    @SuppressWarnings("unchecked")
    private static void loder(){
        try{
            for(String name: typeNames){
                types.add((Class<?extends Pet>)Class.forName(name));
            }
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    static{ loder();}

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
