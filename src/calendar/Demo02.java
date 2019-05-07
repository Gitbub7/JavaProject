package calendar;

import java.util.Scanner;

public class Demo02 {

	// 计算输入月份到当前年的1月1日的天数
	public static int monthDays(int year, int month) {
		int sum = 0;
		for (int i = 1; i < month; i++) {// 月份从1开始
			sum += monthDay(year, i);
		}
		return sum;
	}

	// 判断输入年份并计算输入月份的天数
	public static int monthDay(int year, int month) {
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			// 闰年月份数组,多添加一个0,正好可以表示月份对应的下标
			int[] leapYear = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			return leapYear[month];
		} else {
			int[] averageYear = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			return averageYear[month];
		}
	}

	public static void main(String[] args) {
		int year;// 输入年份
		int month;// 输入月份
		int totaldays = 0;// 距离1900年有多少天
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份:");
		year = input.nextInt();
		System.out.println("请输入月份:");
		month = input.nextInt();
		input.close();

		// 计算当前年离1900年1月1日有多少天
		for (int i = 1900; i < year; i++) {
			if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0)) {// 判断年份是否为闰年(2月有29天)
				totaldays += 366;
			} else {
				totaldays += 365;
			}
		}

		// 得到当前月距离当前年1月1号的总天数
		totaldays += monthDays(year, month);
		// 输出星期表头
		System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");

		// 因为一个星期是从星期日开始的,而计算机是1-7这样计算的
		int x = 1 + totaldays % 7;// 范围在1~7中,7表示周日,以此类推
		if (x == 7) {// x=7说明,totaldays%7==6是代表周六,+1就是周日了
			x = 0;// 周日赋值为0,不用空格
		}
		// 该月第一天是星期几,前面就空几格
		for (int i = 0; i < x; i++) {
			System.out.print("  \t");
		}
		// 获取当月的天数
		int days = monthDay(year, month);
		// 打印日历
		int i = 1;
		while (i <= days) {
			if ((x + i) % 7 == 0 || i == days) {// 判断换行,如果星期加上输出了日期能整除7,说明是一周的最后一天.或者已经是最后一天了
				System.out.print(i);
				System.out.println();
			} else {
				System.out.print(i + "     \t");
			}
			i++;
		}
	}
}
