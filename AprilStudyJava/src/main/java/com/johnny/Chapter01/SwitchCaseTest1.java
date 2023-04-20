package com.johnny.Chapter01;

/**
 * Guten Tag!!! Fighting!Fighting!Fighting!
 *
 * @Author: JohnnyLin_CN
 * @Date: 2023/04/17/16:32
 * @Description:
 */
public class SwitchCaseTest1 {
    public static void main(String[] args) {
        int num = 1;
        switch (num){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
