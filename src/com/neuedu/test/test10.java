package com.neuedu.test;

public abstract class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean  x = true;
		boolean  y = false;
		
		System.out.println(x&&y);//false
		System.out.println(x||y);//true
		System.out.println(!y);//false
		System.out.println(!x);//true
		System.out.println(x^y);//��ͬΪfalse����ͬλtrue//true

		System.out.println("====================================");
		
		int a = 100;
		int b = 200;
		int c = 300;
		
		//&& || ��·����
		boolean  flag1 = a<b && b++<c;//true
		
		System.out.println(b);
		
		boolean  flag2 = a<b || b++>c;//true
		
		System.out.println(b);
		
		System.out.println("====================================");
		//& | ����·
		
		int x1 = 100;
		int y1 = 200;
		int z1 = 300;
		
		boolean  b1 = x1 < y1 & y1++ <z1;
		

		
		boolean  b2 = x1 > y1 | y1++ <z1;
		
		System.out.println(y1);		
		
		System.out.println("====================================");
		
		char sex = 'F';
		
		String str = sex=='F'?"Ů":"��";
		
		System.out.println(str);
		
		int xx = 10;
		int yy = 20;
		int zz = 30;
		
		int max =xx>yy?xx:yy;
		
		max = max >=zz?max:zz;
		
		System.out.println(max);
		
		
		
	}

}
