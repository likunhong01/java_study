package no1;

public class �̳�super {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		final int a = 5;//������������������final
		//a = 4;//�������ɸ�
	}

}

//super��ʾ
class Person1 {
	private int age = 5;
	
}

class Student1 extends Person1 {
	
}


//final��ʾ
//final class Student2 extends Person {
class Student2 extends Person1 {
//	public final int a;
//	a =5;������ôд������д��һ��
	public final int a = 5;
	
	public final static int BBBB = 10;//����������ĳ���
	public Student2() {
		// TODO �Զ����ɵĹ��캯�����
	}
}


