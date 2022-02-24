package lab2;
import java.util.*;
public class Exercise4 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int arr1[] = modifyArray(arr);
		for(int x:arr1)
		{
			System.out.println(x);
		}
	}
	static int[] modifyArray(int arr[])
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			ts.add(arr[i]);
		}
		Object arr1[] = ts.toArray();
		int arr2[] = new int[arr1.length];
		System.out.println(ts);
        Arrays.sort(arr1, Collections.reverseOrder());
        for(int i=0;i<arr1.length;i++)
        {
        	arr2[i]=(int)arr1[i];
        }
        return arr2;
	}
}
