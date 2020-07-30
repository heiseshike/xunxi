package com.neuedu.test;

public class text4 {

	public static void main(String[] args) {
		//十进制
		int a = 10;
		
		//十六进制
		int b =0x10;//16
		
		//八进制
		int c = 010;//8
		
		//二进制
		int d = 0b100;//4
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//进制互转
		//十进制-》十六，八，二(除数取余法)
		//十六，八，二 -》十进制（权加法）
		//十六，八《-》二进制
		
		//十进制转换其他进制
		System.out.println(Integer.toBinaryString(100));//二进制
		System.out.println(Integer.toHexString(100));//十六进制
		System.out.println(Integer.toOctalString(100));//八进制
		

	}

}
