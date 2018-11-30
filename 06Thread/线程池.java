package b多线程;


import java.util.concurrent.*;

class myThread61 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

//public class 线程池 {
//    public static void main(String[] args) {
//        myThread61 myThread61 = new myThread61();
//        //手工创建线程池
//        ExecutorService executorService = new ThreadPoolExecutor(3,5,
//                2000, TimeUnit.NANOSECONDS,new LinkedBlockingDeque<>());
//        for (int i = 0; i < 5; i++){
//            Future future = executorService.submit(myThread61);
//        }
//        //关闭线程池
//        executorService.shutdown();
//    }
//}

public class 线程池 {
    public static void main(String[] args) {
        myThread61 myThread61 = new myThread61();
        //手工创建线程池
        //固定大小线程池
        ExecutorService executorService1 = Executors.newFixedThreadPool(5);
        //单线程池
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        //缓存线程池
        ExecutorService executorService3 = Executors.newCachedThreadPool();
        //定时调度池
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

        for (int i = 0; i < 5; i++){
            Future future = executorService1.submit(myThread61);
            scheduledExecutorService.scheduleAtFixedRate(myThread61,2000,3000, TimeUnit.MILLISECONDS);
        }
        //关闭线程池
        executorService1.shutdown();
    }
}

