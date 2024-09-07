package dsa;

import java.util.*;

public class binary_tree {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			left=null;
			right=null;
		}
	}
	static class BinaryTree{
		static int idx=-1;
		public Node build_tree(int nodes[]) {
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			Node newnode=new Node(nodes[idx]);
			newnode.left=build_tree(nodes);
			newnode.right=build_tree(nodes);
			return newnode;
		}
	}
	public static void preorder(Node root) {
		Node p=root;
		if(p==null) {
			return;
		}
		System.out.print(p.data+" ");
		preorder(p.left);
		preorder(p.right);
	}
	public static void inorder(Node root) {
		Node p=root;
		if(p==null) {
			return;
		}
		
		inorder(p.left);
		System.out.print(p.data+" ");
		inorder(p.right);
	}
	public static void postorder(Node root) {
		Node p=root;
		if(p==null) {
			return;
		}
		
		postorder(p.left);
		postorder(p.right);
		System.out.print(p.data+" ");
	}
	public static void level_order(Node root) {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			Node curr_node=q.remove();
			if(curr_node==null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}
				else {
					q.add(null);
				}
			}
			else {
				System.out.print(curr_node.data+" ");
				if(curr_node.left!=null) {
					q.add(curr_node.left);
				}
				if(curr_node.right!=null) {
					q.add(curr_node.right);
				}
			}
		}
	}
	public static int count_nodes(Node root) {
		Node p=root;
		if(p==null) {
			return 0;
		}
		int leftnode = count_nodes(p.left);
		int rightnode = count_nodes(p.right);
		return leftnode+rightnode+1;
	}
	public static int sum_nodes(Node root) {
		Node p=root;
		if(p==null) {
			return 0;
		}
		int leftnode = sum_nodes(p.left);
		int rightnode = sum_nodes(p.right);
		return leftnode+rightnode+p.data;
	}
	public static int height(Node root) {
		Node p=root;
		if(p==null) {
			return 0;
		}
		int leftnode = height(p.left);
		int rightnode = height(p.right);
		int myheight=Math.max(leftnode, rightnode)+1;
		return myheight;
	}
	public static void main(String[] args) {
		int nodes[]= {1,2,3,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree=new BinaryTree();
		Node root=tree.build_tree(nodes);
		System.out.print("Preorder Traversal of Tree:");
		preorder(root);
		System.out.print("\nInorder Traversal of Tree:");
		inorder(root);
		System.out.print("\nPostorder Traversal of Tree:");
		postorder(root);
		System.out.print("\nLevelorder Traversal of Tree:\n");
		level_order(root);
		System.out.println("Total Numbers of Nodes:"+count_nodes(root));
		System.out.println("Sum of data of all Nodes:"+sum_nodes(root));
		System.out.println("Height of tree:"+height(root));
	}

}
