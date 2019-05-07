package calendar;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 使用Calendar工具完成万年历
 *
 */
public class CalendarDemo03 {

	// 获得输入月份的天数
	public static int monthDays(int year, int month) {
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			int[] arr = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			return arr[month];
		} else {
			int[] arr = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			return arr[month];
		}
	}

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个年份:");
		int year = input.nextInt();
		System.out.println("输入一个月份:");
		int month = input.nextInt();
		input.close();
		System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		// 设置日期
		c.set(year, month - 1, 1);
		// 获得输入年份第一天的星期
		int week = c.get(Calendar.DAY_OF_WEEK) - 1;
		for (int i = 0; i < week; i++) {
			System.out.print("\t");
		}
		int days = monthDays(year, month);
		for (int day = 1; day <= days; day++) {
			if (day == days || (week + day) % 7 == 0) {
				System.out.print(day);
				System.out.println();
			} else {
				System.out.print(day + "\t");
			}
		}
	}
}
