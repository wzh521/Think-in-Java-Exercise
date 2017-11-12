package com.wzh.thik.in.java.seven;

/**
 * Created by Administrator on 2017/10/21.
 */
public class CycleTest {
    static  void play(Cycle i){
        i.sout();
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        play(unicycle);
        Bicycle bicycle = new Bicycle();
        play(bicycle);
    }

}
class Cycle {
    public void sout(){
        System.out.println("cycle");
    }
}
class Unicycle extends Cycle{
    public void sout   (){
        System.out.println("unicyle");
    }
}
class Bicycle extends  Cycle{
    public void sout (){
        System.out.println("bicycle");
    }
}
