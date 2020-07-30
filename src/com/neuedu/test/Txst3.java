package com.neuedu.test;

public class Txst3 {

	public static void main(String[] args) {
		// 基本数据类型中的整数
		//byte(1个字节),short(2个字节),int（4个字节）,long(8个字节)
		//byte  范围+127~-128
		//此处有个隐式类型转换
		byte a = 127;
		
		//此处有个隐式类型转换
		//-2^15~2^15-1
		short b = 32767;

		//-2^31-1~2^31
		int c = 2147483647;
		
		//-2^63-1~2^63
		//对于long型数据，如果超过int范围，在后面加上L/l，建议用大写
		//此处有个隐式类型转换
		long d0 = 123;
		//此处没有类型转换
		long d = 21474836473123L;

	}

}
