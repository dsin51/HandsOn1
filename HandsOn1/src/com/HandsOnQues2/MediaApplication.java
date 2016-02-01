package com.HandsOnQues2;

import java.util.Scanner;

import com.HandsOnQues2.MediaTypes.Books;
import com.HandsOnQues2.MediaTypes.DVD;
import com.HandsOnQues2.MediaTypes.Periodicals;

public class MediaApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Media[] mediaArray = new Media[3];
		mediaArray[0] = new Books("Harry Potter", 9, 2, 12345, "Fiction", 7);
		mediaArray[1] = new DVD("Gravity", 9, 1, 150, 1);
		mediaArray[2] = new Periodicals("India Today", 9, 2, "IndiaTeam", 8, "Economy");
		
		Scanner sin = new Scanner(System.in);
		
		System.out.println("Select the Media type to view details:");
		System.out.println("1.Books\n2.DVD\n3.Periodicals");
		int key = sin.nextInt();
		switch (key) {
		case 1:
			mediaArray[0].showDetails();
			break;
		case 2:
			mediaArray[1].showDetails();
			break;
		case 3:
			mediaArray[2].showDetails();
			break;

		default:
			System.out.println("Invalid Option !!");
			break;
		}
	}

}
