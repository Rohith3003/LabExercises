package lab3;
import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(isPositive(str.toLowerCase()));
		
	}
	static boolean isPositive(String str)
	{
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)>str.charAt(i+1))
			{
				return false;
			}
		}
		return true;
	}

}
