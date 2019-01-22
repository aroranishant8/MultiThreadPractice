package com.nishant.ds.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DeletionHelper {

	
	
	public static void deleteElementWithDeepestNode(BinaryNode root,int element)
	{
		BinaryNode deepestNode=findDeepestNode(root);
		System.out.print(deepestNode.value);
	}
	
	private static BinaryNode findDeepestNode(BinaryNode root) {
		// TODO Auto-generated method stub
		
		if(root==null)
			return null;
		
     Queue<BinaryNode> q=new LinkedList<BinaryNode>();
     q.add(root);
     BinaryNode deepestnode = null;
     while(!q.isEmpty())
     {
    	 deepestnode=q.peek();
    	 BinaryNode current=q.poll();
    	 System.out.println(current.value);
    	 if(current.leftNode!=null)
    		 q.add(current.leftNode);
    	 if(current.rightNode!=null)
    		 q.add(current.rightNode);    	 
     }	
		
		return deepestnode;
	}

	public static void main(String a[]) 
	
	{
		BinaryNode root=new BinaryNode(1);
		root.leftNode=new BinaryNode(2);
		root.rightNode=new BinaryNode(3);
		root.leftNode.leftNode=new BinaryNode(4);
		root.leftNode.rightNode=new BinaryNode(5);
		root.rightNode.leftNode=new BinaryNode(6);
		root.rightNode.rightNode=new BinaryNode(7);
		
		System.out.println("Enter the elemnt that you want to delete");
		Scanner s=new Scanner(System.in);
		int element=s.nextInt();		
		System.out.println("Element with data "+element+" is deleted");
		deleteElementWithDeepestNode(root,element);
	}
}
