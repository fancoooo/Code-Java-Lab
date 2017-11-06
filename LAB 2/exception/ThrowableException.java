package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThrowableException {
	
	private final static Logger log = Logger.getLogger(ThrowableException.class.getName());
	
	public static int toNumber(String value) throws NumberFormatException{
			Integer i = Integer.parseInt(value);
			return i.intValue();
		
		
	}
	public static void main(String[] args) {
		try {
			String value = "81771.92";
			System.out.println("number = "+ toNumber(value));
		}catch(NumberFormatException e) {
			log.log(Level.WARNING,e.getMessage());
			System.out.println(e.getMessage());
		}
	}
}
