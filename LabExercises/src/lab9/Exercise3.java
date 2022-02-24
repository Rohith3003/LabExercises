package lab9;
interface Intf3
{
	boolean verify(String str1,String str);
}
public class Exercise3 {

	public static void main(String[] args) {
		String userName = "Rohithsai@03";
		String password = "rohithsai03";
		Intf3 ref3 = (str1,str2)->{
			if(!((str1.equals(userName))&&(str2.equals(password))))
				return false;
			return true;
		};
		System.out.println(ref3.verify("Rohithsai@03", "rohithsai03"));
	}

}
