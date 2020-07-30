package LIANXI;

public class lx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//本钱1000000存3年利息4%问第一年拿了多少的利息
		
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
    	System.out.println("第一年的利息="+lx);
        
		//第一年结束取钱利息按照0.3%算应可以拿回多少钱	
    	
    	for  (int b = 1;b <= 12;b++)
    	{
        	lx1 +=(bq1*yf*lv1/12);
        	bq1 = bq1+lx1;    		
    	}
    	System.out.println("第一年的利息="+lx1);
    	
    	System.out.println("剩余钱数="+(bq2 +lx1 - lx));
    	
    	//1.三年以后的本息合计
    	double  sum = 1000000;
    	
    	for (int l=0;l<3;l++)
    	{
    		sum =sum*(1+0.04);
    	}

    	//
    	double  month_money =(sum-1000000)/36;
    	
    	System.out.println(month_money);
    	
    	//一年就取了
    	double  sum1 = 1000000*(1+0.003);
    	
    	double refund = sum1 - month_money*12;
    	
    	System.out.println(refund);
    	
	}

}
