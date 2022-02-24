package lab6;

import java.util.*;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char arr[] = new char[n];
		// getting input from user
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next().charAt(0);
		}
		System.out.println(countChars(arr));

	}

	// counts the number of times character repeated and stores frequency in the
	// hashmap and returns it.
	static Map countChars(char arr[]) {
		HashMap map = new HashMap<>();
		int freq[] = new int[255];
		// calculating the frequency of characters
		for (int i = 0; i < arr.length; i++) {
			freq[(int) arr[i]]++;
		}
		// storing the character and corresponding frequency in hashmap
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				map.put((char) i, freq[i]);
			}
		}
		return map;
	}

}
