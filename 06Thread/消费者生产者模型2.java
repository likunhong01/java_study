package b多线程;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Goods{
    private String goodName;//商品名称
    private int count;//商品数量

    //生产商品
    public synchronized void setGoods(String goodName){
        while (count > 50){
            try {
                System.out.println("商品还有呢，不生产了");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.goodName = goodName;
        this.count++;
        System.out.println(toString());
        notifyAll();//生产完商品后唤醒消费者
    }

    @Override
    public String toString() {
        return "商品[" + goodName + "]数量：" + count;
    }

    //消费商品
    public synchronized void getGoods(){
        while (this.count == 0){
            try {
                System.out.println("商品卖完了，在生产中，请等一下");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.count --;
        System.out.println(Thread.currentThread().getName() + toString());
        notify();//消费完后告诉生产者继续生产
    }
}

//生产者
class Producer implements Runnable{

    private Goods goods;

    public Producer(Goods goods){
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true){
            this.goods.setGoods("生产纪梵希");
        }
    }
}

//消费者
class Consumer implements  Runnable{
    private Goods goods;
    public Consumer(Goods goods){
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true){
            this.goods.getGoods();
        }
    }
}

public class 消费者生产者模型2 {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);
//        Thread t1 = new Thread(producer,"生产者");
//        Thread t2 = new Thread(consumer,"消费者");
//        t1.start();
//        t2.start();

        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 5 ; i++){
            Thread thread = new Thread(producer,"生产者"+i);
            list.add(thread);
        }
        for (int i = 0; i < 5 ; i++){
            Thread thread = new Thread(consumer,"消费者"+i);
            list.add(thread);
        }

        for (Thread thread:list){
            thread.start();
        }
    }
}
