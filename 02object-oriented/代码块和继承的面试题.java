package no1;

class A {
	public A() {
		System.out.println("1A类的构造方法");
	}
	{
		System.out.println("2A类的构造快");
	}
	static {
		System.out.println("3A类的静态块");
	}
}

public class 代码块和继承的面试题 extends A {
	public 代码块和继承的面试题() {
		System.out.println("4B类的构造方法");
	}
	{
		System.out.println("5B类的构造快");
	}
	static {
		System.out.println("6B类的静态块");
	}
	public static void main(String[] args) {
		System.out.println(7);
		new 代码块和继承的面试题();
		new 代码块和继承的面试题();
		System.out.println(8);
	}
}




