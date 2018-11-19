package b多线程;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

class MyLock implements Lock{
    Sync sync = new Sync();
    static class Sync extends AbstractQueuedSynchronizer{
        @Override
        //获取锁
        protected boolean tryAcquire(int arg) {
            if (arg != 1){
                throw new RuntimeException("arg不为1！");
            }
            if (compareAndSetState(0,1)){// 状态更新为1，表示获取了锁
                setExclusiveOwnerThread(Thread.currentThread());//设置：当前线程独占访问权限
                return true;
            }
            return false;
        }

        @Override
        //释放锁
        protected boolean tryRelease(int arg) {
            if (getState() == 0){
                //如果状态是没有锁就不能释放
                throw new IllegalMonitorStateException("没有锁");
            }
            setExclusiveOwnerThread(null);// 设置：没有线程拥有独有的访问权限
            setState(0);// 设置状态为0，关锁
            return true;
        }

        @Override
        //判断是否有锁
        protected boolean isHeldExclusively() {
            return getState() == 1;//如果有锁，返回true
        }

        public Condition newCondition() {
            return new ConditionObject();
        }
    }



    @Override
    public void lock() {
        sync.acquire(1);//独占式获取同步状态。acquire内部回调了tryAcquire来判断锁
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        sync.acquireInterruptibly(1);//与acquire相同，但他响应中断
    }

    @Override
    public boolean tryLock() {
        return sync.tryAcquire(1);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        sync.release(1);
    }

    @Override
    public Condition newCondition() {
        return sync.newCondition();
    }
}



public class 自己写锁 {
    public static MyLock myLock = new MyLock();
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread( ()->{
                myLock.lock();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    myLock.unlock();
                }
            });
            thread.start();
        }
    }
}
