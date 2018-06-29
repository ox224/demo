package test2;
/**
 * 计算机二进制中1的个数
 * N为基数
 * @author 
 *  *
 */
/**
 * 
 * @author wenbink
 *
 */
//   num=13;
//  1、getBinary(13/2=6)+1;
//  2、getBinary(6/2=3)+1
  //3、getBinary(3/2=1)+1+1
  //4、getBinary(1)+1+1;   getBinary(1)  返回1，与后边两个1相加得结果3
public  class dikui{	
	public  int getBinary(int num) {
		//int num;
	    if(num==1) {
	    	return 1;
	    }
	   if(0==num%2){
	    	return getBinary(num/2);//是否为偶数
	    	    }else {
	    	    	return getBinary(num/2)+1;
	    	    }	
}

public static void main(String[] args) {
	dikui s1=new dikui();
	System.out.println(s1);
}
}