package lab9;
interface Intf2{
	void format(String str);
}
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intf2 ref2 = (str)->{
			for(int i=0;i<str.length();i++)
			{
				System.out.print(str.charAt(i)+" ");
			}
		};
		ref2.format("Rohith");
	}

}
