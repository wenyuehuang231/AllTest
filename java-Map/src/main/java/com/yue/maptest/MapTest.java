package com.yue.maptest;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Mr.Huang
 * @date : 2019/6/28 16:45
 */
public class MapTest {
    @Test
    public void test1(){
        Map<Integer, String> map1 = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map1.put(i, i+"个");
        }
    }
}
