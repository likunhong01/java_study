package 反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class no5调用反射方法 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //取得class对象
        Class<Person2> cls = Person2.class;
        //取得method对象
        String setMethodName = "set" + initCap(args[0]);
        String getMethodName = "get" + initCap(args[0]);
        //取得method对象
        Method setMethod = cls.getMethod(setMethodName,String.class);
        Method getMethod = cls.getMethod(getMethodName);
        //取得person类的实例化对象而后调用方法
        Person2 per = cls.newInstance();
        setMethod.invoke(per,"李昆昆");
        System.out.println(getMethod.invoke(per));
    }
    public static String initCap(String str){
        return str.substring(0,1).toUpperCase()+ str.substring(1);
    }
}
