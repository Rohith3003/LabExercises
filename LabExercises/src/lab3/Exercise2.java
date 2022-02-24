package lab3;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(getImage(str));

	}
	static String getImage(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		String rev =  new String(sb.reverse());
		str = str+"|"+rev;
		return str;
	}
	

}
