package calendar;

import java.util.Scanner;

/**
 * 	万年历
 *
 */
public class Demo00 {

	//获得输入月的天数
	public static int monthDays(int i,int month) {
		if(i%400==0||i%4==0&&i%100!=0) {
			int[] arr = {0,31,29,31,30,31,30,31,31,30,31,30,31};
			return arr[month];
		}else {
			int[] arr = {0,31,28,31,30,31,30,31,31,30,31,30,31};
			return arr[month];
		}
	}
	
	//获得输入月到1月1日的天数
	public static int monthsDays(int year,int month) {
		int sum = 0;
		for(int i = 1;i<month;i++) {
			sum+=monthDays(i,i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个年份:");
		int year = input.nextInt();
		System.out.println("输入一个月份:");
		int month = input.nextInt();
		input.close();
		int yearDays = 0;
		for(int i = 1900;i<year;i++) {
			if(i%400==0||i%4==0&&i%100!=0) {
				yearDays+=366;
			}else {
				yearDays+=365;
			}
		}
		System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		int TotalYearsMonthsDays = yearDays + monthsDays(year,month);
		int week = TotalYearsMonthsDays%7+1;
		if(week==7) {
			week=0;
		}
		for(int j = 0;j<week;j++) {
			System.out.print("\t");
		}
		int days = monthDays(year,month);
		for(int day = 1;day<=days;day++) {
			if(day==days||(week+day)%7==0) {
				System.out.print(day);
				System.out.println();
			}else {
				System.out.print(day+"\t");
			}
		}
	}
}
