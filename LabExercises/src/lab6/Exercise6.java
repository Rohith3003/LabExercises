package lab6;

import java.time.LocalDate;
import java.util.*;

public class Exercise6 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		// getting input from user
		System.out.println("Specify the number of entries");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the id:");
			int id = sc.nextInt();
			System.out.println("Enter the year of birth");
			int year = sc.nextInt();
			map.put(id, year);
		}
		System.out.println(votersList(map));

	}

	// this method compares the age of person and returns the eligible id's for
	// voting from the hashmap as a list
	static List votersList(HashMap<Integer, Integer> map) {
		System.out.println(map.getClass().getName());
		List<Integer> eligibleList = new ArrayList<>();
		LocalDate cd = LocalDate.now(); // getting current year
		// checking eligibility i.e. whether age is greater than 18 or not.
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			int year = (int) m.getValue();
			if ((cd.getYear() - year) > 18)
				eligibleList.add((int) m.getKey());
		}
		return eligibleList;

	}

}
