package challenges;
// it will print fizz if number is disivible by 3, buzz if it's divisible by 5 and fizzbuzz if divisible by 3 and 5.
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public static void main (String[] args) {
		var num = 15;
		System.out.println(fizzBuzz(num));
		
	}
	public static List<String> fizzBuzz(int num) {
		var response = new ArrayList<String>();
		for (int i=1; i<=num; i++) {
			if (i%3 ==0 && i%5==0)
				response.add("fizzBuzz");
			else if (i%3==0)
				response.add("fizz");
			else if (i%5==0)
				response.add("buzz");
			else
				response.add(Integer.toString(i));
		}
		return response;
	}
}

