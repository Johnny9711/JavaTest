package com.johnny.Chapter01;

/**
 * Guten Tag!!! Fighting!Fighting!Fighting!
 *
 * @Author: JohnnyLin_CN
 * @Date: 2023/04/17/10:01
 * @Description:
 */
public class IfElseTest4 {
    public static void main(String[] args) {
        int num1 = 23;
        int num2 = 32;
        int num3 = 12;


        if (num1 >= num2){

            if (num3 >= num1){
                System.out.println(num2 + "-" + num1 + "-" + num3);
            } else if (num3 <= num2) {
                System.out.println(num3 + "-" + num2 + "-" + num1);
            }else {
                System.out.println(num2 + "-" + num3 + "-" + num1);
            }
        }else {

            if (num3 >= num2){
                System.out.println(num1 + "-" + num2 + "-" + num3);
            } else if (num3 <= num1) {
                System.out.println(num3 + "-" + num1 + "-" + num2);
            }else {
                System.out.println(num1 + "-" + num3 + "-" + num2);
            }
        }
    }
}
