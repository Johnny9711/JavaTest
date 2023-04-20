package com.johnny.Chapter01;

/**
 * Guten Tag!!! Fighting!Fighting!Fighting!
 *
 * @Author: JohnnyLin_CN
 * @Date: 2023/04/17/9:56
 * @Description:
 */
public class IfElseTest3 {
    public static void main(String[] args) {
        int score = 20;
        
//        if (score == 100){
//            System.out.println("奖励一辆跑车");
//        } else if (score > 80 && score <= 99) {
//            System.out.println("奖励一辆山地自行车");
//        } else if (score >= 60 && score <= 80) {
//            System.out.println("奖励环球影城一日游");
//        }else {
//            System.out.println("胖揍一顿");
//        }


        if(score == 100){
            System.out.println("奖励一辆跑车");
        }else if(score > 80){
            System.out.println("奖励一辆山地自行车");
        }else if(score >= 60){
            System.out.println("奖励环球影城玩一日游");
        }else{
            System.out.println("胖揍一顿");
        }
    }
}
