package lab6;

import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		//getting input from user
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(getSquares(arr));
	}

	// generates the squares of array elements and return them as hashmap with
	// element as key and square of element as value.
	static Map getSquares(int arr[]) {
		HashMap map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int square = arr[i] * arr[i];
			map.put(arr[i], square);
		}
		return map;
	}

}
