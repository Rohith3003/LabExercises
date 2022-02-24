package lab1;
import java.util.Scanner;
public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(calculateDifference(n));

	}
	static int calculateDifference(int n)
	{
		int sum=0,squareSum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+i;
			squareSum = squareSum+i*i;
		}
		return sum*sum-squareSum;
	}

}
