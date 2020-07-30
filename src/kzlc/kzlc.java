package kzlc;

public class kzlc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x = 0;
        if(x==1){
            System.out.println("x等于1");
        }
        System.out.println("x的值为"+x);
        
        int n = 57;
        if (n % 2 != 0) 
        {
            System.out.println(n+"是奇数");
            System.out.println("条件表达式返回值为真");
        } 
        else 
        {
            System.out.println(n+"不是奇数");
            System.out.println("条件表达式返回值为假");
        }
        
        int i = 55;
        if (i <= 100 && i >= 90) 
        {
            System.out.println("成绩是A");
        } 
        else if (i >= 80) 
        {
            System.out.println("成绩是B");
        } 
        else if (i >= 70) 
        {
            System.out.println("成绩是C");
        } 
        else if (i >= 60) 
        {
            System.out.println("成绩是D");
        } 
        else 
        {
            System.out.println("成绩是E");
        }
        
        //4年一闰，百年不润，400年一润
        int  year =2021;
        
        if (year %400 == 0)
        {
        System.out.println(year+"是闰年");
        }
        else if (year %100 !=0 && year %4==0)
        {
        	System.out.println(year+"是闰年");
        }
        else
        {
        	System.out.println(year+"不是闰年");
        }
        
        int day = 4;
        //byte,short,int,char,string,enum
        //等值匹配
        //switch 见到break退出
        switch(day)
        {
        case 0:
        	System.out.println("星期日");
        	break;
        case 1:
        	System.out.println("星期一");
        	break;
        case 2:
        	System.out.println("星期二");
        	break;
        case 3:
        	System.out.println("星期三");
        	break;
        case 4:
        	System.out.println("星期四");
        	break;
        case 5:
        	System.out.println("星期五");
        	break;
        case 6:
        	System.out.println("星期六");
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
        	System.out.println("31天");
        break;
        case 4:
        case 6:
        case 9:
        case 11:
        	System.out.println("30天");
        break;
        case 2:
        	System.out.println("28天");
        break;
        default:
        	System.out.println("输入不合法");
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
        	System.out.println("31天");
        break;
        case 4:
        case 6:
        case 9:
        case 11:
        	System.out.println("30天");
        break;
        case 2:
            //4年一闰，百年不润，400年一润
            if (year %400 == 0)
            {
            System.out.println("29天");
            }
            else if (year %100 !=0 && year %4==0)
            {
            	System.out.println("29天");
            }
            else
            {
            	System.out.println("28天");
            }
        break;
        default:
        	System.out.println("输入不合法");
        break;
        }
        
        int score = 89;
        //90-100优秀
        //80-89 良好
        //70-79 中等
        //60-69 及格
        //60以下不及格
        if (score<0 || score >100)
        {
        	System.out.println("输入不合法");
        	return;
        }
        else{
        switch (score/10)
        {
        case 10:
        case 9:
        	System.out.println("优秀");
        	break;
        case 8:
        	System.out.println("良好");
        	break;
        case 7:
        	System.out.println("中等");
        	break;
        case 6:
        	System.out.println("及格");
        	break;
        case 5:
        case 4:
        case 3:
        case 2:
        case 1:
        case 0:
        	System.out.println("不及格");
        	break;
        }
        }
	}

}
