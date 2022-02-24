package lab6;

import java.util.*;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// getting input from user
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		getSorted(arr);
		for (int x : arr)
			System.out.println(x);

	}

	// this method reverses the elements of arrays and return a sorted array of
	// reversed elements.
	static int[] getSorted(int arr[]) {
		// reversing elements of array
		for (int i = 0; i < arr.length; i++) {
			int num = 0, rev = 0;
			num = arr[i];
			while (num > 0) {
				rev = rev * 10 + (num % 10);
				num /= 10;
			}
			arr[i] = rev;
		}
		Arrays.sort(arr); // sorts the elements of array
		return arr;
	}

}
