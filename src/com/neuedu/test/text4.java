package com.neuedu.test;

public class text4 {

	public static void main(String[] args) {
		//ʮ����
		int a = 10;
		
		//ʮ������
		int b =0x10;//16
		
		//�˽���
		int c = 010;//8
		
		//������
		int d = 0b100;//4
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//���ƻ�ת
		//ʮ����-��ʮ�����ˣ���(����ȡ�෨)
		//ʮ�����ˣ��� -��ʮ���ƣ�Ȩ�ӷ���
		//ʮ�����ˡ�-��������
		
		//ʮ����ת����������
		System.out.println(Integer.toBinaryString(100));//������
		System.out.println(Integer.toHexString(100));//ʮ������
		System.out.println(Integer.toOctalString(100));//�˽���
		

	}

}
