package no1;

class A {
	public A() {
		System.out.println("1A��Ĺ��췽��");
	}
	{
		System.out.println("2A��Ĺ����");
	}
	static {
		System.out.println("3A��ľ�̬��");
	}
}

public class �����ͼ̳е������� extends A {
	public �����ͼ̳е�������() {
		System.out.println("4B��Ĺ��췽��");
	}
	{
		System.out.println("5B��Ĺ����");
	}
	static {
		System.out.println("6B��ľ�̬��");
	}
	public static void main(String[] args) {
		System.out.println(7);
		new �����ͼ̳е�������();
		new �����ͼ̳е�������();
		System.out.println(8);
	}
}




