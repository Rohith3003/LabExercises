package lab3;
import java.util.Scanner;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;  
public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date in dd-mm-yyyy format");
		String date= sc.nextLine();
		calculateDifference(date);
	}
	static void calculateDifference(String date)
	{
		String date1[] = date.split("-");
		int day = Integer.parseInt(date1[0]);
		int month = Integer.parseInt(date1[1]);
		int year = Integer.parseInt(date1[2]);
		LocalDate ld = LocalDate.of(year, month,day);
		LocalDate currentDate = LocalDate.now();
		Period diff = Period.between(ld, currentDate);
		System.out.println(diff.getDays()+" days");
		System.out.println(diff.getMonths()+" months");
		System.out.println(diff.getYears()+" years");

}
}
