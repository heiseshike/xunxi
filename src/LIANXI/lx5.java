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
		
		//������������һ��4λ�������󽫸�����ת�Ժ��������ԭ��Ϊ1234����ת�����λ4321��
		
		/*
		 int  i = 0;
		System.out.println("������һ����λ����");
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
		��ҵ���ŵĽ������������ɡ�������ڻ����10��Ԫʱ���������10%��
		�������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣������7.5%
		20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��
		40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
		60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%���
		�ڳ������趨һ������Ϊ����������Ӧ���Ž���������
		
		double  h = 0;
		System.out.println("�����빤��");
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
		//����һ���ɼ�a��ʹ��switch�ṹ���a�ĵȼ���A��90-100��B��80-89��C��70-79��D��60-69��E��0~59
		/*int  cj = 0;
		System.out.println("������ɼ�");
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
			System.out.println("�ɼ��ȼ�ΪE");
			break;
		case 6:
			System.out.println("�ɼ��ȼ�ΪD");
			break;
		case 7:
			System.out.println("�ɼ��ȼ�ΪC");
			break;
		case 8:
			System.out.println("�ɼ��ȼ�ΪB");
			break;
		case 9:
			System.out.println("�ɼ��ȼ�ΪA");
			break;
		case 10:
			System.out.println("�ɼ��ȼ�ΪA");
			break;
		}
		*/
		//����ĳԱ���������н��30000Ԫ����н����������6%��
		//��дһ��JavaӦ�ó�������Ա��10������н����ͳ��δ��10�꣨�ӽ������������롣
		double  nx = 30000;
		int ns=1;
		for(;ns<=10;ns++)
		{
			nx = nx*(1+0.06);
		}
		System.out.println("��10����н="+nx);
		double   znx = 30000;
		int      ns1 = 1;
		double   znxz =0;
		for(;ns1<10;ns1++)
		{
			znx = znx*(1+0.06);
			znxz = znxz + znx;
		}
		System.out.println("10������н="+znxz);
		
		//����һ�����֣��ж���һ����������ż��
		/*int  s = 0;
		System.out.println("����������");
		Scanner scanner3=new Scanner(System.in);
		s=scanner3.nextInt();
		if(s%2==0)
		{
			System.out.println("������ż��");
		}
		else
		{
			System.out.println("����������");
		}
		*/
		
		/*��д���� �ж�һ������x��ֵ�������1�����x=1
		�������5�����x=5������� 10�����x=10���������ϼ���ֵ�������x=none
	    */
		/*
		int  bl = 0;
		System.out.println("����������");
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
