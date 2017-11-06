package lab2examlple;

import java.util.Calendar;
import java.util.Locale;

public class EnumExample {
	
	public enum Date{
		THU_HAI,THU_BA,CHU_NHAT,NO;
		public static Date getdate(Calendar ca) {
			String type = ca.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("vi"));
			switch(type) {
				case "Th 2":
					return THU_HAI;
				case "Th 3":
					return THU_BA;
				case "CN":
					return CHU_NHAT;
			}
			return NO;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar a = Calendar.getInstance();
		System.out.println("hom nay la : "+ Date.getdate(a));
	}

}
