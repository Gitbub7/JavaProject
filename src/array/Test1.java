package array;

import java.util.Scanner;

/**
 * 	数组的扩展(动态数组)
 *
 */
public class Test1 {

	//死循环添加数据,-1结束
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//建立一个空数组来存储数据
		int[] oldArray = new int[0];
		int i = 0;
		while(true) {
			System.out.println("请输入第"+(i+1)+"个数字(输入负数结束):");
			int math = input.nextInt();
			if(math<0) {//判断,输入为负数结束程序
				input.close();
				System.out.println("数据为:");
				//遍历出,添加进去的数字
				for(int array:oldArray) {
					System.out.print(array+" ");
				}
				return;
			}else {
				//创建一个新数组,长度为oldArray.length+1
				int[] newArray = new int[oldArray.length+1];
				//先将旧数组中的数据全部遍历出来赋值给新数组
				for(int j = 0;j < oldArray.length;j++) {
					newArray[j]=oldArray[j];
				}
				//新数组的最后一个元素为输入的数字
				newArray[newArray.length-1]=math;
				//累加,显示第几个数字
				i++;
				//输入一次数字后将新的数组每次都赋值给旧的数组,这样再输入数字的时候,拿到的数组就是上次得到的新数组
				oldArray=newArray;
			}
		}
	}
}
