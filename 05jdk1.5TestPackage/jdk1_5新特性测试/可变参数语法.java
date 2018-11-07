package jdk1_5新特性测试;



public class 可变参数语法 {
    public static void main(String[] args) {
        int x = add(1,2,3,5,6,2);
        int xx = add1(new int[]{1,2,3,5,6,2});
        int xxx = addAtLeastTwo(1,2,43,634,23);
        System.out.println(x);
        System.out.println(xx);
    }

    public static int add(int ... a){
        int result = 0;
        for (int data:a) {
            result += data;
        }
        return result;
    }

    public static int add1(int[] a){
        int result = 0;
        for (int data:a) {
            result += data;
        }
        return result;
    }

    public static int addAtLeastTwo(int a,int b,int ... n){
        //如果有可变参数，一定要吧他放在最后一个参数
        int result = 0;
        for (int data:n) {
            result += data;
        }
        return result;
    }
}
