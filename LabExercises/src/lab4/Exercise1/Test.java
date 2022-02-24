package lab4.Exercise1;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("Smith",27);
		Person p2 = new Person("Kathy",25);
		p1.createAccount(2000);
		p2.createAccount(3000);
		p1.acc.deposit(2000);
		p2.acc.withdrawl(2000);
		System.out.println(p1.acc.getAccNum());
		System.out.println(p2.acc.getAccNum());

	}

}
