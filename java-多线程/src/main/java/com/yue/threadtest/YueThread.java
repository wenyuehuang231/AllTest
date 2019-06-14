package com.yue.threadtest;

/**
 * @author : Mr.Huang
 * @date : 2019/6/14 10:56
 */
public class YueThread implements Runnable{
    private static int count;

    public YueThread() {
        count = 0;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        YueThread yueThread = new YueThread();
        Thread thread1 = new Thread(yueThread, "yueThread1");
        Thread thread2 = new Thread(yueThread, "yueThread2");
        thread1.start();
        thread2.start();
    }
}
