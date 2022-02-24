package lab2;
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int arr1[] = getSorted(arr); 
		for(int x:arr1)
		{
			System.out.println(x);
		}

	}
	static int[] getSorted(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int num,rev=0;
			num=arr[i];
			while(num>0)
			{
				rev=rev*10+(num%10);
				num/=10;
			}
			arr[i]=rev;
		}
		Arrays.sort(arr);
		return arr;
	}

}
