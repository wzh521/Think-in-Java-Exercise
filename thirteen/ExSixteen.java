package com.wzh.thik.in.java.thirteen;/**
 * Created by Administrator on 2017/11/21.
 */

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:Administrator
 * @date:2017/11/21
 * @description:
 */

public class ExSixteen {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println(


                    "Usage: java E16_JGrep3 file regex"); System.exit(0);
        }
        File file = new File(args[0]); File[] files = null;
        if(file.isDirectory()) files = file.listFiles(); else files = new File[]{new File(args[0])};
        Pattern p = Pattern.compile(args[1]);
        Matcher m = p.matcher(""); for(File f : files) {
            System.out.println("-- File:" + f.getName() + "--");
              int index = 0;
//            for(String line : new TextFile(f.getAbsolutePath())) { m.reset(line);
//                while(m.find()) System.out.println(index++ + ": " +
//                        m.group() + ": " + m.start());
//            }
        }
    }
}
