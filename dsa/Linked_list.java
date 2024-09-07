package dsa;

import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
public class Linked_list {
	
	Node head;
	public void add_first(int num) {
		Node newnode= new Node(num);
		if(head==null) {
			head=newnode;
			return;
		}
		else {
			newnode.next=head;
			head=newnode;
			return;
		}
	}
	public void add_last(int num) {
		Node newnode= new Node(num);
		Node p=head;
		if(head==null) {
			head=newnode;
			return;
		}
		else {
			while(p.next!=null) {
				p=p.next;
			}
			p.next=newnode;
			return;
		}
	}
	public void add_position(int num,int pos) {
		int i;
		Node newnode= new Node(num);
		Node p=head;
		for(i=1;i<pos-1;i++) {
			p=p.next;
		}
		newnode.next=p.next;
		p.next=newnode;
		return;
	}
	public void print_list() {
		Node p=head;
		System.out.print("Linked List : ");
		while(p!=null) {
			System.out.print(p.data+"->");
			p=p.next;
		}
		System.out.print("NULL \n");
	}
	public static void main(String[] args) {
		Linked_list list=new Linked_list();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.print("Enter Number of Nodes wants to create:");
		n=sc.nextInt();
		for(i=0;i<n;i++) {
			int num;
			System.out.print("Enter Node["+(i+1)+"] number:");
			num = sc.nextInt();
			list.add_last(num);
		}
		list.print_list();
		list.add_position(20, 3);
		list.print_list();
	}

}
