package lab09;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		String userName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name");
		// getting user input
		userName = sc.next();
		
		// calling the validate function and checking for true
		if (validate(userName)) {
			System.out.println("username validated and registration is successfull");
		} else {
			System.out.println("user Name is not as per standards please change the user name");
		}

	}

	//this method validates the given input string whether it is ending with "_job" and having
	// minimum 8 characters before "_job"
	static boolean validate(String userName) {
		int ind = userName.lastIndexOf("_");
		if ((ind > 7) && userName.endsWith("_job")) {
			return true;
		}
		return false;
	}

}
