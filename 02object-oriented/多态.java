package no1;

//class Person3 {
//	public void fun() {
//		// TODO �Զ����ɵĹ��캯�����
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
//public class ��̬ {
//
//	public static void main(String[] args) {
//		// TODO �Զ����ɵķ������
//		Person3 per = new Student3();//����ת��
//		Student3 student3 = (Student3)per;//����ת��
//	}
//}




//================================================================
//Person������Student��worker��Teacher
//Ҫ�����һ���������÷����ܽ���person����������󲢵���person��fun����


class Person3 {
	public void fun() {
		// TODO �Զ����ɵĹ��캯�����
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

public class ��̬ {

	public static void main(String[] args) {
		test(new Student3());
		test(new Worker());
		test(new Teacher1());
	}
	
	public static void test(Person3 per) {
		per.fun();
	}
}

