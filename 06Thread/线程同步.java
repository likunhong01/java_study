package b多线程;

import java.util.concurrent.Callable;

public class 线程同步 {
}
class sellpiao implements Runnable{
    private int ticket = 10;
//    @Override
//    public void run() {
//        //①使用synchronized关键字来处理同步问题
//        synchronized (this){
//            for (int i = 0; i < 10; i++){
//                System.out.println("还剩下" + ticket-- + "票");
//            }
//        }
//    }

    @Override
    public void run() {
        for (int i = 0; i < 1000 ; i++){
            sale();
        }
    }

    public synchronized void sale(){
        if (ticket>0){
            System.out.println("还剩下" + ticket-- + "票");
        }
    }
}