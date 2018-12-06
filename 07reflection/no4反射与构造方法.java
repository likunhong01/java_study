package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person{
    private String name;
    private int age;

    private Person(){}
    protected Person(String name){}
    public Person(String name,int age){}

}

public class no4反射与构造方法 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Person> cls = Person.class;
        {
            //取得类中所有public构造
            Constructor<?>[] constructors = cls.getConstructors();
            for (Constructor constructor: constructors){
                System.out.println(constructor);
            }
        }
        System.out.println("");
        {
            //取得类中的构造方法
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor constructor: constructors){
                System.out.println(constructor);
            }
        }


        //Class类的newInstance（）实际上调用的是类中的无参构造，如果类中没有无参构造或者权限不是public，
        // 此方法无法使用。但是Constructor类提供了newInstance方法，可以使用有参构造来实例化对象
        Constructor constructor = cls.getConstructor(String.class, int.class);
        Person per = (Person)constructor.newInstance("lkk", 20);
        System.out.println(per);


        //获取普通方法
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method);
        }

    }
}
