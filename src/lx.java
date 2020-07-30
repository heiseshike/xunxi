
public class lx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    /*自动类型转换*/
	    int i1 = 12;
	    int i2 = 45;
	    double d1 = (i1 + i2) * 1.0;//系统将转换为double型运算
	    System.out.println(d1);
	    /*自动类型转换*/
	    float f3 = 12.3f;//必须加f
	    long l1 = 12300;
	    long l2 = 300000000000L;//必须加l
	    float f = l1 + l2 + f3;//系统将转换为float型计算
	    System.out.println(f);
	    String s;
	    byte m1=1;
	    byte m2=3;
	    byte m = (byte)(m1+m2);
	    /*强制类型转换*/
	    long l = (long)f;//强制转换会舍去小数部分（不是四舍五入）
	    System.out.println(l);
	    /*强制类型转换*/
	    byte b1 = 67;
	    byte b2 = 89;
	    byte b3 = (byte)(b1 + b2);//系统将转换为int型运算，需要强制转换符
	    System.out.println(b3);

	}

}
