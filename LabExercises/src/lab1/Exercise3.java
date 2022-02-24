package lab1;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(nthFibonacci(n));
	}
	static int nthFibonacci(int n)
	{
		if(n<=1)
			return n;
		return nthFibonacci(n-1)+nthFibonacci(n-2);
	}

}
