package com.tree;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {


		TreeSet<Integer> tree =new TreeSet<Integer>(new SortDescending());
		tree.add(5);
		tree.add(8);
		tree.add(2);
		tree.add(1);
		tree.add(3);
		System.out.println(tree);
		
	}

}
