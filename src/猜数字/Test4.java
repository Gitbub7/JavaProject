package 猜数字;

public class Test4 {

	/**
	 * 1-100质数的和
	 */
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 2;i<=100;i++) {
			boolean flag=false;
			for(int j = 2;j<i;j++) {
				if(i%j==0) {
					flag=true;
				}
			}
			if(flag==false) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("1-100质数的和为:"+sum);
	}
}
