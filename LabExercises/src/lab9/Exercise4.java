package lab9;
@FunctionalInterface
interface Intf4
{
	int calculate(int a,int b);
}
@FunctionalInterface
interface Intf5 
{
	Exercise4 getExercise(int ProbNum);
}
public class Exercise4 {
	int probNum;
	Exercise4()
	{
		
	}
	Exercise4(int probNum)
	{
		this.probNum = probNum;
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		
		
		//implementing instance creation using constructor reference
		Intf5 ref5  = Exercise4::new;
		System.out.println(ref5.getExercise(5));
		System.out.println(ref5.getExercise(2));
		
		
		Exercise4 ex1 = new Exercise4();
		//method reference implementation
		//referring the add method of Exercise class for executing calculate method of interface.
		Intf4 ref4 = ex1::add;
		
		System.out.println(ref4.calculate(5, 7));
		
	}

}
