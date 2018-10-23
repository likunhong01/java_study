package no1;

//class Person3 {
//	public void fun() {
//		// TODO 自动生成的构造函数存根
//		System.out.println("person");
//	}
//}
//
//class Student3 extends Person3 {
//	public void fun() {
//		System.out.println("stu");
//	}
//}
//
//public class 多态 {
//
//	public static void main(String[] args) {
//		// TODO 自动生成的方法存根
//		Person3 per = new Student3();//向上转型
//		Student3 student3 = (Student3)per;//向下转型
//	}
//}




//================================================================
//Person下面有Student，worker，Teacher
//要求设计一个方法，该方法能接收person及其子类对象并调用person的fun方法


class Person3 {
	public void fun() {
		// TODO 自动生成的构造函数存根
		System.out.println("person");
	}
}

class Student3 extends Person3 {
	public void fun() {
		System.out.println("student");
	}
}

class Worker extends Person3 {
	public void fun() {
		System.out.println("worker");
	}
}

class Teacher1 extends Person3 {
	public void fun() {
		System.out.println("teacher");
	}
}

public class 多态 {

	public static void main(String[] args) {
		test(new Student3());
		test(new Worker());
		test(new Teacher1());
	}
	
	public static void test(Person3 per) {
		per.fun();
	}
}

