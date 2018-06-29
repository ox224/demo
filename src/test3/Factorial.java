package test3;
/**
 * 简单的求n!的算法
 * @author wenbink
 *
 */
//public  void random {
//	
//}
public class Factorial {
	public static void main(String[] args) {
		long n=6;
		System.out.println(doFactorial(n));
	}

	private static long doFactorial(long n) {
		// TODO 自动生成的方法存根
		if(n<1) {
			System.out.println("ERROR");
			return 0;
		}else if(n==1||n==2) {
			return n;
		}else {
			return n * doFactorial(n-1);
		}
		
	}
}
