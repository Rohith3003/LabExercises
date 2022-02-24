package lab3;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(modifyNumber(num));

	}

	static int modifyNumber(int num) {
		String str = String.valueOf(num);
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == str.length() - 1) {
				res = res + str.charAt(i);
			} else {
				int dig1 = (int) str.charAt(i);
				int dig2 = (int) str.charAt(i + 1);
				res = res + (Math.abs(dig1 - dig2));
			}
		}
		return Integer.parseInt(res);
	}

}
