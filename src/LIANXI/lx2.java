package LIANXI;

public class lx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//判断一个数字是否能被5和6同时整除（打印能被5和6整除），或只能被5整除（打印能被5整除）
		//或只能被6整除，（打印能被6整除），不能被5或6整除，（打印不能被5或6整除）
		
		int   sum = 30;
		
		if (sum%5 ==0 && sum%6 ==0)
		{
			System.out.println("能被5和6整除");
		}
		else if(sum%5 ==0 && sum%6 !=0)
		{
			System.out.println("能被5整除");
		}
		else if(sum%5 !=0 && sum %6 == 0)
		{
			System.out.println("能被6整除");
		}
		else
		{
			System.out.println("不能被5和6整除");
		}
		//输出0-9之间的数，但是不包括5。
		
		int   i = 0;
		for (;i<=9;i++)
		{ if (i!=5)
		{
			System.out.println("i="+i);
		}
		}
		//判断一个数是不是质数（素数），除了1和本身以外不能被其他的书整除
		int  u = 9;
		for(int p=2;u<=(p-1)/2;p++)
		{
			if(u%p==0)
			{
				System.out.println("不是素数");
				return;
			}
		System.out.println("是素数");
		}


	}

}
