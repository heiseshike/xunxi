package com.neuedu.test;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a 目标类型  100  源类型
		//隐式类型转换
		double  a = 100;
		
		int x = 100;
		
		//隐式类型转换
		long y = 200;
		
		double z = 12.34;
		
		//在数学运算时也存在类型转换
		System.out.println(x+y+z);
		
		//强制转换
		int  i = 129;
		//数据溢出
		byte j = (byte)i;
		
		System.out.println(j);
		
		char c = 'a';
		
		int k = c;
		
		System.out.println(k);
		
		int kk = 97;
		char cc = (char)kk;
		
		System.out.println(cc);
		
		long  xx = 88;
		int yy = (int)xx;
		
		System.out.println(yy);

		
	}
}
