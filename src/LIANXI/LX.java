package LIANXI;

public class LX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���
		
		int a = 10,b = 20,c = 0;
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		System.out.println("a="+a+"b="+b);
		//����һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12ע���ֽ����ּȿ����ȳ���ģҲ������ģ�����
		//�ȳ���Ĥd/Ϊ%10
		
		int  d = 251;
		int  e = d/100%10;
		int  f = d/10%10;
		int  g = d%10;
		int sum = e+f+g;
		System.out.println(d+"�Ľ����"+ sum);
		
		//�����¶Ⱥ������¶Ȼ���ת�����ӻ��϶ȱ�����϶���ֻҪ��ȥ32��
		//����5�ٳ���9�����ˣ������϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32���С�
		
		double s = 32.5;
		double h = s*9/5+32;
		System.out.println(h);
		
		double s1 = (h-32)*5/9;
		System.out.println(s1);
		
		//����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ��
		
		
		char  k = 'A';
		char  l = (char)(k+32);
		System.out.println(l);
		

	}

}
