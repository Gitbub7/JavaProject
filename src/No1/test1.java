package No1;

import java.util.Scanner;

/**
 * 1����д����ʵ�ֶԸ����� 4 �������Ӵ�С��˳�����С�
 *
 */
public class test1 {

	public static void main(String[] args) {
		int i = 0;
		int[] array = new int[4];
		Scanner input = new Scanner(System.in);
		for(i = 0;i < 4;i++) {
			System.out.println("�������"+(i+1)+"������");
			int math = input.nextInt();
			array[i] = math;
		}
		input.close();
		for(int j = 0;j<array.length;j++) {
			for(int k = 0;k < array.length-1-j;k++) {
				if(array[k]<array[k+1]) {
					int temp = array[k+1];
					array[k+1]=array[k];
					array[k]=temp;
				}
			}
		}
		System.out.println("�Ӵ�С��˳��:");
		int count = 1;
		for(int a : array) {
			if(count==array.length) {
				System.out.print(a);
			}else {
				System.out.print(a+",");
				count++;
			}
		}
	}
}
