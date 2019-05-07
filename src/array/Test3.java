package array;

public class Test3 {

	// 选择排序法
	/*
	 * 其实就是将数组从下标为0开始的值和后面所有的值进行比较,小的放前面.依次类推
	 */
	public static void main1(String[] args) {
		int[] array = { 1, 5, 2, 3, 12, 4 };
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
				break;
			}
			System.out.print(array[i] + ",");
		}
	}

	// 冒泡(气泡)排序法
	/*
	 * 就是将相邻的两个值进行比较,这样将得到最大的值放在最后
	 */
	public static void main(String[] args) {
		int[] array = { 1, 5, 2 ,4 ,6};
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
				break;
			}
			System.out.print(array[i] + ",");
		}
	}
}
