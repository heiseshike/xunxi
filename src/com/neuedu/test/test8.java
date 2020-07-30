package com.neuedu.test;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 2;
				
		double c = 5/(double)2 ;	
		
		//a + b 的和是？ = > 字符串拼接
		System.out.println("a+b的和是"+(a+b));
		System.out.println("a+b的差是"+"a-b");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b);
		System.out.println(c);
		
		//打印出？是班长
		String  str = "毛毛";
		System.out.println(str + "是班长");
		
		int money = 5000;
		//我有？钱
		System.out.println("我有"+money+"钱");
		
		//除法中的负数
		System.out.println(5/2);//2
		System.out.println(5/-2);//?-2
		System.out.println(-5/2);//?-2
		System.out.println(-5/-2);//2
		System.out.println("=====================");
		System.out.println(5%2);//1
		System.out.println(5%-2);//?1
		System.out.println(-5%2);//?-1
		System.out.println(-5%-2);//-1
		
		//自增，自减
		int  x = 1;
		//先用后加
		x++;
		System.out.println(x);
		
		int  y = 1;
		//先加后用
		++y;
		System.out.println(y);
		
		int  i = 1;
		i = i++;
		System.out.println(i);


	}

}
