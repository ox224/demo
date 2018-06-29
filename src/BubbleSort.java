import java.util.Arrays;
import java.util.Random;
//
public class BubbleSort extends Random {

	public static void main(String[] args) {
		int[] arr=new int[11];
		for(int i=0;i<arr.length;i++) {
			Random ran=new Random();
			arr[i]=ran.nextInt(10);
		}
		System.out.println(Arrays.toString(arr));
		//√∞≈›≈≈–Ú
		System.out.println("°≠°≠°≠°≠√∞≈›≈≈–Ú ø™ º°≠°≠°≠°≠");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;						
					}
				}
			System.out.println(Arrays.toString(arr));
			}
		System.out.println("°≠°≠°≠°≠°≠√∞≈›≈≈–Ú Ω· ¯°≠°≠°≠°≠");
		System.out.println(Arrays.toString(arr));
		}

	}


