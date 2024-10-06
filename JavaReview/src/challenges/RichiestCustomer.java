package challenges;
//you are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i customer has in the j bank
//return the wealth of the wealthiest customer
public class RichiestCustomer {
	public static void main (String[] args) {
		int[][] accounts = {{1, 2, 3}, {1,4, 6}, {6, 2}};
		//System.out.println(accounts[2].length);
		System.out.println(maximumWealth(accounts));	
	}
	public static int maximumWealth(int[][] accounts) {
		var max = 0;
		for(int i=0; i<accounts.length; i++) {
			var customerWealth=0;
			for (int j=0; j<accounts[i].length; j++)
				customerWealth+=accounts[i][j];
			if (max < customerWealth)
				max = customerWealth;
		}
		return max;
	}
}

