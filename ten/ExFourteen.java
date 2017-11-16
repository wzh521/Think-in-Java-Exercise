package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * @author:Administrator
 * @date:2017/11/15
 * @description:
 */
interface Monster{
    void menace();
}

interface DangerousMonster extends Monster{
    void destroy();
}
interface Lethal{
    void kill();
}
interface Vampire extends DangerousMonster,Lethal{
    void drinkBlood();
}
class HorrorShow{
    static void u(Monster b){b.menace();}
    static void v(DangerousMonster d){
        d.menace();
        d.destroy();
    }
    static void w(Lethal l){l.kill();}
}
public class ExFourteen {


    public static void main(String[] args) {
        DangerousMonster dangerousMonster = new DangerousMonster() {
            @Override
            public void destroy() {

            }

            @Override
            public void menace() {

            }
        };
        HorrorShow.u(dangerousMonster);
        HorrorShow.v(dangerousMonster);
        Vampire vampire = new Vampire() {
            @Override
            public void drinkBlood() {

            }

            @Override
            public void destroy() {

            }

            @Override
            public void kill() {

            }

            @Override
            public void menace() {

            }
        };
        HorrorShow.u(vampire);
        HorrorShow.v(vampire);
        HorrorShow.w(vampire);

    }
}
