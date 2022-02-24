package lab1;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextLong();                //getting input
		System.out.println(cubesSum(num)); //calling the cubesSum function

	}
//method to find the sum of the cubes of the digits of an n digit number
	static long cubesSum(long num)
	{
		long sum=0;
		int dig;
		while(num!=0)
		{
			dig = (int)num%10;           //getting one digit at a time
			sum+= Math.pow(dig,3);      // cubing the digit and adding the result to sum
			num/=10;
		}
		return sum;
	}

}
