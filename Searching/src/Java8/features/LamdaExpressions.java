package Java8.features;

import java.util.Arrays;
import java.util.List;

public class LamdaExpressions {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ram", "Shyam", "Sundaram");
		names.forEach(s-> System.out.println(s));
	}

}
