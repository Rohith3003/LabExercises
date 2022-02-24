package lab9;
interface Intf1
{
	double power(int a,int b);
}
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intf1 ref1 = (x,y)->Math.pow(x, y);
		System.out.println(ref1.power(3, 4));

	}

}
