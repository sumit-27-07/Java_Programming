package accenture;
import java.util.*;
class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	      }
public class add_alternate_nodes {
	public static ListNode solve_add(ListNode head) {
		int a=head.val;
		int b=head.next.val;
		ListNode c=head.next.next;
		while(c!=null) {
			int m=a;
			a=c.val;
			c.val=c.val+m;
			c=c.next;
			if(c!=null) {
				m=b;
				b=c.val;
				c.val=c.val+m;
				c=c.next;
			}
		}
		
		return head;
	}

	public static void main(String[] args) {
		ListNode head=new ListNode(1,null);
		ListNode x=head;
		int n=8;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Start");
		for(int i=1;i<n;i++) {
			System.out.println("Enter value of current node:");
			int xy=sc.nextInt();
			ListNode newnode=new ListNode(xy,null);
			x.next=newnode;
			x=newnode;
		}
		x=head;
		System.out.println("Linked List:");
		while(x!=null) {
			System.out.print(x.val+" ");
			x=x.next;
		}
		ListNode res=solve_add(head);
		x=res;
		System.out.println("\nLinked List:");
		while(x!=null) {
			System.out.print(x.val+" ");
			x=x.next;
		}
	}

}
