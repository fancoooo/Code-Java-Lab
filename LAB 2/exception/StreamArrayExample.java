package exception;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamArrayExample {
	public static void main(String[] args) {
		Integer[] a = {1,7,3,5,6,4,2,6,8,12,231,4};
		Arrays.sort(a, (o1,o2)-> o2 - o1);
		/*Arrays.stream(a).forEach(f->{
			System.out.println(f);
		});*/
		Consumer<Integer> b = (Integer value) -> {
			System.out.println(value);
		};
		Arrays.stream(a).forEach(b);
		Optional<Integer> max = Arrays.stream(a).max((o1,o2)-> o1 - o2);
		System.out.println("max = " + max.get());
		//Predicate<Integer> i = (Integer value) -> {return value > 10;};
		Stream<Integer> old = Arrays.stream(a).filter(v -> v>10);
		old.forEach(f->{
			System.out.println(f.intValue());
		});
	}
}
