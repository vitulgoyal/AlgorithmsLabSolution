package com.gl.services;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CountTheNotes {

	private Integer[] notes; //  notes container
	private Integer[] noteCounter; // notes count container
	private Scanner sc = new Scanner(System.in);

	public void getUserInput() {
		System.out.println("Enter the size of currency denominations");
		int noOfNotes = sc.nextInt();
		notes = new Integer[noOfNotes];
		noteCounter = new Integer[noOfNotes];
		  
		System.out.println("Enter the currency denominations value");
		for(int i = 0; i< noOfNotes; i++) {
			System.out.print("Enter Note " +  i + 1 + ": ");
			notes[i] = sc.nextInt();
		}
		Arrays.sort(notes, Collections.reverseOrder());
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		countCurrencyNotes(amount);
	}

	private void countCurrencyNotes(Integer amount) {
		
		if (amount <= 0) {
			System.out.println("Not Possible;");
			return;
		}

		for (int i = 0; i < notes.length; i++) {
			if (amount > 0 && amount >= notes[i] && notes[i] > 0) {
				noteCounter[i] = amount / notes[i];
				amount = amount - noteCounter[i] * notes[i]; 
			}
		}

		System.out.println("Your payment approach in order to give min no of notes will be ->");
		for (int i = 0; i < noteCounter.length; i++) {
			if (noteCounter[i] != null) {
				System.out.println(notes[i] + ": " + noteCounter[i]);
			}
		}
		sc.close();
	}

}
