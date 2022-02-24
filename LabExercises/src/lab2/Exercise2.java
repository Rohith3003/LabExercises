package lab2;
import java.util.*;
public class Exercise2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String strings[] = new String[n];
		for(int i=0;i<strings.length;i++)
		{
			strings[i]=sc.nextLine();
		}
		stringCompare(strings);
	}
	static void stringCompare(String arr[])
	{
		int mid=0;
		Arrays.sort(arr);
		if(arr.length%2==0)
		{
			mid = arr.length/2;
		}
		else if(arr.length%2==1)
		{
			mid = arr.length/2+1;
		}
		for(int i=0;i<=mid;i++)
		{
			arr[i] = arr[i].toUpperCase();
		}
		for(String str:arr)
		{
			System.out.println(str);
		}
	}

}
