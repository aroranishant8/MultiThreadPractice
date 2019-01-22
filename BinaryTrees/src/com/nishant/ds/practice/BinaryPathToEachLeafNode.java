package com.nishant.ds.practice;

import java.util.ArrayList;

public class BinaryPathToEachLeafNode {

	
	
	public static void printPathToLeafNode(BinaryNode root)
	{
		//for each leaf Node, Traverse till the end
		
		if(root==null)
		{
			return;
		}
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		printPathToeachLeafNode(root,al);
		
	}
	
	
	public static void printPathToeachLeafNode(BinaryNode node, ArrayList<Integer> al) 
	
	{
		ArrayList<Integer> inside=new ArrayList<Integer>();
		for(int i:al)
		{
			inside.add(i);
		}
		if(node==null)
			return;
		//if node is a leaf		
		if(node.leftNode==null && node.rightNode==null)
		{
			inside.add(node.value);
			System.out.println(inside);
		}
		else
		{
			inside.add(node.value);
			printPathToeachLeafNode(node.leftNode,inside);
			printPathToeachLeafNode(node.rightNode, inside);
		}
		
	}


	public static void main(String[] args) {
		BinaryNode root=new BinaryNode(1);
		root.leftNode=new BinaryNode(2);
		root.rightNode=new BinaryNode(3);
		root.leftNode.leftNode=new BinaryNode(4);
		root.leftNode.rightNode=new BinaryNode(5);
		root.rightNode.leftNode=new BinaryNode(6);
		root.rightNode.rightNode=new BinaryNode(7);
		printPathToLeafNode(root);
	}

}
