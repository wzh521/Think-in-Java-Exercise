package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/18.
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author:Administrator
 * @date:2017/11/18
 * @description:
 */
class Command {
    public String s ="sss";
    Command(String cmd) { s = cmd; }
    public void operation(){
        System.out.println("s "+s);
    }
}
class Producer {
    public static void produce(Queue<Command> q) {
        q.offer(new Command("load"));
        q.offer(new Command("delete"));
        q.offer(new Command("save"));
        q.offer(new Command("exit"));
    }
}
class Consumer {
    public static void consume(Queue<Command> q) {
        while(q.peek() != null)
        q.remove().operation();
    }
}
public class ExTwentySeven {
    public static void main(String[] args) {
        Queue<Command> cmds = new LinkedList<Command>(); Producer.produce(cmds);
        Consumer.consume(cmds);
    }
}
