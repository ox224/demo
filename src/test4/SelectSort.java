package test4;
//ѡ�������㷨ʵ��10��1-100������ֵ�����
//ѡ������ķ���
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
 //���ڽ��������е�����Ϊi��j��Ԫ��
	private static void swap(int[] number, int i, int j) {
	   int t;
	   t=number[i];
	   number[i]=number[j];
	   number[j]=t;	
}

	public static void main(String[] args) {
		//����һ������
		int[] num=new int[1];		
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*6)+1;
			
			//+1ָ6������ɵ�����{0��1��2��3��4��5}����+1;
			//System.out.println(i);
			//���Գ齱��ʽ�����һ�������г�ȡһ������(new�Ķ���i��������1���ɣ�
			
		}		
		//����
		selectionSort(num);		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
	}

}
