package dsa;
import java.util.*;
public class practice {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
		static class BinaryTree1{
			static int idx=-1;
			public Node buildtree(int nodes[]) {
				idx++;
				if(nodes[idx]==-1) {
					return null;
				}
				Node newnode=new Node(nodes[idx]);
				newnode.left=buildtree(nodes);
				newnode.right=buildtree(nodes);
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
			preorder(p.left);
			System.out.print(p.data+" ");
			preorder(p.right);
			
		}
		public static void postorder(Node root) {
			Node p=root;
			if(p==null) {
				return;
			}
			preorder(p.left);
			preorder(p.right);
			System.out.print(p.data+" ");
			
		}
		public static void levelorder(Node root) {
			Node p=root;
			Queue<Node> q=new LinkedList<>();
			q.add(p);
			q.add(null);
			while(!q.isEmpty()) {
				Node curr=q.remove();
				if(curr==null) {
					System.out.println();
					if(q.isEmpty()) {
						break;
					}
					else {
						q.add(null);
					}
				}
				else {
					System.out.print(curr.data+" ");
					if(curr.left!=null) {
						q.add(p.left);
					}
					if(curr.right!=null) {
						q.add(p.right);
					}
				}
			}
		}
		public static int height_tree(Node root) {
			if(root==null) {
				return 0;
			}
			int lh=height_tree(root.left);
			int rh=height_tree(root.right);
			return Math.max(lh, rh)+1;
		}
		public static int max=0;
		public static int diameter_tree(Node root) {
			if(root==null) {
				return 0;
			}
			int lh=height_tree(root.left);
			int rh=height_tree(root.right);
			max=Math.max(max,lh+rh);
			return 1+Math.max(lh, rh);
		}
	public static void main(String[] args) {
		int nodes[]= {5,4,-1,6,-1,-1,2,-1,-1};
		BinaryTree1 tree=new BinaryTree1();
		Node root=tree.buildtree(nodes);
		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		postorder(root);
		System.out.println("\nLevel Order Traversal:");
		levelorder(root);
		int height=height_tree(root);
		System.out.println("Height of Tree:"+height);
		diameter_tree(root);
		System.out.println("Diameter of tree:"+max);
	}

}
