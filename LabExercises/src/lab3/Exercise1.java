package lab3;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens())
		{
			String str1 = st.nextToken();
			int num = Integer.parseInt(str1);
			System.out.println(num);
			sum+=num;
		}
		System.out.println("Sum is "+sum);

	}

}
