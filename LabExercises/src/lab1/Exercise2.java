package lab1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String choice = sc.next().toLowerCase();  // getting the choice of user and converting it to lower case
		switch(choice)
		{
			case "red": System.out.println("Stop");
			 			break;
			case "orange": System.out.println("Ready");
							break;
			case "green": System.out.println("Go");
			break;
			default: System.out.println("Invalid choice");
	}
	}
}
