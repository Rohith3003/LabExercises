package com.cg.eis.pl;

import com.cg.eis.bean.*;
import com.cg.eis.service.*;
import java.util.*;

public class userInterface {
	public static void main(String[] args) {
		boolean b = true;
		Service service = new Service();
		while (b) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to sevice portal");
			System.out.println("Enter your choice from the below options");
			System.out.println("1 for registering a new employee");
			System.out.println("2 for getting employee details");
			System.out.println("Enter exit for closing Service portal");
			String choice = sc.nextLine();
			switch (choice) {
			case "1":
				service.getDetails();
				break;
			case "2":
				service.displayDetails();
				break;
			case "exit":
				b=false;
				break;
			default:
				System.out.println("Enter valid Service Name");
			}
		}
		System.out.println("Thank you. Visit us again for any queries/Updates");

	}

}
