package com.yue;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * @author : Mr.Huang
 * @date : 2019/6/18 10:49
 */
@Slf4j
public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            arrayList.add(i);
        }

        Integer[] integers = new Integer[8];

        Integer[] integers1 = arrayList.toArray(integers);
        log.debug("第一次打印" + JSON.toJSONString(integers1));

        arrayList.clear();
        for (int i = 0; i < 3; i++) {
            arrayList.add(i);
        }
        integers1 = arrayList.toArray(integers);
        log.debug("第二次打印" + JSON.toJSONString(integers1));
    }
}
