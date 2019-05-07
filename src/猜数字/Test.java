package 猜数字;
import java.util.Scanner;

public class Test {

	public static void main1(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + " ");
			}
			System.out.println();
		}
	}

	// 产生随机数(1-100),猜数字,只有十次,错了给出相应的提示
	public static void main(String[] args) {
		int count = 0;// 用来计数
		int num = (int) (Math.random() * 100) + 1;
		Scanner input = new Scanner(System.in);
		System.out.println("随机数是" + num);
		for (count = 0; count < 10; count++) {
			System.out.println("输入一个数,猜猜我是谁?");
			int math = input.nextInt();
			if (count == 0 && math == num) {
				System.out.println("你是我肚子里的蛔虫吗?一次就中了!nb");
				return;
			} else if (count > 1 && count < 5 && num == math) {
				System.out.println("中了,看来你我之间还是有点默契的");
				return;
			} else if (count > 5 && count < 10 && num == math) {
				System.out.println("行吧,算你运气好,猜中了");
				return;
			} else if (count == 9 && num != math) {
				System.out.println("给你10次机会都不到,咸鱼,拜拜!");
				return;
			}
			if (math - num > 0) {
				if (math - num > 50) {
					System.out.println("大太多了,重来!");
				} else if (math - num > 30) {
					System.out.println("还是大了,再来");
				} else if (math - num > 10) {
					System.out.println("还大一点点,加油");
				} else {
					System.out.println("成功就在手边,再小一点就可以了");
				}
			} else if (math - num < 0) {
				if (num - math > 50) {
					System.out.println("小太多了,重来!");
				} else if (num - math > 30) {
					System.out.println("还是小了,再来");
				} else if (num - math > 10) {
					System.out.println("还小一点点,加油");
				} else {
					System.out.println("成功就在手边,再大一点就可以了");
				}
			}
		}
	}
}
