package com.neuedu.test;

public class lx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int i = 0;
	    int a = i++;
	    System.out.println(a + ", " + i);// 0,1
	    a = ++i;
	    System.out.println(a + ", " + i);// 2,2
	    i = i++;
	    // int b = i++;
	    // i = b;
	    System.out.println(i);// 2
	    i = 0;
	    System.out.println(i++ % 3);// 0
	    System.out.println(i++ % 3);// 1
	    System.out.println(i++ % 3);// 2
	    System.out.println(i++ % 3);// 0
	    System.out.println(i++ % 3);// 1
	    System.out.println(i++ % 3);// 2
	    System.out.println(i++ % 3);// 0
	    
	    int x1 = 3, y1 = 5;
	    int x2 = 3, y2 = 5;
	    int r1, r2;
	    r1 = x1++ + x1*y1;
	    r2 = ++x2 + x2*y2;
	    //字符串常量和变量用加号连接
	    System.out.println("x1="+x1+" y1="+y1+" r1="+r1);
	    System.out.println("x2="+x2+" y2="+y2+" r2="+r2);
	    
	    char c = 'a';
	    String s = "hello";
	    int k = 100;
	    float f = 2.15f;
	    double d = 5.7;
	    boolean b = true;
	    System.out.println("c=" + c);
	    System.out.println("s=" + s);
	    System.out.println("k=" + k);
	    System.out.println("f=" + f);
	    System.out.println("d=" + d);
	    System.out.println("b=" + b);

	}

}
