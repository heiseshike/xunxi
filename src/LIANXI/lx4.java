package LIANXI;

import java.net.StandardSocketOptions;

public class lx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=100;i<1000;i++)
		{
			int  a = i/100;
			int  b = i/10%10;
			int  c = i%10;
			if(a*a*a + b*b*b + c*c*c == i)
			{
				System.out.println(i);
			}
			
		}
		
		
		/*for (int x=0;x<=100;x++)
		{
			for(int y=0;y<=100;y++)
			{
 				for (int z= 0;z<=100;z++)
				{
					if (x*3+y*4+z*0.5==100 && x+y+z==100)
					{
						System.out.println("母鸡="+x+",公鸡="+y+",小鸡="+z);
					}
				}
			}
		}*/
		for (int x=0;x<=33;x++)
		{
			for(int y=0;y<=25;y++)
			{
				int  z=100-x-y;
					if (x*3+y*4+z*0.5==100)
					{
						System.out.println("母鸡="+x+",公鸡="+y+",小鸡="+z);
					}
				
			}
		}
		
		/*猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个，第二天早上又将剩下的桃子吃掉一半，
		又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。
		求第一天共摘了多少。
		*/
		int  t = 1;
		for(int day=1;day<10;day++)
		{
			t = (t+1)*2; 
		}
		System.out.println("第一天摘了"+t+"个桃子");
		
		//讲一个正整数分解成质因数

		/*int  p = 150;
		for(int s = 2;s<=p;s++)
		{
			while(p!=s)
			{
				if(p%s==0)
				{
					System.out.print(s+"*");
					
					p = p/s;
				}
				else
				{
					break;
				}
			    
			}
			
		}
		System.out.print(p);
		*/
		int  p1=150;
		for(int h=2;;)
		{
			if(p1%h==0)
			{
				p1 = p1/h;
				if(p1 != 1)
				{
					System.out.print(h+"*");
				}
				else
				{
					System.out.print(h);
					break;
				}
			}
		}

		
		
		

	}

}
