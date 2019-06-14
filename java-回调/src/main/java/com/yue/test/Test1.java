package com.yue.test;

import com.yue.entity.Teacher;
import com.yue.entity.Tim;
import com.yue.inter.Student;
import org.junit.Test;

/**
 * @author : Mr.Huang
 * @date : 2019/6/13 13:01
 */
public class Test1 {
    @Test
    public void testCallback() {
        Student student = new Tim();
        Teacher teacher = new Teacher(student);
        teacher.askQuestion();
    }
}
