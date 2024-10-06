package challenges;
//solving in two ways (API (nlogn) and another one with O(n) complexity)
import java.util.Arrays;
public class SquaresOfArray {
	public int[] sortedSquares(int[] nums) {
		return Arrays.stream(nums).map(num -> num*num).sorted().toArray();
	}
	public int[]sortedSquares2(int[] nums){
		//if it's not sorted yet
		Arrays.sort(nums);
		var output = new int[nums.length];
		int head =0, tail = nums.length-1, index=tail;
		while (index>=0) {
			var squaredHead = nums[head]*nums[head];
			var squaredTail = nums[tail]*nums[tail];
			
			if (squaredHead >=squaredTail) {
				output[index--]=squaredHead;
				head++;
			}
			else {
				output[index--]=squaredTail;
				tail--;
			}
		}
		return output;
	}
}
