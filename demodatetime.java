package DATETIME;


import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class demodatetime {
	public static void main(String args[])
	{
	LocalTime lt=LocalTime.now();
	System.out.println("The Local Time"+lt);
	
	
	LocalDate ld=LocalDate.now();
	System.out.println("\nThe Local Date"+ld);
	
	LocalDateTime ltd=LocalDateTime.now();
	System.out.println("The Local Date Time"+ltd);
		
	
	System.out.println("\nThe Local Time"+ltd.getNano());
}
}