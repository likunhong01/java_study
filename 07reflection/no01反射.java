package 反射;

import java.util.Date;

public class no01反射 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        System.out.println(int.class);
        System.out.println(Integer.class);

        Class<Date> cls = Date.class;

        Date date = cls.newInstance();
    }
}
