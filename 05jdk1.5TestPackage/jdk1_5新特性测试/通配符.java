package jdk1_5新特性测试;

//class Message<T> {
//    private T message;
//
//    public T getMessage() {
//        return message;
//    }
//
//    public void setMessage(T message) {
//        this.message = message;
//    }
//}


//public class 通配符 {
//    public static void main(String[] args) {
//        Message<String> message = new Message<>();
//        message.setMessage("hello");
//        method(message);
//    }
//
//    public static void method(Message<String> str){
//        System.out.println(str);
//    }
//}


//public class 通配符 {
//    public static void main(String[] args) {
//        Message<Integer> message = new Message<>();
//        message.setMessage(123);
//        method(message);
//    }
//
//    public static void method(Message<String> str){
//        System.out.println(str);
//    }
//}


//public class 通配符 {
//    public static void main(String[] args) {
//        Message<Integer> message = new Message<>();
//        message.setMessage(123);
//        method(message);
//    }
//
//    public static void method(Message<?> str){
//        str.setMessage("232");//由于不知道str的具体类型，所以不能修改，会报错
//        System.out.println(str);
//    }
//}


////设置上限
//class Message<T extends Number> {
//    private T message;
//
//    public T getMessage() {
//        return message;
//    }
//
//    public void setMessage(T message) {
//        this.message = message;
//    }
//}
//
//public class 通配符 {
//    public static void main(String[] args) {
//        Message<Integer> message = new Message<>();
//        message.setMessage(123);
//        method(message);
//    }
//
//    public static void method(Message<? extends Number> str){
////        str.setMessage("232");//由于不知道str的具体类型，所以不能修改，会报错
//        System.out.println(str);
//    }
//}



//设置下限
class Message<T> {
    private T message;

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }
}

public class 通配符 {
    public static void main(String[] args) {
        Message<Integer> message = new Message<>();
        message.setMessage(123);
        method(message);
    }

    public static void method(Message<? super Integer> str){
        str.setMessage(256);//现在可以设置了，因为子类可以天然向上转型
        System.out.println(str);
    }
}
