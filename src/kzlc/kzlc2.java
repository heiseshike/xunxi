package kzlc;

public class kzlc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		while (x<3)
		{
			System.out.println("x="+x);
			x++;
		}
		//1+2+3....+100求和
		int sum = 0;
		int i = 1;
		while (i<=100)
		{
			sum +=i;
			i++;
		}
		System.out.println("sum="+sum);
		int y = 8;
		int sum1 = 1;
		while (y>=1)
	{
		sum1 *=y;
		y--;
	}
		System.out.println("sum1="+sum1);
		//1+1/2+1/3+....+1/100
		double sum3 = 0;
		double l = 1;
		while (l<=100)
		{
			sum3 +=1/l;
			l++;
		}
		System.out.println("sum3="+sum3);
		
		//4%利息10000存3年
		double sum4 = 10000;
		int  a=0;
		while (a<3)
		{
			sum4 *=(1+0.04);
			a++;
		}
		System.out.println("钱数是"+sum4 );
		
		int sum5 = 0;
		int k =1;
		do
		{
			sum5 += k;
			k=k+2;
		}while (k<=100);
			System.out.println(sum5);
		
	}

}
