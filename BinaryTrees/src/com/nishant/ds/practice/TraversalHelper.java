package com.nishant.ds.practice;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TraversalHelper

{



  public static void preorderTraversalUsingRecursion(BinaryNode node) {

		if(node==null)
			return;		
		System.out.print(node.value+" ");
		preorderTraversalUsingRecursion(node.leftNode);
		preorderTraversalUsingRecursion(node.rightNode);		
	}
	
	public static void preorderTraversalUsingIteration(BinaryNode node) 
	
	{				
		Stack<BinaryNode> stack=new Stack<BinaryNode>();
		stack.push(node);
		
		while(!stack.isEmpty())
		{
			BinaryNode n=stack.pop();		
			System.out.print(n.value+" ");
			
			if(n.rightNode!=null)
			stack.push(n.rightNode);
			if(n.leftNode!=null)
			stack.push(n.leftNode);
		}
	
	}
	
public static void inOrderTraversalUsingIteration(BinaryNode root) 
	
	{		
	


return;
	
	}

public static void levelOrderTraversalUsingIteration(BinaryNode root) 

{		
	if(root==null)
		return;

	Queue<BinaryNode> q=new LinkedList<BinaryNode>();
	q.add(root);
	
	while(!q.isEmpty())
	{		
		BinaryNode currnode=q.poll();
		System.out.print(currnode.value+" ");
		if(currnode.leftNode!=null)
		q.add(currnode.leftNode);
		if(currnode.rightNode!=null)
		q.add(currnode.rightNode);
		
	}

}


	
	
	
}
