import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class DayOfWeek {

	
	public static String getDayOfWeek(int month , int day , int year)
	{
		LocalDate local = LocalDate.of(year, month, day);
		java.time.DayOfWeek dayofweek = local.getDayOfWeek();
		return dayofweek.toString();
	}
	public static void main(String[] args) {

		System.out.println(getDayOfWeek(12, 8, 1992));
		
	}

}
