package calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Demo04 {

	// 判断年份是否为闰年
	public static boolean is_Run(int year) {
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			return true;
		}
		return false;
	}
	
	// 获得月份的天数
	public static int monthDays(boolean isRun, int month) {
		if (month == 2) {
			return isRun?29:28;
		}
		if(month==4||month==6||month==9||month==11) {
			return 30;
		}
		return 31;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个年份:");
		int year = input.nextInt();
		System.out.println("输入一个月份:");
		int month = input.nextInt();
		input.close();
		System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		boolean isRun = is_Run(year);
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK)-1;
		int days = monthDays(isRun, month);
		for(int i = 0;i<week;i++) {
			System.out.print("\t");
		}
		for(int j = 1;j<=days;j++) {
			if(j==days||(week+j)%7==0) {
				System.out.print(j);
				System.out.println();
			}else {
				System.out.print(j+"\t");
			}
		}
	}
}
