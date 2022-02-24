package lab3;
import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCount=0;
		int count=0;
		Scanner sc = new Scanner(System.in);
		String str="";
		while (!(str = sc.next()).equals(""))
		{
		   str= sc.nextLine();
		   System.out.println(str);
		   count++;
		}
		String words[] = str.split(" ");
		String sentences[] = str.split("[.!?:]");
		System.out.println(words.length);
		System.out.println(sentences.length);
		System.out.println(count);

	}

}
