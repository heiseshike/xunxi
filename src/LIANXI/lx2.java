package LIANXI;

public class lx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ж�һ�������Ƿ��ܱ�5��6ͬʱ��������ӡ�ܱ�5��6����������ֻ�ܱ�5��������ӡ�ܱ�5������
		//��ֻ�ܱ�6����������ӡ�ܱ�6�����������ܱ�5��6����������ӡ���ܱ�5��6������
		
		int   sum = 30;
		
		if (sum%5 ==0 && sum%6 ==0)
		{
			System.out.println("�ܱ�5��6����");
		}
		else if(sum%5 ==0 && sum%6 !=0)
		{
			System.out.println("�ܱ�5����");
		}
		else if(sum%5 !=0 && sum %6 == 0)
		{
			System.out.println("�ܱ�6����");
		}
		else
		{
			System.out.println("���ܱ�5��6����");
		}
		//���0-9֮����������ǲ�����5��
		
		int   i = 0;
		for (;i<=9;i++)
		{ if (i!=5)
		{
			System.out.println("i="+i);
		}
		}
		//�ж�һ�����ǲ���������������������1�ͱ������ⲻ�ܱ�������������
		int  u = 9;
		for(int p=2;u<=(p-1)/2;p++)
		{
			if(u%p==0)
			{
				System.out.println("��������");
				return;
			}
		System.out.println("������");
		}


	}

}
