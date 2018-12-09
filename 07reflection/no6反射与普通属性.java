package 反射;

import java.lang.reflect.Field;

class Person5{
//    private String name;
//    public static String test;
//    public int age;
    private int age;
}

class Student extends Person5{
    private String school;
    public String className;
}
public class no6反射与普通属性 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
//        Class<Student> cls = Student.class;
//        cls.getDeclaredField("name");//取得name属性（name是什么权限都可以）
//        cls.getField("name");//取得name属性（name必须是public）
//        cls.getFields();//取得所有public属性
//        cls.getDeclaredFields();//取得所有属性，但没有父类的
//        {
//            //取得所有public属性
//            Field[] fields = cls.getFields();
//            for (Field field : fields){
//                System.out.println(field.getName());
//            }
//        }
//        System.out.println();
//        {
//            //取得所有属性，但只能取到本类的，不能取到父类的
//            Field[] fields = cls.getDeclaredFields();
//            for (Field field : fields){
//                System.out.println(field.getName());
//            }
//        }



//        //Field的设置和获取：
//
//        Class<Person5> cls = Person5.class;
//        // 获取Field对象
//        Field field = cls.getField("age");
//        //获取Person实例化对象
//        Person5 per = cls.newInstance();
//        // set 和 get
//        field.set(per,20);
//        System.out.println(field.get(per));
//        System.out.println(field.getType());

        Class<Person5> cls = Person5.class;
        Field field = cls.getDeclaredField("age");
        Person5 per = cls.newInstance();
        //动态破坏封装
        field.setAccessible(true);
        field.set(per,20);
        System.out.println(field.get(per));
    }
}
