package com.yue;

/**
 * @author : Mr.Huang
 * @date : 2019/6/17 15:34
 */
public class WhileTest {

    public static void main(String[] args) throws InterruptedException {
        int i  = 0;
        while (true){
            i++;
            if(i == 10){
                System.out.println(i);
            }
            if(i == Integer.MAX_VALUE){
                System.out.println("max");
            }
        }
    }
}