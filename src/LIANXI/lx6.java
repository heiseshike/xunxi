package LIANXI;

import java.util.Scanner;

public class lx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*判断一个数字是否能被5和6同时整除（打印能被5和6整除）
		，或只能被5整除（打印能被5整除），或只能被6整除，（打印能被6整除）
		，不能被5或6整除，（打印不能被5或6整除
		*/
		/*
		int  i = 0;
		System.out.println("请输入数字");
		Scanner scanner=new Scanner(System.in);
		i=scanner.nextInt();
		if(i%5==0&&i%6==0)
		{
			System.out.println("能被5和6同时整除");
		}
		else  if(i%5==0)
		{
			System.out.println("能被5整除");
		}
		else if (i%6==0)
		{
			System.out.println("能被6整除");
		}
		else
		{
			System.out.println("不能被5或6整除");
		}
		*/
		//输入一个年份，判断这个年份是否是闰年
		/*
	     int  i = 0;
		System.out.println("请输入年份");
		Scanner scanner=new Scanner(System.in);
		i=scanner.nextInt();
		if(i%400==0)
		{
			System.out.println("是闰年");
		}
		else  if (i%4==0&&i%100!=0)
		{
			System.out.println("是闰年");
		}
		else
		{
			System.out.println("不是闰年");
		}
		*/
		//输入一个0～100的分数，如果不是0～100之间，打印分数无效，根据分数等级打印A,B,C,D,E。
	   /*
		int  i = 0;
		System.out.println("请输入分数");
		Scanner scanner=new Scanner(System.in);
		i=scanner.nextInt();
		if(i<=100)
		{
			i=i/10;
			switch(i)
			{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("E");
				break;
			case 6:
				System.out.println("D");
				break;
			case 7:
				System.out.println("C");
				break;
			case 8:
				System.out.println("B");
				break;
			case 9:
			case 10:
				System.out.println("A");
				break;
			}
		}
		*/
		//输入三个整数x,y,z，请把这三个数由小到大输出
		/*
		int  x = 0;
		System.out.println("请输入x");
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		int  y = 0;
		System.out.println("请输入y");
		Scanner scanner1=new Scanner(System.in);
		y=scanner1.nextInt();
		int  z = 0;
		System.out.println("请输入z");
		Scanner scanner2=new Scanner(System.in);
		z=scanner2.nextInt();
		if(x>y&&x>z)
		{
			if(y>z)
			{
				System.out.println("x>y>z");
			}
			else
			{
				System.out.println("x>z>y");
			}
		}
		else if(y>z&&y>x)
		{
			if(x>z)
			{
				System.out.println("y>x>z");
			}
			else
			{
				System.out.println("y>z>x");
			}
		}
		else
		{
			if(x>y)
			{
				System.out.println("z>x>y");
			}
			else
			{
				System.out.println("z>y>x");
			}
		}
		*/
		/*
		编写一个程序，计算邮局汇款的汇费。如果汇款金额小于100元，汇费为一元，
		如果金额在100元与5000元之间，按1%收取汇费，如果金额大于5000元，汇费为50元。
		汇款金额由命令行输入。
		
		
		int  hk = 0;
		double hf =0;
		System.out.println("请输入汇款");
		Scanner scanner=new Scanner(System.in);
		hk=scanner.nextInt();
		if(hk<=100)
		{
			System.out.println("汇费为1元");
		}
		else  if (hk>=100&&hk<5000)
		{
			hf =hk*0.01;
			System.out.println("汇费为="+hf);
		}
		else if (hk>=5000)
		{
			System.out.println("汇费为50元");
		}
		*/
		
		/*分别使用for循环，while循环，do循环求1到100之间所有能被3整除的整数的和
		
		int  b = 0;
		int i=0;
		for(;i<100;i++)
		{
			if(i%3==0)
			{
				b = b+i;
			}
		}
		System.out.println(b);
		*/


		
		
		
		
		
		
	}

}
