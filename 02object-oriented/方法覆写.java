package no1;

class Person{
	public void fun() {
		System.out.println("父类111");
	}
}

class Student extends People{
	public void fun() {
		System.out.println("子类的");
	}
}


public class 方法覆写 {
	public static void main(String[] args) {
		new Student();
	}
}
