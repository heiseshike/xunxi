package LIANXI;

public class LX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序。
		
		int a = 10,b = 20,c = 0;
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		System.out.println("a="+a+"b="+b);
		//给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除。
		//先除后膜d/为%10
		
		int  d = 251;
		int  e = d/100%10;
		int  f = d/10%10;
		int  g = d%10;
		int sum = e+f+g;
		System.out.println(d+"的结果是"+ sum);
		
		//华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，
		//乘以5再除以9就行了，将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。
		
		double s = 32.5;
		double h = s*9/5+32;
		System.out.println(h);
		
		double s1 = (h-32)*5/9;
		System.out.println(s1);
		
		//给定一个任意的大写字母A~Z，转换为小写字母。
		//变更

		
		char  k = 'A';
		char  l = (char)(k+32);
		System.out.println(l);
		

	}

}
