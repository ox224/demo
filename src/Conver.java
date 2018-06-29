import java.util.Scanner;

public class Conver {
	public static void main(String[] args) {
//		byte mybyte = 127;
//		int myint = 150;
//		float myfloat = 452.12f;
//		char mychar = 10;
//		double mydouble = 45.46546;
		// 将运算结果输出
		
		Scanner in=new Scanner(System.in);
		System.out.println("欢迎您来到长沙臭豆腐店铺");
		System.out.println("************");
		
		
		int word=in.nextInt();
		System.out.print("您此次共消费了：");
		System.out.println(+word+"元");
		System.out.println("*********");
		
//		System.out.println(+(mybyte+myfloat)+"127与452.12相加的和是：\n" + (mybyte + myfloat));
//		System.out.println("127与150相乘的积是:" + mybyte * myint);
//		System.out.println("127被10除的商是:" + mybyte / mychar);
//		System.out.println("45.46546和10相加的和是:" + (mydouble + mychar));
	}

}
