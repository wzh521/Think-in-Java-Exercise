package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/29.
 */

import com.wzh.thik.in.java.eleven.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * @author:Administrator
 * @date:2017/11/29
 * @description:
 */
class StoryCharacter  {
    private static long counter;
    private final long id = counter++;
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class GoodGuy extends StoryCharacter {
    @Override
    public String toString() {
    return super.toString() + " is a good guy";
}
}

class BadGuy extends StoryCharacter {
    @Override
    public String toString() {
    return super.toString() + " is a bad guy";
}
}

class Morton extends BadGuy {}


class Frank extends BadGuy {}

class Harmonica extends GoodGuy {}

class Cheyenne extends GoodGuy {}
class StroyCharacterGenerator implements Generator<StoryCharacter>,Iterable<StoryCharacter>{
    private int n;
    private Class[] types={Morton.class, Frank.class, Harmonica.class, Cheyenne.class};
    private Random random = new Random(47);
    public StroyCharacterGenerator(){}
    public StroyCharacterGenerator(int n){
        this.n=n;
    }
    @Override
    public StoryCharacter next() {
        try{
            return (StoryCharacter)types[random.nextInt(types.length)].newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<StoryCharacter> iterator() {
        return new Iterator<StoryCharacter>(){
            private int count=n;
            @Override
            public boolean hasNext() {
                return count>0;
            }

            @Override
            public StoryCharacter next() {
                count--;
                return StroyCharacterGenerator.this.next();
            }
        };
    }
}
public class ExEight {
    public static void main(String[] args) {
       StroyCharacterGenerator gen = new StroyCharacterGenerator();
        for(int i = 0; i < 7; i++){
            System.out.println(gen.next());
        }
        for(StoryCharacter p : new StroyCharacterGenerator(7)) {
            System.out.println(p);
        }
    }
}
