package com.drzk.utils;

public class StringUtils {
    /**
     * 判断是否为空
     * @param characters
     * @return
     */
    public static boolean isNullOrEempty(String characters){
        return "".equals(characters)||null==characters?true:false;

    }
}
