package test2;
/**
 * �������������1�ĸ���
 * NΪ����
 * @author 
 *  *
 */
/**
 * 
 * @author wenbink
 *
 */
//   num=13;
//  1��getBinary(13/2=6)+1;
//  2��getBinary(6/2=3)+1
  //3��getBinary(3/2=1)+1+1
  //4��getBinary(1)+1+1;   getBinary(1)  ����1����������1��ӵý��3
public  class dikui{	
	public  int getBinary(int num) {
		//int num;
	    if(num==1) {
	    	return 1;
	    }
	   if(0==num%2){
	    	return getBinary(num/2);//�Ƿ�Ϊż��
	    	    }else {
	    	    	return getBinary(num/2)+1;
	    	    }	
}

public static void main(String[] args) {
	dikui s1=new dikui();
	System.out.println(s1);
}
}