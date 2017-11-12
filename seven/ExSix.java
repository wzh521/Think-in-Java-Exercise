package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/12.
 */

/**
 * @author:Administrator
 * @date:2017/11/12
 * @description:
 */
class Game{
    public Game(int i){
        System.out.println("Game constructor");
    }
}
class BordGame extends Game{
    public BordGame(int i){
        super(i);
        System.out.println("BordGame constructor");
    }
}
class Chess extends BordGame {
    public Chess(){
       super(11);
        System.out.println("Chess construtor");
       // super(11);
    }
}

public class ExSix {
    public static void main(String[] args) {
        new Chess();
    }
}
