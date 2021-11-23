package com.te.collections.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> integers = new PriorityQueue<Integer>();
		integers.add(10);
		integers.add(30);
		integers.add(1);
		integers.add(5);
		
		System.out.println(integers);
		System.out.println(integers.poll());
		System.out.println(integers);
		System.out.println(integers.poll());
		System.out.println(integers);;
		
	}
	
	
}
