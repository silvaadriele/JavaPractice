package challenges;

public class RunningSumOfArray {
	public static void main (String[] args) {
		int[] givenArray = {1, 2, 3, 4, 5, 20};
		int[] result = new int[givenArray.length];
		var sum=0;
		
		for (int i=0; i<givenArray.length; i++) {
			sum+=givenArray[i];
			result[i]=sum;
		}
		printArray(result);
		}

	private static void printArray(int[] result) {
		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
}
