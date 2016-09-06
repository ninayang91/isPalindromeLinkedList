import java.util.Hashtable;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Node a=new Node(3);
		Node b=new Node(2,a);
		Node c=new Node(8,b);
		Node d=new Node(2,c);
		Node e=new Node(3,d);
	
		System.out.println(isPalindrome(e));

	}
	//check if a linked list is a palindrome
	//check the first half with the second half
	//put the first half in stack, if size is unknown, use two pointers to find the middle
	
	public static boolean isPalindrome(Node head){
		if(head==null)return true;
		Node p1=head,p2=head;
		Stack<Integer> stack=new Stack<>();
		while(p2!=null && p2.next!=null){
			stack.push(p1.data);
			p1=p1.next;
			p2=p2.next.next;//the while condition has to be related to p2, and p2.next
		}
		//if odd
		if(p2!=null)p1=p1.next;
		while(p1!=null){
			if(p1.data!=stack.pop().intValue())return false;
			p1=p1.next;
		}
		return true;
	}
	
	
	
	

}
