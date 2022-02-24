package lab6;

import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// getting input from user
		System.out.println("Enter the number of elements you want to store:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(getSecondSmallest(arr));
	}

	// this method finds the second smallest element of array
	static int getSecondSmallest(int arr[]) {
		// adding array elements into a list
		List<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			al.add(arr[i]);
		}
		Collections.sort(al); // sorting the array
		return (int) al.get(1);
	}

}
