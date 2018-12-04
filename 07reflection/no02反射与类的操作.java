package 反射;



//获取父类和父类接口的信息
interface IMsg{}
interface INews{}
abstract class Fun{}
class Real extends Fun implements IMsg,INews{}

public class no02反射与类的操作 {
    public static void main(String[] args) {
        Class<Real> cls = Real.class;
        System.out.println(cls.getSuperclass().getName());
        Class[] classes = cls.getInterfaces();
        for (Class c : classes){
            System.out.println(c);
        }
    }
}

