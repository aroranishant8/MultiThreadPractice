package com.nishant.ds.practice;

public class Implementor 

{
	public static void main(String a[]) 
	{
		
		BinaryNode root=new BinaryNode(1);
		root.leftNode=new BinaryNode(2);
		root.rightNode=new BinaryNode(3);
		root.leftNode.leftNode=new BinaryNode(4);
		root.leftNode.rightNode=new BinaryNode(5);
		root.rightNode.leftNode=new BinaryNode(6);
		root.rightNode.rightNode=new BinaryNode(7);
		/*
		 * root.leftNode.leftNode.leftNode=new BinaryNode(8);
		 * root.rightNode.rightNode.leftNode=new BinaryNode(9);
		 * root.rightNode.rightNode.rightNode=new BinaryNode(10);
		 */

		System.out.println("Preorder Traversal using recursion: ");
		TraversalHelper.preorderTraversalUsingRecursion(root);
		System.out.println("\nPreorder Traversal using iteration: ");
		TraversalHelper.preorderTraversalUsingIteration(root);
		System.out.println("\nInorder Traversal using iteration: ");
		TraversalHelper.levelOrderTraversalUsingIteration(root);
		System.out.println("\nLevel order Traversal using iteration:");
		TraversalHelper.levelOrderTraversalUsingIteration(root);
		
		
	}

}
