package com.yue;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;

/**
 * @author : Mr.Huang
 * @date : 2019/6/18 11:09
 */
@Slf4j
public class ArrayListTest3 {
    private static final int MAX_LENGTH = 10;

    public static void main(String[] args) {

        Integer[] integers = new Integer[MAX_LENGTH];
        for (int i = 0; i < 10; i++) {
            log.debug("第:{}轮的结果:{}", i, JSON.toJSONString(nextStage(integers)));
        }

    }

    /**
     * 下游接口使用了集合转数组，且保证前面集合元素都不为null
     */
    private static Integer[] nextStage(Integer[] integers) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int random = RandomUtils.nextInt(3, MAX_LENGTH);
        log.debug("随机数-->{}", random);
        for (int i = 0; i < random; i++) {
            arrayList.add(i);
        }
        return arrayList.toArray(integers);
    }
}
