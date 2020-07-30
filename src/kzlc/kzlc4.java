package kzlc;

public class kzlc4 {

	public static void main(String[] args) {
		for(int s=0;s<3;s++)
		{
			System.out.println("***");
		}
		for (int l=0;l<3;l++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("*");
			}
			//打印换行
			//System.out.println();
			System.out.print("\n");
		}		
		
		
		//99乘法表
		for (int i=1;i<=9;i++)
		{
			for(int g=1;g<=i;g++)
			{
				System.out.print(i+"*"+g+"="+(i*g)+"\t");
			}
			System.out.println("                  ");
		}
		int sum = 0;
		for(int w=1;;w++)
		{
			sum += w;
			if(sum>=660)
			{
				System.out.println(sum);
				System.out.println(w);
				break;//退出所在循环 go to here
			}
		}
		//here 
		//return结束所有，break结束当前循环
		
		//判断num是不是质数
		int   num = 29;
		int     z = 2;
		for(;z<=num-1;z++)
		{
			if(num%z==0)
			{
			//整除了
			System.out.println("不是质数");
			break;
			}
		}
		
		if (z==num)
		{
			//break到这
			System.out.println("是质数");
		}
		
		int   num1 = 97;
		
		boolean  flag = true;//是质数
		for(int z1 = 2;z1<=num1-1;z1++)
		{
			if(num1%z1==0)
			{
			//整除了
			flag = false;//不是质数
			System.out.println("不是质数");
			break;
			}
		}
		
		if (flag)//一个数都没整除
		{
			//break到这
			System.out.println("是质数");
		}
		
		//编写一个程序，找出大于200的最小的质数
		
		for (int num2=200;;num2++)
		{
			boolean  flag1 = true;//是质数
			for(int z2 = 2;z2<=num2-1;z2++)
			{
				if(num2%z2==0)
				{
				//整除了
				flag1 = false;//不是质数
				//System.out.println("不是质数");
				break;
				}
			}
			
			if (flag1)//一个数都没整除
			{
				//break到这
				//System.out.println("是质数");
				System.out.println(num2);
				break;
			}
		}
		

	}

}
