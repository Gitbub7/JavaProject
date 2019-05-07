package 猜数字;

public class Test3 {

	public static void main(String[] args) {
		for (int i = 1; i < 7; i++) {// 控制行数
			for (int j = 0; j < 6 - i; j++) {// 控制空格
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {// 控制*的输出
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 5; i > 0; i--) {
			for (int j = 5; j > i-1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
