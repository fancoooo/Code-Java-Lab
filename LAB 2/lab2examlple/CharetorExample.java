package lab2examlple;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class CharetorExample {
	
	public static int countdigi(String value) {
		AtomicInteger a = new AtomicInteger(0);
		IntStream in = value.chars();
		in.forEach(c ->{
			if(Character.isDigit(c)) a.incrementAndGet();
		});
		return a.get();
	}
	
	@SuppressWarnings("finally")
	public static int tonumber(String value) {
		try{
			int i = Integer.parseInt(value);
			return  i;
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		finally {
			return -1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("to number : "+ tonumber("ad12qe1a") );
	}

}
