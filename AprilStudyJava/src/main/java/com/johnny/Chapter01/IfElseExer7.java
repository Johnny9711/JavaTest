package com.johnny.Chapter01;

/**
 * Guten Tag!!! Fighting!Fighting!Fighting!
 *
 * @Author: JohnnyLin_CN
 * @Date: 2023/04/17/15:53
 * @Description:
 */
public class IfElseExer7 {
    public static void main(String[] args) {
        int waterTemperature = 85;
        if(waterTemperature > 95){
            System.out.println("开水");
        }else if(waterTemperature > 70 && waterTemperature <= 95){
            System.out.println("热水");
        }else if(waterTemperature > 40 && waterTemperature <= 70){
            System.out.println("温水");
        }else{
            System.out.println("凉水");
        }
    }
}
