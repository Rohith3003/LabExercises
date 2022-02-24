package lab1;
import java.util.*;
public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkNumber(n));

	}
	static boolean checkNumber(int n)
	{
		for(int i=0;i<n;i++)
		{
			if(Math.pow(2, i)==n)
			{
				return true;
			}
		}
		return false;
	}

}
