package com.tree;

import java.util.Comparator;

public class SortDescending implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {

		return -o1.compareTo(o2);
	}

	
}
