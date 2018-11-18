package b多线程;
//--------------------------------------------------------
//取名等等
//class MyThread implements Runnable{
//    private int ticket = 10;
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++){
//            System.out.println(Thread.currentThread().getName() + "还剩下" + ticket-- + "票");
//        }
//    }
//}
//
//
//public class 多线程常用操作方法 {
//    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        Thread thread1 = new Thread(myThread,"黄牛1");
//        Thread thread2 = new Thread(myThread,"黄牛2");
//        thread1.start();
//        thread2.start();
//    }
//}


import java.util.Date;

//线程让步yield，线程休眠sleep
class MyThread11 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++){
            System.out.println("a"+i);
        }
        Thread.yield();
        for (int i = 50; i < 100; i++){
            System.out.println("a"+i);
        }
    }
}

class MyThread12 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println("b"+i);
        }
    }
}

class MyThread13 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++){
            System.out.println("c"+i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 50; i < 100; i++){
            System.out.println("c"+i);
        }
    }
}

//public class 多线程常用操作方法 {
//    public static void main(String[] args) {
//        MyThread11 myThread11 = new MyThread11();
//        MyThread12 myThread12 = new MyThread12();
//        MyThread13 myThread13 = new MyThread13();
//        Thread thread11 = new Thread(myThread11);
//        Thread thread12 = new Thread(myThread12);
//        Thread thread13 = new Thread(myThread13);
//        thread11.start();
//        thread12.start();
//        thread13.start();
//    }
//}


//线程终止方法
class MyThread21 implements Runnable{
    private boolean flag = true;
    @Override
    public void run() {
        int i = 1;
        while (flag){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "执行了第" + i++ + "次");
        }
        while (Thread.currentThread().isInterrupted()){
            //这个是系统给的标记可以用
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

public class 多线程常用操作方法 {
    public static void main(String[] args) throws InterruptedException {
        MyThread21 myThread21 = new MyThread21();
        Thread thread21 = new Thread(myThread21);
        thread21.start();
        Thread.sleep(3000);
        myThread21.setFlag(false);//手动终止，用标记位设为false，就不执行了
        thread21.stop();//第二种终止方法，但不安全，已经被@Deprecate
        thread21.interrupt();
    }
}
