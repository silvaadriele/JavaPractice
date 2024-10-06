package challenges;
public class AddTwoNumbers {
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) {this.val=val;}
		ListNode (int val, ListNode next){ this.val = val; this.next = next;}
		}
	
	public ListNode addTwoNumbers (ListNode l1, ListNode l2) {
		int totalSum = 0;
		int carry = 0;
		int sum = 0;
		ListNode listNode = new ListNode();
		ListNode aux = listNode;
		while (l1 != null || l2 !=null) {
			if (l1 != null && l2 !=null) {
				totalSum = l1.val + l2.val + carry;
				l1 = l1.next;
				l2 = l2.next;
			} else if(l1 !=null){
				totalSum = l1.val + carry;
				l1=l1.next;
			}else {
				totalSum = l2.val+carry;
				l2=l2.next;
			}
			sum = totalSum %10; //what will be inserted in the array
			carry = totalSum /10;
			aux.val = sum;
			
			if (l1 !=null || l2 !=null) {
				aux.next = new ListNode();
			} else if (l1 ==null && l2==null) {
				aux.next = new ListNode(carry);
			}else
				aux.next=null;
			aux=aux.next;
		}
		return listNode;
	}
}
