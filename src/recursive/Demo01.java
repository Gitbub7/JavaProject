package recursive;

import java.util.Scanner;

/**
 * 	求阶乘
 *
 */
public class Demo01 {

	// 使用递归
	//当math==1时,结束该循环,然后执行15行,将值返回给调用者(即product(n+1)这个方法)
	public static int product(int math) {
		if(math==1) {
			return 1;
		}
		return math*product(math-1);
	}

	public static void main(String[] args) {
		System.out.println(product(5));
		//使用for循环实现
		/*Scanner input =new Scanner(System.in);
		System.out.println("输入一个数:");
		int math = input.nextInt();
		input.close();
		int s = 1;
		for(int i = math;i > 0 ;i--) {
			s*=i;
		}
		System.out.println(s);*/
	}
}
