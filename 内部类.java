package no1;



//class Outter {
//	private String msg = "outter�е�msg";
//	
//	//�ڲ���
//	class Inner{
//		public void fun() {
//			System.out.println(msg);
//		}
//	}
//	
//	public void test() {
//		//������ʵ�����ڲ���
//		Inner in = new Inner();
//		in.fun();
//	}
//}

//==================����ʵ����ͬ�����ܣ������ǰ��ڲ������������

//class Outter {
//	private String msg = "outter�е�msg";
//	
//	public String getMsg() {
//		return msg;
//	}
//	
//	public void test() {
//		//������ʵ�����ڲ���
//		Inner in = new Inner(this);
//		in.fun();
//	}
//}
//
//class Inner {
//	private Outter out;
//	//����ע��
//	public Inner(Outter out) {
//		// TODO �Զ����ɵĹ��캯�����
//		this.out = out;
//	}
//	public void fun() {
//		// TODO �Զ����ɵķ������
//		System.out.println(out.getMsg());
//	}
//}

//==============================================
//�ڲ���ʵ�ֶ�̳�

//class A {
//	private String msString = "A��msg";
//	public String getMsString() {
//		return msString;
//	}
//}
//
//class B{
//	private int age = 20;
//	public int getAge() {
//		return age;
//	}
//}
//
//class C {
//	class InnerClassA extends A{
//		public String name() {
//			return super.getMsString();
//		}
//	}
//	class InnerClassB extends B {
//		public int age() {
//			return super.getAge();
//		}
//	}
//	public String name() {
//		return new InnerClassA().name();
//	}
//	public int age() {
//		return new InnerClassB().age();
//	} 
//	
//	
//}


/**
 * ��Ա�ڲ��಻�����о�̬�����ͷ����������Է����ⲿ��ľ�̬��;
 * ��̬�ڲ��಻�ܷ��ʳ�Ա�����ͷ����������Դ��ڳ�Ա�����ͷ�����
 * @author ����
 *
 */
class Outter {
	private String msg = "outter�е�msg";
	private static int static_num = 10;
	
	
	//�ڲ���
	class Inner{
		
		//�ڲ��಻���о�̬�����;�̬����
//		static int a = 5;
//		public static void fun() {
//			System.out.println(a);
//		}
		//ֻ������ͨ����
		int a = 5;
		public void fun() {
			System.out.println(msg);
		}
		
		//�����Է����ⲿ��ľ�̬��
	}
	
	static class InnerS{
		
		//����ӵ���Լ��ĳ�Ա�����ͷ���
		private int aaa = 10;
		private void fun() {
			System.out.println("��̬���������ͨ����");
		}
		
		
		//�����Է��ʳ�Ա�����ͷ���
		public void print() {
			System.out.println(static_num);//ֻ�ܷ����ⲿ��ľ�̬����
//			System.out.println(msg);//���ܷ����ⲿ�����ͨ����
		}
	}
	
	public void test() {
		//������ʵ�����ڲ���
		Inner in = new Inner();
		in.fun();
	}
}





public class �ڲ��� {
//	public static void main(String[] args) {
//		Outter outter = new Outter();
//		outter.test();
//	}
	public static void main(String[] args) {
		Outter outter = new Outter();
		outter.test();
	}
}



