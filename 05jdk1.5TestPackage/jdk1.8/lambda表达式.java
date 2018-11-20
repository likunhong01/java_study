package ajdk1_8新特性测试;

interface IMessage {
    void print();
}

//public class lambda表达式 {
//    public static void main(String[] args) {
//        IMessage message = new IMessage() {
//            @Override
//            public void print() {
//                System.out.println("hello IMessage");
//            }
//        };
//        message.print();
//    }
//}

public class lambda表达式 {
    public static void main(String[] args) {
        IMessage message =  () -> {
            System.out.println("hello IMessage1");
            System.out.println("hello IMessage2");
            System.out.println("hello IMessage3");
        };
        message.print();
    }
}

//public class lambda表达式 {
//    public static void main(String[] args) {
//        //方式一
//        Runnable runnable = () -> {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        };
//        Thread thread = new Thread(runnable);
//
//        //方式二
//        Thread thread1 = new Thread(()->{
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//    }
//}