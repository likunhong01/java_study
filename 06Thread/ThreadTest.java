package b多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//1.继承Thread类实现多线程
class MyThreadA extends Thread {
    private int ticket = 10;
    @Override
    public void run() {
        System.out.println("A");
        try {
            sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("A");
        System.out.println("A");
    }
}

class MyThreadB extends Thread {
    private int ticket = 10;
    @Override
    public void run() {
        System.out.println("B");
        System.out.println("B");
        System.out.println("B");
    }
}
class MyThreadC extends Thread {
    private int ticket = 10;
    @Override
    public void run() {
        System.out.println("C");
        System.out.println("C");
        System.out.println("C");
    }
}

//public class ThreadTest {
//    public static void main(String[] args) {
//        MyThreadA a = new MyThreadA();
//        MyThreadB b = new MyThreadB();
//        MyThreadC c = new MyThreadC();
//        a.start();
//        b.start();
//        c.start();
//    }
//}

//---------------------------------------------

//2.Runnable接口实现多线程
class MyThread1 implements Runnable {
    private int ticket = 10;
    @Override
    public void run() {
        System.out.println("11111");
    }
}

class MyThread2 implements Runnable {
    private int ticket = 10;
    @Override
    public void run() {
        System.out.println("22222");
    }
}
//
//public class ThreadTest {
//    public static void main(String[] args) {
//        MyThread1 myThread1 = new MyThread1();
//        Thread thread1 = new Thread(myThread1);
//        MyThread2 myThread2 = new MyThread2();
//        Thread thread2 = new Thread(myThread2);
//
//        thread1.start();
//        thread2.start();
//    }
//}

//-------------------------------------------
//3.Callable<V>接口实现多线程
class MyThread4 implements Callable<String>{
    private int ticket = 10;
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++){
            System.out.println("还剩下" + ticket-- + "票");
        }
        return "票卖完了，明天再来";
    }
}


//public class ThreadTest {
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Callable<String> callable1 = new MyThread4();
//        Callable<String> callable2 = new MyThread4();
//
//        FutureTask<String> futureTask1 = new FutureTask<String>(callable1);//把Callable的子类产生的对象传入FutureTask中
//        FutureTask<String> futureTask2 = new FutureTask<String>(callable2);//把Callable的子类产生的对象传入FutureTask中
//
//        Thread thread1 = new Thread(futureTask1);
//        Thread thread2 = new Thread(futureTask2);
//        thread1.start();
//        thread2.start();
//        System.out.println(futureTask1.get());//获取返回值
//    }
//}
