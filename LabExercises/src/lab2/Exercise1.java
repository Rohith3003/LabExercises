package lab2;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(secondSmallest(arr));

	}
	static int secondSmallest(int arr[])
	{
		Arrays.sort(arr);
		return arr[1];
	}

}
