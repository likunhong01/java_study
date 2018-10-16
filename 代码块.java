package no1;

public class 代码块 {
	
	static {
		System.out.println("这里是主类静态块");
	}
	//普通代码块
	public static void main(String[] args) {
		{
			int n = 5;
		}
		int n = 0;
		System.out.println(n);
	}
}

class C {
	public C() {
		System.out.println("这里是构造函数");
	}
//	{
//		System.out.println("这里是构造块");
//	}
	static {
		System.out.println("这里是非主类静态块");
	}
}
