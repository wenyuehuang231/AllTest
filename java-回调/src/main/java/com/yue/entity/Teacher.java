package com.yue.entity;

import com.yue.inter.Callback;
import com.yue.inter.Student;

/**
 * @author : Mr.Huang
 * @date : 2019/6/13 12:47
 */
public class Teacher implements Callback {
    private Student student;
    public Teacher(){}
    public Teacher(Student student) {
        this.student = student;
    }
    public void askQuestion() {
        student.resolveQuestion(this);
    }


    @Override
    public void tellAnswer(int answer) {
        System.out.println("知道了，你的答案是："+answer);
    }
}
