package kzlc;

public class kzlc4 {

	public static void main(String[] args) {
		for(int s=0;s<3;s++)
		{
			System.out.println("***");
		}
		for (int l=0;l<3;l++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("*");
			}
			//��ӡ����
			//System.out.println();
			System.out.print("\n");
		}		
		
		
		//99�˷���
		for (int i=1;i<=9;i++)
		{
			for(int g=1;g<=i;g++)
			{
				System.out.print(i+"*"+g+"="+(i*g)+"\t");
			}
			System.out.println("                  ");
		}
		int sum = 0;
		for(int w=1;;w++)
		{
			sum += w;
			if(sum>=660)
			{
				System.out.println(sum);
				System.out.println(w);
				break;//�˳�����ѭ�� go to here
			}
		}
		//here 
		//return�������У�break������ǰѭ��
		
		//�ж�num�ǲ�������
		int   num = 29;
		int     z = 2;
		for(;z<=num-1;z++)
		{
			if(num%z==0)
			{
			//������
			System.out.println("��������");
			break;
			}
		}
		
		if (z==num)
		{
			//break����
			System.out.println("������");
		}
		
		int   num1 = 97;
		
		boolean  flag = true;//������
		for(int z1 = 2;z1<=num1-1;z1++)
		{
			if(num1%z1==0)
			{
			//������
			flag = false;//��������
			System.out.println("��������");
			break;
			}
		}
		
		if (flag)//һ������û����
		{
			//break����
			System.out.println("������");
		}
		
		//��дһ�������ҳ�����200����С������
		
		for (int num2=200;;num2++)
		{
			boolean  flag1 = true;//������
			for(int z2 = 2;z2<=num2-1;z2++)
			{
				if(num2%z2==0)
				{
				//������
				flag1 = false;//��������
				//System.out.println("��������");
				break;
				}
			}
			
			if (flag1)//һ������û����
			{
				//break����
				//System.out.println("������");
				System.out.println(num2);
				break;
			}
		}
		

	}

}
