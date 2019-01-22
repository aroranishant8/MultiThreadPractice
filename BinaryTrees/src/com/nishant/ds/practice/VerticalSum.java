package com.nishant.ds.practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class VerticalSum {
	
	
	
	public static void verticalSum(BinaryNodeWithCounter root)
	{
		if(root==null)
			return;
		
		Queue <BinaryNodeWithCounter>q=new LinkedList<BinaryNodeWithCounter>();
		q.add(root);
		Stack <BinaryNodeWithCounter>s=new Stack<BinaryNodeWithCounter>();
		s.add(root);
		
		HashMap<Integer,Integer> hm=new HashMap<>();
		hm.put(root.counter,root.value);
		
		while(!q.isEmpty())
		{
			BinaryNodeWithCounter n=q.poll();
			if(n.leftNode!=null)
			{
				n.leftNode.counter=n.counter-1;
				
				q.add(n.leftNode);
				int i=hm.get(n.leftNode.counter)!=null?hm.get(n.leftNode.counter):0;
				hm.put(n.leftNode.counter, n.leftNode.value+i);
				//s.push(n.leftNode);
			}
			if(n.rightNode!=null)
			{
				n.rightNode.counter=n.counter+1;
				q.add(n.rightNode);
				int i=hm.get(n.rightNode.counter)!=null?hm.get(n.rightNode.counter):0;
				hm.put(n.rightNode.counter, n.rightNode.value+i);
				//s.push(n.rightNode);
				
			}
		}
		
		for(Integer e:hm.values())
		System.out.print(e+" ");
	}
	
	public static void main(String a[]) 
	{
		
		BinaryNodeWithCounter root=new BinaryNodeWithCounter(5);
		root.leftNode=new BinaryNodeWithCounter(2);
		root.rightNode=new BinaryNodeWithCounter(3);
		root.leftNode.leftNode=new BinaryNodeWithCounter(1);
		/*
		 * root.leftNode.rightNode=new BinaryNodeWithCounter(5);
		 * root.rightNode.leftNode=new BinaryNodeWithCounter(6);
		 * root.rightNode.rightNode=new BinaryNodeWithCounter(7);
		 */
		/*
		 * root.leftNode.leftNode.leftNode=new BinaryNodeWithCounter(8);
		 * root.rightNode.rightNode.leftNode=new BinaryNodeWithCounter(9);
		 * root.rightNode.rightNode.rightNode=new BinaryNodeWithCounter(10);		 */

		System.out.println("Traversal using recursion: ");
		verticalSum(root);
		levelOrderTraversalUsingIterationCounter(root);
		
		
	}
	
	public static void levelOrderTraversalUsingIterationCounter(BinaryNodeWithCounter root) 

	{		
		if(root==null)
			return;

		Queue<BinaryNodeWithCounter> q=new LinkedList<BinaryNodeWithCounter>();
		q.add(root);
		
		while(!q.isEmpty())
		{		
			BinaryNodeWithCounter currnode=q.poll();
			System.out.print("value="+currnode.value+" counter"+currnode.counter+" ");
			if(currnode.leftNode!=null)
			q.add(currnode.leftNode);
			if(currnode.rightNode!=null)
			q.add(currnode.rightNode);
			
		}

	}

}
