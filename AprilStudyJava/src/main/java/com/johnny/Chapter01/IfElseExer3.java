package com.johnny.Chapter01;

/**
 * Guten Tag!!! Fighting!Fighting!Fighting!
 *
 * @Author: JohnnyLin_CN
 * @Date: 2023/04/17/15:44
 * @Description:
 */
public class IfElseExer3 {
    public static void main(String[] args) {
        int small = 10;
        int big = 9;
        if (small > big){
            int temp = small;
            small = big;
            big = temp;
        }
        System.out.println("small=" + small + ",big=" + big);
    }
}
