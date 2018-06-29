package test4;
//选择排序算法实现10个1-100随机数字的排序
//选择排序的方法
public  class SelectSort {
public static void selectionSort(int[] number) {
	for(int i=0;i<number.length-1;i++) {
		int m=i;	
		for(int j=i+1;j<number.length;j++) {
			if(number[j]<number[m])
				m=j;
		}
		if(i!=m)
			swap(number,i,m);
	}
	
}
 //用于交换数组中的索引为i、j的元素
	private static void swap(int[] number, int i, int j) {
	   int t;
	   t=number[i];
	   number[i]=number[j];
	   number[j]=t;	
}

	public static void main(String[] args) {
		//定义一个数组
		int[] num=new int[1];		
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*6)+1;
			
			//+1指6个数组成的数组{0，1，2，3，4，5}，都+1;
			//System.out.println(i);
			//尝试抽奖形式随机从一个数组中抽取一个数？(new的对象i的数组是1即可）
			
		}		
		//排序
		selectionSort(num);		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
	}

}
