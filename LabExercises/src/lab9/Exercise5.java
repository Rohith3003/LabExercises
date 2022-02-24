package lab9;

@FunctionalInterface
interface Intf6 {
	int calculate(int num);
}

public class Exercise5 {

	// returns factorial of a given number
	int factorial(int num) {
		if (num == 1 || num == 0)
			return 1;
		else
			return num * factorial(num - 1);
	}

	public static void main(String[] args) {
		Exercise5 ex2 = new Exercise5();

		// using method reference to execute calculate method of functional interface by
		// referring factorial method of exercise class
		Intf6 ref6 = ex2::factorial;
		
		System.out.println(ref6.calculate(6));
	}

}
