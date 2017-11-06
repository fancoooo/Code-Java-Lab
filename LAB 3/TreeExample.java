package lab3;
import java.util.*;
import java.util.function.Consumer;

public class TreeExample {
	public static void main(String[] args) {
		TreeMap<Integer,String> a = new TreeMap<>((o1,o2)-> o2-o1);
		a.put(1, "a");
		a.put(2, "b");
		a.put(31, "g");
		a.put(12, "j");
		a.put(3, "a");
		Iterator<Map.Entry<Integer, String>> map = a.entrySet().iterator();
		/*
		while(map.hasNext()) {
			Map.Entry<Integer, String> m = map.next();
			System.out.println(m.getKey() + " ::::::: " + m.getValue());
		}*/
		/*
		 * 				|
		 * 				|
		 * 				V
		 */
		a.descendingKeySet().forEach(key->{
			System.out.println("Key = " + key + "value = " + a.get(key));
		});
		
		Consumer<Integer> cs = n->{
			if(n>5) {
				System.out.println("bye");
				return;
			}else
				System.out.println(n);
		};
		cs.accept(10);
	}
}
