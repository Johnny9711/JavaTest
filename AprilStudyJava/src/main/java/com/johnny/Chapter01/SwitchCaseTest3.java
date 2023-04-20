package com.johnny.Chapter01;

/**
 * Guten Tag!!! Fighting!Fighting!Fighting!
 *
 * @Author: JohnnyLin_CN
 * @Date: 2023/04/17/16:41
 * @Description:
 */
public class SwitchCaseTest3 {
    public static void main(String[] args) {
        int score = 67;
        switch(score / 60) {
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
            default:
                System.out.println("输入的成绩有误");
                break;
        }
    }
}
