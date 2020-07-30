package LIANXI;

import java.util.Scanner;

public class lx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int   x= 14142;
		int   a= 0;
		for(int z=1;;z++)
		{
			x= x/10;
			if(x!=0)
			{
				
				a=a+1;
				
			}
			else
			{
				a=a+1;
				break;
			}
			
		}
		System.out.println(a);
		
		//由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321。
		
		/*
		 int  i = 0;
		System.out.println("请输入一个四位数字");
		Scanner scanner=new Scanner(System.in);
		i=scanner.nextInt();
		 int  q = 0;
		for (int k=4;k>=1;k--)
		{
			q=i%10;
			System.out.print(q);
			i=i/10;
		}
		*/
		 
		 
		/*
		企业发放的奖金根据利润提成。利润低于或等于10万元时，奖金可提10%；
		利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%
		20万到40万之间时，高于20万元的部分，可提成5%；
		40万到60万之间时高于40万元的部分，可提成3%；
		60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成
		在程序中设定一个变量为当月利润，求应发放奖金总数？
		
		double  h = 0;
		System.out.println("请输入工资");
		Scanner scanner1=new Scanner(System.in);
		h=scanner1.nextInt();
		
		double  jj = 0;
		if(h<=100000)
		{
			jj = 0.1*h;
		}
		else if (h>=100000)
		{
			jj = (h-100000)*0.075+0.1*100000;
		}
		else  if (h>=200000)
		{
			jj = (h-200000)*0.05+100000*0.075+0.1*100000;
		}
		else  if (h>=400000)
		{
			jj = (h-400000)*0.03+200000*0.05+100000*0.075+100000*0.01;
		}
		else   if (h>=600000)
		{
			jj = (h-600000)*0.015+200000*0.03+200000*0.05+100000*0.075+100000*0.01;
		}
		else   if(h>=1000000)
		{
			jj = (h-1000000)*0.01+400000*0.015+200000*0.03+200000*0.05+100000*0.075+100000*0.01;
		}
		System.out.println(jj);
		*/
		//给定一个成绩a，使用switch结构求出a的等级。A：90-100，B：80-89，C：70-79，D：60-69，E：0~59
		/*int  cj = 0;
		System.out.println("请输入成绩");
		Scanner scanner2=new Scanner(System.in);
		cj=scanner2.nextInt();
		switch(cj/10)
		{
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("成绩等级为E");
			break;
		case 6:
			System.out.println("成绩等级为D");
			break;
		case 7:
			System.out.println("成绩等级为C");
			break;
		case 8:
			System.out.println("成绩等级为B");
			break;
		case 9:
			System.out.println("成绩等级为A");
			break;
		case 10:
			System.out.println("成绩等级为A");
			break;
		}
		*/
		//假设某员工今年的年薪是30000元，年薪的年增长率6%。
		//编写一个Java应用程序计算该员工10年后的年薪，并统计未来10年（从今年算起）总收入。
		double  nx = 30000;
		int ns=1;
		for(;ns<=10;ns++)
		{
			nx = nx*(1+0.06);
		}
		System.out.println("第10年年薪="+nx);
		double   znx = 30000;
		int      ns1 = 1;
		double   znxz =0;
		for(;ns1<10;ns1++)
		{
			znx = znx*(1+0.06);
			znxz = znxz + znx;
		}
		System.out.println("10年总年薪="+znxz);
		
		//输入一个数字，判断是一个奇数还是偶数
		/*int  s = 0;
		System.out.println("请输入数字");
		Scanner scanner3=new Scanner(System.in);
		s=scanner3.nextInt();
		if(s%2==0)
		{
			System.out.println("数字是偶数");
		}
		else
		{
			System.out.println("数字是奇数");
		}
		*/
		
		/*编写程序， 判断一个变量x的值，如果是1，输出x=1
		，如果是5，输出x=5，如果是 10，输出x=10，除了以上几个值，都输出x=none
	    */
		/*
		int  bl = 0;
		System.out.println("请输入数字");
		Scanner scanner4=new Scanner(System.in);
		bl=scanner4.nextInt();
		if(bl==1)
		{
			System.out.println("bl=1");
		}
		else if(bl==5)
		{
			System.out.println("bl=5");
		}
		else if(bl==10)
		{
			System.out.println("bl=10");
		}
		else
		{
			System.out.println("bl=none");
		}
		*/
		
	}

}
