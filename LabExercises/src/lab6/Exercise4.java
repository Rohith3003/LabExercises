package lab6;

import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// getting input from user
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the registration number of Student");
			String regNumber = sc.next();
			System.out.println("Enter the marks of Student");
			int marks = sc.nextInt();
			map.put(regNumber, marks);
		}
		System.out.println(getStudents(map));
	}

//this method verifies whether a student is eligible for a medal or not and also which type of medal
	// and returns a map of students and their eligible medal
	static Map<String, String> getStudents(HashMap<String, Integer> map) {
		HashMap<String, String> medals = new HashMap<String, String>();
		@SuppressWarnings("rawtypes")
		Set set = map.entrySet(); // getting the entries into a set for traversing
		Iterator it = set.iterator();
		while (it.hasNext()) { // checking eligibility and adding them to hashmap
			@SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry) it.next();
			if ((int) entry.getValue() >= 90)
				medals.put((String) entry.getKey(), "Gold");
			else if ((int) entry.getValue() >= 80 && (int) entry.getValue() < 90)
				medals.put((String) entry.getKey(), "Silver");
			else if ((int) entry.getValue() >= 70 && (int) entry.getValue() < 80)
				medals.put((String) entry.getKey(), "Bronze");

		}
		return medals;
	}

}
