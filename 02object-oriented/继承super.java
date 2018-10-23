package no1;

public class 继承super {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		final int a = 5;//可以在主方法里声明final
		//a = 4;//变量不可改
	}

}

//super演示
class Person1 {
	private int age = 5;
	
}

class Student1 extends Person1 {
	
}


//final演示
//final class Student2 extends Person {
class Student2 extends Person1 {
//	public final int a;
//	a =5;不能这么写，必须写在一条
	public final int a = 5;
	
	public final static int BBBB = 10;//定义类里面的常量
	public Student2() {
		// TODO 自动生成的构造函数存根
	}
}


