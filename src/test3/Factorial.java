package test3;
/**
 * �򵥵���n!���㷨
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
		// TODO �Զ����ɵķ������
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
