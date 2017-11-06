package lab2examlple;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateTimeFomatExemple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale locale = new Locale("vi","VN");
		SimpleDateFormat sim = new SimpleDateFormat("EEEEE, dd MMMMM yyyy",locale);
		Calendar ca = Calendar.getInstance();
		System.out.println(sim.format(ca.getTime()));
	}

}
