package com.neuedu.test;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 
		 * \r�ص�����
		 * \n����
		 * 
		 * ��eclipse�����У�����Ч��һ��
		 * 
		 * \b�˸�
		 * \t��ʾһ��tab�ո�
		 * ��eclipse������,���Բ�����
		 * 
		 * 0-9��ʮ����48
		 * A-Z��ʮ����65
		 * a-z��ʮ����97
		 * 
		 * */
		char a = 'a';
		char b = '��';
		
		char c = '\u03A6';
		char d = '\u9fa5';
		
		char e = '\t';
		char f = '\'';
		String g = "\"";
		
		System.out.println(a);
		System.out.print(b);
		System.out.print('\b');
		System.out.println(c);
		System.out.println(d);
		System.out.print(e);
		System.out.print(f);
		System.out.println(g);
		
		
	    System.out.println("escape\\bchar");
	    System.out.println("escape\\tchar");
	    System.out.println("escape\\rchar");
	    System.out.println("escape\\nchar");
	    System.out.println("\\����б����\\");
	    System.out.println("\'���ڵ�������\'");
	    System.out.println("\"����˫������\"");
	    System.out.println("��û��˫����");
	    
	    boolean  flag = true;
	    boolean  flag2= false;

	}

}
