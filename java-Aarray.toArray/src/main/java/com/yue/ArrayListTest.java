package com.yue;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;


/**
 * @author : Mr.Huang
 * @date : 2019/6/18 10:13
 */
@Slf4j
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListTest = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            arrayListTest.add(i);
        }
        Integer[] integers = new Integer[8];
        Integer[] integers1 = arrayListTest.toArray(integers);
        log.debug(JSON.toJSONString(integers1));
        System.out.println(JSON.toJSONString(integers1));
    }
}
