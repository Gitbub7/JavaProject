package 猜数字;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//判断质数
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个数判断是否为质数:");
		int math = input.nextInt();
		boolean flag = false;
		for(int i = 2;i<math;i++) {
			if(math%i==0) {
				flag=true;
				break;
			}
		}
		input.close();
		String str = flag?"不是质数":"是质数";
		System.out.println(str);
	}
}
