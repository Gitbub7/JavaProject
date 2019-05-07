package array;

import java.util.Scanner;

/**
 * 数组的删除
 *
 */
public class Test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] oldArray = { 1, 2, 4, 5, 62, 4, 67, 9, 0 };
		System.out.println("原数组为:");
		for (int old : oldArray) {
			System.out.print(old + " ");
		}
		System.out.println();
		w: while (true) {
			System.out.println("请输入要删除元素的下标(下标从0开始,输入负数结束):");
			int math = input.nextInt();
			// 创建一个新的数组来接收除了要删除元素的所有元素
			int[] newArray = new int[oldArray.length - 1];
			if (math >= 0 && math <= oldArray.length - 1) {
				for (int i = 0; i < oldArray.length; i++) {
					if (i < math) {
						newArray[i] = oldArray[i];
					}
					if (i > math) {
						newArray[i - 1] = oldArray[i];
					}
				}
				oldArray = newArray;
				System.out.println("删除元素后的数组为:");
				for (int array : oldArray) {
					System.out.print(array + " ");
				}
				System.out.println();
			} else if (math > oldArray.length-1) {
					System.out.println("输入的下标超出范围了,请输入0~"+(oldArray.length-1)+"之间的数字!");
			} else {
				input.close();
				System.out.println("删除元素后的数组为:");
				for (int array : oldArray) {
					System.out.print(array + " ");
				}
				break w;
			}
		}
	}
}
