package licensing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 	模拟斗地主发牌
 *
 */
public class Landlord {

	public static void main(String[] args) {
		//创建一副牌
		List<String> list = new ArrayList<String>();
		String[] arr = {"黑桃","红桃","梅花","方块"};
		String[] arr2 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		//合并数组
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr2.length;j++) {
				list.add(arr[i]+arr2[j]);
			}
		}
		//还有小王和大王
		list.add("小王");
		list.add("大王");
		//System.out.println(list.size());
		//洗牌
		//使用Collections工具类,有一个方法使集合打乱
		Collections.shuffle(list);
		//发牌
		//需要三个对象来接收17张牌,最后留三张底牌
		List<String> farmer1 = new ArrayList<String>();
		List<String> farmer2 = new ArrayList<String>();
		List<String> Landlord = new ArrayList<String>();
		//每人一张的发牌
		for(int k = 0;k<list.size()-3;k++) {
			//取3的余数就能每次都三张不同的牌了
			if(k%3==0) {
				farmer1.add(list.get(k));
			}else if(k%3==1) {
				farmer2.add(list.get(k));
			}else if(k%3==2) {
				Landlord.add(list.get(k));
			}
		}
		System.out.println("农民1"+farmer1);
		System.out.println("农民2"+farmer2);
		System.out.println("地主"+Landlord);
		//底牌
		System.out.println("-----------------------");
		System.out.println("底牌是:");
		for(int l = list.size()-3;l<list.size();l++) {
			System.out.print(list.get(l)+" ");
		}
	}
}
