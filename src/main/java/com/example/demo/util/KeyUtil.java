package com.example.demo.util;

import java.util.Random;

/**
 * @Author: zhouyh
 * @Date: 2018-03-25 21:43
 * @Description:
 */
public class KeyUtil {
    /**
     * 生成唯一逐渐
     * 格式:时间+随机数
     * @return
     */
    public static synchronized String getUniqueKey(){
        Random random=new Random();
        Integer number = random.nextInt(900000) + 100000;
        System.out.println(number);
        return System.currentTimeMillis()+number.toString();

    }

    public static void main(String[] args) {
        System.out.println(getUniqueKey());
    }


}
