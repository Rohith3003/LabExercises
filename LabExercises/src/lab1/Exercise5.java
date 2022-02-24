package lab1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(calculateSum(n));
	}
	static int calculateSum(int n)
	{
		int i = 0, count = 0;
		int sum = 0;
		while (count <= n) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
				count++;
			}
			i++;
		}
		return sum;
	}

}
