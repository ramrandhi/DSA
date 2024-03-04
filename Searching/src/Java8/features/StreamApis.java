package Java8.features;

import java.util.Arrays;
import java.util.List;

public class StreamApis {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().filter(s->s%2 ==0).mapToInt(s->s*2).hashCode();
		System.out.println(sum);
	}

}
