package com.neuedu.test;

public class test5 {

	public static void main(String[] args) {
		float  a = 3.14f;
		float  g = -3.125251142524e+38f;
		
		double b = 3.14;
		double c = 314.0;
		double d = .314;
		
		double e = 3.14e2;//(314)
		double f = 3.14e-1;//(0.314)
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		double x = 0.1;
		double y = 0.1;
		
		System.out.println(x*y);
		
		//如果需要浮点数计算绝对精确，bigdecimal

	}

}
