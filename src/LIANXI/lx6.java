package LIANXI;

import java.util.Scanner;

public class lx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*�ж�һ�������Ƿ��ܱ�5��6ͬʱ��������ӡ�ܱ�5��6������
		����ֻ�ܱ�5��������ӡ�ܱ�5����������ֻ�ܱ�6����������ӡ�ܱ�6������
		�����ܱ�5��6����������ӡ���ܱ�5��6����
		*/
		/*
		int  i = 0;
		System.out.println("����������");
		Scanner scanner=new Scanner(System.in);
		i=scanner.nextInt();
		if(i%5==0&&i%6==0)
		{
			System.out.println("�ܱ�5��6ͬʱ����");
		}
		else  if(i%5==0)
		{
			System.out.println("�ܱ�5����");
		}
		else if (i%6==0)
		{
			System.out.println("�ܱ�6����");
		}
		else
		{
			System.out.println("���ܱ�5��6����");
		}
		*/
		//����һ����ݣ��ж��������Ƿ�������
		/*
	     int  i = 0;
		System.out.println("���������");
		Scanner scanner=new Scanner(System.in);
		i=scanner.nextInt();
		if(i%400==0)
		{
			System.out.println("������");
		}
		else  if (i%4==0&&i%100!=0)
		{
			System.out.println("������");
		}
		else
		{
			System.out.println("��������");
		}
		*/
		//����һ��0��100�ķ������������0��100֮�䣬��ӡ������Ч�����ݷ����ȼ���ӡA,B,C,D,E��
	   /*
		int  i = 0;
		System.out.println("���������");
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
		//������������x,y,z���������������С�������
		/*
		int  x = 0;
		System.out.println("������x");
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		int  y = 0;
		System.out.println("������y");
		Scanner scanner1=new Scanner(System.in);
		y=scanner1.nextInt();
		int  z = 0;
		System.out.println("������z");
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
		��дһ�����򣬼����ʾֻ��Ļ�ѡ���������С��100Ԫ�����ΪһԪ��
		��������100Ԫ��5000Ԫ֮�䣬��1%��ȡ��ѣ����������5000Ԫ�����Ϊ50Ԫ��
		����������������롣
		
		
		int  hk = 0;
		double hf =0;
		System.out.println("��������");
		Scanner scanner=new Scanner(System.in);
		hk=scanner.nextInt();
		if(hk<=100)
		{
			System.out.println("���Ϊ1Ԫ");
		}
		else  if (hk>=100&&hk<5000)
		{
			hf =hk*0.01;
			System.out.println("���Ϊ="+hf);
		}
		else if (hk>=5000)
		{
			System.out.println("���Ϊ50Ԫ");
		}
		*/
		
		/*�ֱ�ʹ��forѭ����whileѭ����doѭ����1��100֮�������ܱ�3�����������ĺ�
		
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
