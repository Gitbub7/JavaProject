package No2;

import java.util.Scanner;

/*
 * 2.编写程序求一元二次方程的根
 * 
 */
public class test1 {
	//△=b^2-4ac的值,若△小于0,一元二次方程无根.若△等于0,一元二次方程有两个相等的根.若△大于0,
	//一元二次方程有两个不相等的实数根
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入二次方的系数:");
		int a = input.nextInt();
		System.out.println("请输入一次方的系数:");
		int b = input.nextInt();
		System.out.println("请输入0次方的系数:");
		int c = input.nextInt();
		input.close();
		if(b*b-4*a*c>0) {
			double x1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
		    double x2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
		    System.out.println("根分别是:"+x1+" "+x2);
		}else if(b*b-4*a*c==0) {
			double x = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
			System.out.println("根是:"+x);
		}else {
			System.out.println("方程无解");
		}
	}
}
