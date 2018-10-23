package no1;



//class Outter {
//	private String msg = "outter中的msg";
//	
//	//内部类
//	class Inner{
//		public void fun() {
//			System.out.println(msg);
//		}
//	}
//	
//	public void test() {
//		//声明并实例化内部类
//		Inner in = new Inner();
//		in.fun();
//	}
//}

//==================上下实现了同样功能，下面是把内部类放在了外面

//class Outter {
//	private String msg = "outter中的msg";
//	
//	public String getMsg() {
//		return msg;
//	}
//	
//	public void test() {
//		//声明并实例化内部类
//		Inner in = new Inner(this);
//		in.fun();
//	}
//}
//
//class Inner {
//	private Outter out;
//	//构造注入
//	public Inner(Outter out) {
//		// TODO 自动生成的构造函数存根
//		this.out = out;
//	}
//	public void fun() {
//		// TODO 自动生成的方法存根
//		System.out.println(out.getMsg());
//	}
//}

//==============================================
//内部类实现多继承

//class A {
//	private String msString = "A的msg";
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
 * 成员内部类不可以有静态变量和方法，但可以访问外部类的静态域;
 * 静态内部类不能访问成员变量和方法，但可以存在成员变量和方法。
 * @author 昆昆
 *
 */
class Outter {
	private String msg = "outter中的msg";
	private static int static_num = 10;
	
	
	//内部类
	class Inner{
		
		//内部类不能有静态方法和静态变量
//		static int a = 5;
//		public static void fun() {
//			System.out.println(a);
//		}
		//只能有普通变量
		int a = 5;
		public void fun() {
			System.out.println(msg);
		}
		
		//但可以访问外部类的静态域
	}
	
	static class InnerS{
		
		//可以拥有自己的成员变量和方法
		private int aaa = 10;
		private void fun() {
			System.out.println("静态类里面的普通方法");
		}
		
		
		//不可以访问成员变量和方法
		public void print() {
			System.out.println(static_num);//只能访问外部类的静态变量
//			System.out.println(msg);//不能访问外部类的普通变量
		}
	}
	
	public void test() {
		//声明并实例化内部类
		Inner in = new Inner();
		in.fun();
	}
}





public class 内部类 {
//	public static void main(String[] args) {
//		Outter outter = new Outter();
//		outter.test();
//	}
	public static void main(String[] args) {
		Outter outter = new Outter();
		outter.test();
	}
}



