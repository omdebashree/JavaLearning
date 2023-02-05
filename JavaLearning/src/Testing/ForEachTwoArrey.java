package Testing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEachTwoArrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> one = Arrays.asList(1, 2, 3);
		List<Integer> two = Arrays.asList(1,2,3);
		Stream.concat(one.stream(), two.stream())
		        .peek(System.out::print)
		        .forEach(System.out::println);
	}
}
