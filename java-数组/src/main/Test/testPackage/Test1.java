package testPackage;

import com.yue.ArrayLRU;
import com.yue.ShuZu;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Mr.Huang
 * @date : 2019/7/17 9:41
 */
public class Test1 {
    @Test
    public void test1() {
        ShuZu shuZu = new ShuZu(5);
        shuZu.add(0,0);
        shuZu.add(1,1);
        shuZu.add(2,2);
        shuZu.add(3,3);
        shuZu.add(4,4);
        shuZu.add(2,5);
    }

    @Test
    public void test2() {
        ArrayLRU arrayLRU = new ArrayLRU(5);
        arrayLRU.add(11);
        arrayLRU.add(22);
        arrayLRU.add(11);
        arrayLRU.add(33);
        arrayLRU.add(44);
        arrayLRU.add(22);
        arrayLRU.add(55);
        arrayLRU.add(66);
        arrayLRU.add(33);
        System.out.println(arrayLRU.toString());
    }

    @Test
    public void test3() {
        List arrayList = new ArrayList(5);
        arrayList.add(1);
        arrayList.add(2);

    }
}
