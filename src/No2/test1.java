package No2;

import java.util.Scanner;

/*
 * 2.��д������һԪ���η��̵ĸ�
 * 
 */
public class test1 {
	//��=b^2-4ac��ֵ,����С��0,һԪ���η����޸�.��������0,һԪ���η�����������ȵĸ�.��������0,
	//һԪ���η�������������ȵ�ʵ����
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��������η���ϵ��:");
		int a = input.nextInt();
		System.out.println("������һ�η���ϵ��:");
		int b = input.nextInt();
		System.out.println("������0�η���ϵ��:");
		int c = input.nextInt();
		input.close();
		if(b*b-4*a*c>0) {
			double x1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
		    double x2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
		    System.out.println("���ֱ���:"+x1+" "+x2);
		}else if(b*b-4*a*c==0) {
			double x = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
			System.out.println("����:"+x);
		}else {
			System.out.println("�����޽�");
		}
	}
}
