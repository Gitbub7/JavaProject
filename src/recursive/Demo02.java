package recursive;
/**
 * 	一列数的规则如下: 1、1、2、3、5、8、13、21、34 ，求第10位数是多少？使用递归实现
 *
 */
public class Demo02 {

	public static int f1(int math) {
		if(math<=2) {
			return 1;
		}
		return f1(math-1)+f1(math-2);
	}
	
	public static void main(String[] args) {
		//System.out.println(f1(10));
		//使用for循环
		int s1=1;
		int s2=1;
		int s3=1;
		for(int i = 8;i > 0;i--) {
			s1=s2;
			s2=s3;
			s3=s1+s2;
		}
		System.out.println(s3);
	}
}
