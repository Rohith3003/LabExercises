package lab6;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap map = new HashMap();
		// getting input from user into hashmap
		System.out.println("enter the number of entries:");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Integer a = sc.nextInt();
			Integer b = sc.nextInt();
			map.put(a, b);
		}
		System.out.println(getValues(map));

	}

	// this method sorts the values of hashmap and returns them as a list
	static List getValues(HashMap map) {
		// getting the values from hashmap into a list
		Set set = map.entrySet();
		List list = new ArrayList<>();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			list.add(entry.getValue());
		}
		Collections.sort(list); // sorting the list of values
		return list;
	}

}
