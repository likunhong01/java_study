package ajdk1_5新特性测试;

class Test1 {
    @Deprecated
    public void print(){
        System.out.println(1);
    }
}

class Test2 extends Test1 {
//    @SuppressWarnings("deprecated")
    public void print() {
        System.out.println(2);
    }
}

public class 注解 {
    public static void main(String[] args) {
        new Test2().print();
    }
}
