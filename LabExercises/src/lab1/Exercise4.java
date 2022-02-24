package lab1;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
	}
	static boolean isPrime(int n)
	{
		if(n==1)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

}
