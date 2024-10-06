package challenges;
//steps to reduce a number to zero
public class ReduceToZero {
	public static void main (String[] args) {
		System.out.println(numberOfSteps(8));
	}
	public static int numberOfSteps(int num) {
		var result = 0;
		while (num>0) {
			if (num%2==0)
				num=num/2;
			else
				num--;
			result++;
		}
		return result;
	}
}
