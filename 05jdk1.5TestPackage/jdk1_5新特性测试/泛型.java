package jdk1_5新特性测试;

import java.lang.reflect.Field;

class Point<T> {
    private T X;
    private T Y;

    public T getX() {
        return X;
    }

    public void setX(T x) {
        X = x;
    }

    public T getY() {
        return Y;
    }

    public void setY(T y) {
        Y = y;
    }
}

class Point2<T, E> {
    private T x;
    private E y;
}

class Method {
    public <T> void test(T t){
        System.out.println(t);
    }

    public <T> T method(T t) {
        //第一个T表明他是泛型方法，指代后面2个T的类型。
        //第二个T是返回值
        //第三个T是参数
        return t;
    }
}





class MyClass<T> {
    public T method1(T t){
        return t;
    }
    //当泛型类与泛型方法共存时候，泛型方法中的类型参数与泛型类的类型参数无关，泛型方法失踪以自己的类型参数为准。规范起见
    //泛型类与泛型方法共存时，用不同的类型参数来区分彼此
    public <T> T method (T t){
        return t;
    }
    public <E> E method2 (E e){
        return e;
    }
}


//public class 泛型 {
//    public static void main(String[] args) {
//        Point<Integer> point = new Point<Integer>();
//        point.setX(10);
//        point.setY(20);
//    }
//}

//接口泛型的使用方法
interface IInterface<T> {
    T test(T t);
}
class InterfaceImp1<T> implements IInterface<T> {
    //子类实现接口时候继续保留泛型
    @Override
    public T test(T t) {
        return t;
    }
}
class InterfaceImp2 implements IInterface<String>{
    //子类实现接口时确定好泛型类型
    @Override
    public String test(String s) {
        return s;
    }
}


//泛型的类型擦除
class MyClass1<T,E>{
    public T t;
    public E e;
}
public class 泛型 {
    public static void main(String[] args) {
        MyClass1<Integer,String> myClass1 = new MyClass1<Integer,String>();
//        MyClass1<String> myClass2 = new MyClass1<String>();
//        System.out.println(Integer.class == String.class);
//        System.out.println(myClass1.getClass() == myClass2.getClass());//返回true ，是一个类
        Field[] fields = myClass1.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType());
        }
    }
}
