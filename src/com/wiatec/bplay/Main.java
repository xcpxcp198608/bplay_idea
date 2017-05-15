package com.wiatec.bplay;

import com.wiatec.bplay.utils.AESUtil;

/**
 * Created by xuchengpeng on 12/05/2017.
 */
public class Main {

    public static void main (String [] args){
        String s1 = AESUtil.encrypt("www.baidu.com",AESUtil.key);
        System.out.println(s1);
        String s2 = AESUtil.decrypt(s1,AESUtil.key);
        System.out.println(s2);
    }

}
