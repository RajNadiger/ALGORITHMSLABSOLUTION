package com.greatlearning.lab2.main;

import java.util.Scanner;

import com.greatlearning.lab2.service.BubbleSort;
import com.greatlearning.lab2.service.NotesCount;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Currency Denominations");
		int size = sc.nextInt();
		int notes[] = new int[size];
		System.out.println("Enter the currency denominations value one by one");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		BubbleSort bb = new BubbleSort();
		bb.bubbleSort(notes);

		System.out.println("Enter the amount to pay");
		int amount = sc.nextInt();
		NotesCount ncs = new NotesCount();
		ncs.notesCounter(notes, amount);

	}

}
