package com.neuedu.test;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		
		int b = a;
		
		b += a;//b= b+a
		b -= a;//b= b-a
		b *= a;//b= b*a
		b /= a;//b= b/a
		b %= a;//b= b%a
		System.out.println(b);
		
		//关系运算符
		//> >= < <= == !=
		//关系运算的结果是BOOLEAN
		
		System.out.println(a>b);//true
		
		boolean flag = a != b;

	}

}
