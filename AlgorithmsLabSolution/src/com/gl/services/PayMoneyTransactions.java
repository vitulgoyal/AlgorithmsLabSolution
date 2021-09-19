package com.gl.services;

import java.util.Scanner;

public class PayMoneyTransactions {
	
	Integer[] transactions; 
	Scanner sc = new Scanner(System.in);
	Integer numberOfTargets;
	

	public void getUserInputs() {
		System.out.println("Enter the size of transactions");
		Integer size = sc.nextInt();
		transactions = new Integer[size];
		System.out.println("Enter the values of transactions");
		for(int i = 0; i < size; i++) {
			System.out.println("Enter Transaction " + (i + 1) + ": ");
			transactions[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		numberOfTargets = sc.nextInt();
		for(int i = 0; i < numberOfTargets; i++) {
			System.out.println("Enter Target " + (i + 1) + ": ");
			calculateNoOfTransac(sc.nextInt());
		}
		sc.close();
 	}
	
	private void calculateNoOfTransac(Integer target) {
		int sum = 0;
		for (int i = 0; i < transactions.length; i++) {
			if (sum >= target) {
				System.out.println("Target achieved after " + (i) + " transactions");
				break;
			} else {
				sum = sum + transactions[i];
			}
		}
		if (sum < target) {
			System.out.println("Given target is not achieved ");
		}
	}
	
	
	
	

}
