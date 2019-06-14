package t;

import com.yue.threadtest.YueThread;
import org.junit.Test;

/**
 * @author : Mr.Huang
 * @date : 2019/6/14 11:11
 */
public class t {
    @Test
    public void t1() {
        YueThread yueThread = new YueThread();
        Thread thread1 = new Thread(yueThread, "yueThread1");
        Thread thread2 = new Thread(yueThread, "yueThread2");
        thread1.start();
        thread2.start();
    }
}
