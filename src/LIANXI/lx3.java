package LIANXI;

public class lx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��Ǯ1000000��3����Ϣ4%�ʵ�һ�����˶��ٵ���Ϣ
		
        double   bq = 1000000;
        double   bq1 = 1000000;
        double   bq2 = 1000000;
        int      yf = 1;
        double   lv = 0.04;
        double   lv1 = 0.003;
        double   lx = 0;
        double   lx1 = 0;
        for (int i = 1;i<=12;i++)
        {
        	lx +=(bq*yf*lv/12);
        	bq = bq+lx;
        }
    	System.out.println("��һ�����Ϣ="+lx);
        
		//��һ�����ȡǮ��Ϣ����0.3%��Ӧ�����ûض���Ǯ	
    	
    	for  (int b = 1;b <= 12;b++)
    	{
        	lx1 +=(bq1*yf*lv1/12);
        	bq1 = bq1+lx1;    		
    	}
    	System.out.println("��һ�����Ϣ="+lx1);
    	
    	System.out.println("ʣ��Ǯ��="+(bq2 +lx1 - lx));
    	
    	//1.�����Ժ�ı�Ϣ�ϼ�
    	double  sum = 1000000;
    	
    	for (int l=0;l<3;l++)
    	{
    		sum =sum*(1+0.04);
    	}

    	//
    	double  month_money =(sum-1000000)/36;
    	
    	System.out.println(month_money);
    	
    	//һ���ȡ��
    	double  sum1 = 1000000*(1+0.003);
    	
    	double refund = sum1 - month_money*12;
    	
    	System.out.println(refund);
    	
	}

}
