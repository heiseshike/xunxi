package kzlc;

public class kzlc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  m = 12;
		int  n = 8;
		int  result=1;
		for (int i=1;i<=n;i++)
		{
			if(m%i==0 && n%i==0)
			{
				result = i;
			}
		}
		System.out.println(m+"��"+n+"���Լ��:"+result);
		
		int  m1 = 12;
		int  n1 = 8;
		int  result1=m1>n1?n1:m1;
		for (int i=result1;i>=1;i--)
		{
			if(m1%i==0 && n1%i==0)
			{
				result1 = i;
				break;
			}
		}
		System.out.println(m+"��"+n+"���Լ��:"+result1);
		
		//��ӡ20���ڵ�����
		//return��������������break������ѭ������continue����������ѭ���������´�ѭ����
        for (int i = 1; i < 20; i++) 
        {
            if (i % 2 == 0) 
            {
                continue;
            }
            System.out.println("����="+i);
        }
        
        label1: for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                System.out.print(j+" ");
                if (j == 5) 
                {
                    break label1;
                }
            }
        }
        
        label2: for (int i = 0; i < 10; i++) 	
        {
            System.out.print("\n");
            for (int j = 0; j < 10; j++) 
            {
                System.out.print(j + " ");
                if (j == 5) 
                {
                    continue label2;
                }
            }
        }

	}

}
