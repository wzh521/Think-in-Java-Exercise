package com.wzh.thik.in.java.second;/**
 * Created by Administrator on 2017/11/4.
 */

/**
 * @author:Administrator
 * @date:2017/11/4
 * @description:
 */

public class ExTen {
    public static void main(String[] args) {
       /* 没有足够的命令行参数抛出异常
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);*/
         if(args.length < 3) {
             System.err.println("Need 3 arguments");
             /*
               System.exit（）终止程序并将其参数作为状态码传递回操作系统。
                （对于大多数操作系统，非零状态代码表示程序执行失败。）
                通常，您将错误消息发送到System.err
              */
             System.exit(1);
        }
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
