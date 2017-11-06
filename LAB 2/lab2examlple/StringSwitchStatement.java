package lab2examlple;

import java.util.Calendar;
import java.util.Locale;

public class StringSwitchStatement {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		System.out.println("hom nay la ngay : " + getday(ca));
		ca.set(Calendar.DATE, ca.get(Calendar.DATE) +1);
		System.out.println("???  : " + getday(ca));
	}
	public static String getday(Calendar ca) {
		String type = ca.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("vi"));
		switch(type) {
			case "Th 2":
				return "thu 2";
			case "Th 3":
				return "thu 3";
			case "Th 4":
				return "thu 4";
			case "Th 5":
				return "thu 5";
			case "Th 6":
				return "thu 6";
			case "Th 7":
				return "thu 7";
			case "CN":
				return "cuoi tuan";
			
		}
		return "ko biet";
	}
}
