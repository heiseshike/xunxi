package kzlc;

public class kzlc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x = 0;
        if(x==1){
            System.out.println("x����1");
        }
        System.out.println("x��ֵΪ"+x);
        
        int n = 57;
        if (n % 2 != 0) 
        {
            System.out.println(n+"������");
            System.out.println("�������ʽ����ֵΪ��");
        } 
        else 
        {
            System.out.println(n+"��������");
            System.out.println("�������ʽ����ֵΪ��");
        }
        
        int i = 55;
        if (i <= 100 && i >= 90) 
        {
            System.out.println("�ɼ���A");
        } 
        else if (i >= 80) 
        {
            System.out.println("�ɼ���B");
        } 
        else if (i >= 70) 
        {
            System.out.println("�ɼ���C");
        } 
        else if (i >= 60) 
        {
            System.out.println("�ɼ���D");
        } 
        else 
        {
            System.out.println("�ɼ���E");
        }
        
        //4��һ�򣬰��겻��400��һ��
        int  year =2021;
        
        if (year %400 == 0)
        {
        System.out.println(year+"������");
        }
        else if (year %100 !=0 && year %4==0)
        {
        	System.out.println(year+"������");
        }
        else
        {
        	System.out.println(year+"��������");
        }
        
        int day = 4;
        //byte,short,int,char,string,enum
        //��ֵƥ��
        //switch ����break�˳�
        switch(day)
        {
        case 0:
        	System.out.println("������");
        	break;
        case 1:
        	System.out.println("����һ");
        	break;
        case 2:
        	System.out.println("���ڶ�");
        	break;
        case 3:
        	System.out.println("������");
        	break;
        case 4:
        	System.out.println("������");
        	break;
        case 5:
        	System.out.println("������");
        	break;
        case 6:
        	System.out.println("������");
        	break;
        }
        
        int  month = 6;
        //1,3,5,7,8,10,12->31
        //4,6,9,11->30
        //2
        switch (month)
        {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        	System.out.println("31��");
        break;
        case 4:
        case 6:
        case 9:
        case 11:
        	System.out.println("30��");
        break;
        case 2:
        	System.out.println("28��");
        break;
        default:
        	System.out.println("���벻�Ϸ�");
        break;
        
        }

        int  month1 = 2;
        //1,3,5,7,8,10,12->31
        //4,6,9,11->30
        //2
        switch (month1)
        {
        case 1: 
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        	System.out.println("31��");
        break;
        case 4:
        case 6:
        case 9:
        case 11:
        	System.out.println("30��");
        break;
        case 2:
            //4��һ�򣬰��겻��400��һ��
            if (year %400 == 0)
            {
            System.out.println("29��");
            }
            else if (year %100 !=0 && year %4==0)
            {
            	System.out.println("29��");
            }
            else
            {
            	System.out.println("28��");
            }
        break;
        default:
        	System.out.println("���벻�Ϸ�");
        break;
        }
        
        int score = 89;
        //90-100����
        //80-89 ����
        //70-79 �е�
        //60-69 ����
        //60���²�����
        if (score<0 || score >100)
        {
        	System.out.println("���벻�Ϸ�");
        	return;
        }
        else{
        switch (score/10)
        {
        case 10:
        case 9:
        	System.out.println("����");
        	break;
        case 8:
        	System.out.println("����");
        	break;
        case 7:
        	System.out.println("�е�");
        	break;
        case 6:
        	System.out.println("����");
        	break;
        case 5:
        case 4:
        case 3:
        case 2:
        case 1:
        case 0:
        	System.out.println("������");
        	break;
        }
        }
	}

}
