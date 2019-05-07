package calendar;

import java.util.Scanner;
public class Demo01{
	
	public static void main(String[] args){
		
		int year;//输入年份
		int month;//输入月份
		int totaldays=0;//距离1900年有多少天
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入年");
		year=sc.nextInt();
		System.out.println("请输入月");
		month=sc.nextInt();
		sc.close();
		
		
		//计算年的总天数
		for(int i=1900;i<year;i++){
			if((i%400==0)||(i%4==0&&i%100!=0)){//判断输入的年是否为闰年(2月是29天)
				totaldays+=366;
			}else{
				totaldays+=365;
			}
		}
		//得到当前年当前月距离1900年1月1号的总天数
		totaldays+=monthdays(month,year);
		System.out.println(totaldays);
		System.out.println("-------------"+year+"年"+month+"月日历为---------------");
		//开头
		System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
		
		//该月第一天是星期几，星期几前面就空几格
		int x=1+totaldays%7;
		
		if(x==7){
			x=0;
		}
		for(int i=0;i<x;i++){
			System.out.print("  \t");
		}
		
		int days=monthday(month,year);
		
		int i=1;
		while(i<=days){
			System.out.print(i+"     \t");
			if((i+x)%7==0){
				System.out.println();
			}
			i++;
		}
		
	}
	//月份总天数
	public static int monthdays(int month,int year){
		int totaldays=0;
		for(int i=1;i<month;i++){
			totaldays+=monthday(i,year);
		}
		return totaldays;
	}
	
	//某月天数
	public static int monthday(int month,int year){
 
		if((year%400==0)||(year%4==0&&year%100!=0)){
			int[] arr={0,31,29,31,30,31,30,31,31,30,31,30,31};
			return 	arr[month];	
		}else{
			int[] arr={0,31,28,31,30,31,30,31,31,30,31,30,31};
			return arr[month];
		}
	
	}
	
}