package com.johnny.Chapter01;

/**
 * Guten Tag!!! Fighting!Fighting!Fighting!
 *
 * @Author: JohnnyLin_CN
 * @Date: 2023/04/17/9:51
 * @Description:
 */
public class IfElseTest1 {
    public static void main(String[] args) {
        int heartBeats = 120;

        if (heartBeats < 60 || heartBeats > 100){
            System.out.println("你需要做进一步的检查");
        }

        System.out.println("体检结束");
    }
}
