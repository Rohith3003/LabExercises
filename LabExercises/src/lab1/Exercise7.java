package lab1;
import java.util.*;
public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(checkNumber(num));
	}
	static boolean checkNumber(int num)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		boolean Isincreasing = true;
		while(num>0)
		{
			al.add(num%10);
			num/=10;
		}
		for(int i=0;i<al.size()-1;i++)
		{
			if(al.get(i)<al.get(i+1))
			{
				Isincreasing = false;
			}
		}
		return Isincreasing;

	}

}
