package lab3;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(alterString(str));

	}
	static String alterString(String str)
	{
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'|ch=='U')
			{
				str1 = str1+ch;
			}
			else
			{
				str1 = str1+(char)(ch+1);
			}
		}
		return str1;
	}

}
