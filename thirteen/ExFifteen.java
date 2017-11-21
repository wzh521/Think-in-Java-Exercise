package com.wzh.thik.in.java.thirteen;/**
 * Created by Administrator on 2017/11/21.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:Administrator
 * @date:2017/11/21
 * @description:
 */

public class ExFifteen {
    public static void main(String[] args) {
        if(args.length < 3) {
            System.out.println("Usage: java E15_JGrep2 file regex pattern"); System.out.println("pattern can take one of the following values"); System.out.println("CANON_EQ, CASE_INSENSITIVE, COMMENTS, " +
                    "DOTALL, MULTILINE, UNICODE_CASE, UNIX_LINES");
            System.exit(0);
        }
        int flag = 0; if(args[2].equalsIgnoreCase("CANON_EQ")) {
            flag = Pattern.CANON_EQ;
        } else
        if(args[2].equalsIgnoreCase("CASE_INSENSITIVE")) { flag = Pattern.CASE_INSENSITIVE;
        } else if(args[2].equalsIgnoreCase("COMMENTS")) { flag = Pattern.COMMENTS;
        } else if(args[2].equalsIgnoreCase("DOTALL")) { flag = Pattern.DOTALL;
        } else if(args[2].equalsIgnoreCase("MULTILINE")) { flag = Pattern.MULTILINE;
        } else if(args[2].equalsIgnoreCase("UNICODE_CASE")) { flag = Pattern.UNICODE_CASE;
        } else if(args[2].equalsIgnoreCase("UNIX_LINES")) { flag = Pattern.UNIX_LINES;
        }
        Pattern p = Pattern.compile(args[1], flag);
        int index = 0;
        Matcher m = p.matcher("");
//        for(String line : new TextFile(args[0])) { m.reset(line);
//            while(m.find())
//                System.out.println(index++ + ": " + m.group() + ": " + m.start());
//        }
    }
}
