package login;

import java.util.Scanner;

/**
 * 1.用一个数组接收用户输入的账户和密码保存, 2.登录账户密码,判断是否登录成功,3.退出 每次登录只有三次机会
 *	注册后给用户选择是否继续的操作;
 *	登录失败后给用户选择是否继续的操作
 */
public class Login {

	public static void main(String[] args) {
		// 定义一个二维数组来接收用户输入的账户和密码
		String[][] oldLogin = new String[0][2];// 0:不确定有多少个用户可以用来扩展数组.2:只用来接收账户和密码两个元素
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("======欢迎来到账号管理界面======");
			System.out.println("1.注册账户");
			System.out.println("2.登录账户");
			System.out.println("3.退出");
			System.out.println("请选择:");
			String math = input.next();
			if ("1".equals(math)) {
				w: while (true) {
					// 创建一个新的数组用来存储数据
					String[][] newLogin = new String[oldLogin.length + 1][2];
					// 将旧的账户数组遍历给新的数组
					for (int i = 0; i < oldLogin.length; i++) {
						newLogin[i][0] = oldLogin[i][0];
						newLogin[i][1] = oldLogin[i][1];
					}
					String userName = "";
					a: while (true) {
						System.out.println("请输入用户名:");
						userName = input.next();
						if (newLogin[0][0] != null) {
							for (int j = 0; j < newLogin.length; j++) {
								if (newLogin[j][0] != null) {
									if (newLogin[j][0].equals(userName)) {
										System.out.println("该账户的用户名已被注册过了,请重新输入!");
										break;
									} else if (j == newLogin.length - 2) {
										break a;
									}
								} else {
									break a;
								}
							}
						} else {
							break;
						}
					}
					System.out.println("请输入密码:");
					String passWord = input.next();
					newLogin[newLogin.length - 1][0] = userName;
					newLogin[newLogin.length - 1][1] = passWord;
					oldLogin = newLogin;
					while (true) {
						System.out.println("是否继续添加?");
						System.out.println("1.继续添加");
						System.out.println("2.回到主界面");
						System.out.println("请选择:");
						String temp = input.next();
						if ("1".equals(temp)) {
							continue w;
						} else if ("2".equals(temp)) {
							break;
						} else {
							System.out.println("没有这个功能,请重新输入!");
						}
					}
					break;
				}
			} else if ("2".equals(math)) {
				System.out.println("本次登录只有3次机会哦,请谨慎!");
				int count = 0;
				w2: while (count <= 3) {
					System.out.println("请输入用户名:");
					String userName = input.next();
					System.out.println("请输入密码:");
					String passWord = input.next();
					for (int j = 0; j < oldLogin.length; j++) {
						if (userName.equals(oldLogin[j][0]) && passWord.equals(oldLogin[j][1])) {
							System.out.println("登录成功......");
							System.exit(0);
						} else if (j == oldLogin.length - 1) {
							System.out.println("登录失败,账户或密码错误!");
							count++;
							if (count <= 3) {
								System.out.println("您还剩" + (3 - count) + "次机会");
								while (true) {
									System.out.println("是否继续登录?");
									System.out.println("1.继续登录");
									System.out.println("2.回到主界面");
									System.out.println("请选择:");
									String temp = input.next();
									if ("1".equals(temp)) {
										continue w2;
									} else if ("2".equals(temp)) {
										break;
									} else {
										System.out.println("没有这个功能,请重新输入!");
									}
								}
								break w2;
							} else {
								System.out.println("给了你三次机会,你还错?你已经没有任何机会了,拜拜!");
								System.exit(0);
							}
						}
					}
				}
			} else if ("3".equals(math)) {
				input.close();
				System.out.println("程序退出.......");
				System.exit(0);
			} else {
				System.out.println("没有这个功能,请重新输入!");
			}
		}
	}
}
