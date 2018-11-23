package b多线程;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class lock体系 {
    public static void main(String[] args) throws InterruptedException {
        //使用标准形式
        Lock lock = new ReentrantLock();
        try {
            lock.lock();
        } finally {
            lock.unlock();
        }

        //获取锁
        lock.lock();

        //要throws InterruptedException，获取锁的过程能够响应中断（lock独有）
        lock.lockInterruptibly();

        //获取锁返回true，反之返回false，可以响应中断
        lock.tryLock();

        //在上面的基础上增加了超市等待机制，规定时间内未获取锁，线程直接返回（lock独有）
        lock.tryLock(1000, TimeUnit.DAYS);

        //解锁
        lock.unlock();


    }
}
