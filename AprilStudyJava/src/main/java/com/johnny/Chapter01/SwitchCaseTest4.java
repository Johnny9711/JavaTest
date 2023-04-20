package com.johnny.Chapter01;

import java.util.Scanner;

/**
 * Guten Tag!!! Fighting!Fighting!Fighting!
 *
 * @Author: JohnnyLin_CN
 * @Date: 2023/04/17/17:10
 * @Description:
 */
public class SwitchCaseTest4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入2023年的month：");
        int month = scan.nextInt();

        System.out.println("请输入2023年的day：");
        int day = scan.nextInt();

        int sumDays = 0;

        switch (month){
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }

        System.out.println(month + "月" + day + "日是2023年的第" + sumDays + "天");
        scan.close();
    }
}
