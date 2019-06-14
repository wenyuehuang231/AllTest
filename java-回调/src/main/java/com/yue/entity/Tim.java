package com.yue.entity;

import com.yue.inter.Callback;
import com.yue.inter.Student;

/**
 * @author : Mr.Huang
 * @date : 2019/6/13 12:47
 */
public class Tim implements Student {
    @Override
    public void resolveQuestion(Callback callback) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        callback.tellAnswer(3);
    }
}
