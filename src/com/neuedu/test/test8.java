package com.neuedu.test;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 2;
				
		double c = 5/(double)2 ;	
		
		//a + b �ĺ��ǣ� = > �ַ���ƴ��
		System.out.println("a+b�ĺ���"+(a+b));
		System.out.println("a+b�Ĳ���"+"a-b");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b);
		System.out.println(c);
		
		//��ӡ�����ǰ೤
		String  str = "ëë";
		System.out.println(str + "�ǰ೤");
		
		int money = 5000;
		//���У�Ǯ
		System.out.println("����"+money+"Ǯ");
		
		//�����еĸ���
		System.out.println(5/2);//2
		System.out.println(5/-2);//?-2
		System.out.println(-5/2);//?-2
		System.out.println(-5/-2);//2
		System.out.println("=====================");
		System.out.println(5%2);//1
		System.out.println(5%-2);//?1
		System.out.println(-5%2);//?-1
		System.out.println(-5%-2);//-1
		
		//�������Լ�
		int  x = 1;
		//���ú��
		x++;
		System.out.println(x);
		
		int  y = 1;
		//�ȼӺ���
		++y;
		System.out.println(y);
		
		int  i = 1;
		i = i++;
		System.out.println(i);


	}

}
