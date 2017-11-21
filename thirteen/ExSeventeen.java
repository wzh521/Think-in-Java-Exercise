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

public class ExSeventeen {
    static final String CMNT_EXT_REGEX =
            "(?x)(?m)(?s) # Comments, Multiline & Dotall: ON\n" + "/\\*	# Match START OF THE COMMENT\n" + "(.*?)	# Match all chars\n" +
                    "\\*/	# Match END OF THE COMMENT\n" + "| //(.*?)$	# OR Match C++ style comments\n";
    public static void main(String[] args) throws Exception { if(args.length < 1) {
        System.out.println(
                "Usage: java E17_JCommentExtractor file"); System.exit(0);
    }
//        String src = TextFile.read(args[0]);
//        Pattern p = Pattern.compile(CMNT_EXT_REGEX);
//        Matcher m = p.matcher(src);
//        while(m.find())
//            System.out.println(m.group(1) != null ?
//                m.group(1) : m.group(2));
    }
}
