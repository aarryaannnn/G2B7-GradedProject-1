package com.g2b7.skyscraper;

import java.util.Scanner;
import java.util.Collections;
import java.util.PriorityQueue;

public class Skyscraper {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total number of floors in the building:");
        int totalFloors = scanner.nextInt();
        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(totalFloors, Collections.reverseOrder());
        int arr[] = new int[totalFloors];

        for(int day = 1; day <= totalFloors; day++) {
        	System.out.println("Enter the floor size given on day " + day + ":");
        	int floorSize = scanner.nextInt();
        	arr[day-1] = floorSize;
        	priorityQueue.add(floorSize);
        	
        }
        
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(totalFloors	, Collections.reverseOrder());
        
        for(int day = 1; day <= totalFloors; day++) {
        	
        	priorityQueue2.add(arr[day-1]);
        	
        	System.out.println("Day " + day +":");
        	
        	
        	while(priorityQueue.peek() == priorityQueue2.peek() && !priorityQueue.isEmpty()) {
        		System.out.print(priorityQueue.peek() + " ");
        		priorityQueue.poll();
        		priorityQueue2.poll();
        	}
        	System.out.println();
        	
        	
//        	if(priorityQueue.peek() == arr[day-1]) {
//        		int temp = day;
//        		while(temp != -1) {
//        			if(priorityQueue.peek() == priorityQueue2.peek()) {        				
//        				System.out.print(priorityQueue2.poll());
//        				priorityQueue.poll();
//        			}
//        			temp--;
//        		}
//        	}
        }
        
        
//        Stack<Integer> floorSizes = new Stack<>();
//        Stack<Integer> assembledFloors = new Stack<>();
//
//        for (int day = 1; day <= totalFloors; day++) {
//            System.out.println("Enter the floor size given on day " + day + ":");
//            int floorSize = scanner.nextInt();
//
//            // Check if any floors can be assembled
//            while (!floorSizes.isEmpty() && floorSize > floorSizes.peek()) {
//                assembledFloors.push(floorSizes.pop());
//            }
//
//            // Push the current floor size to the stack
//            floorSizes.push(floorSize);
//
//            // Print the assembled floors
//            System.out.print("\nDay: " + day + "\n");
//            while (!assembledFloors.isEmpty()) {
//                System.out.print(assembledFloors.pop() + " ");
//            }
//        }

        scanner.close();
    }
}
