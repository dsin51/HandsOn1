package com.HandsOnQues2.MediaTypes;

import com.HandsOnQues2.Media;

public class Periodicals extends Media{
	public String author;
	public int volumeNumber;
	public String subject;
	public Periodicals(String title, int rating, int lendingLength, String author, int volumeNumber, String subject) {
		super(title, rating, lendingLength);
		this.author = author;
		this.volumeNumber = volumeNumber;
		this.subject = subject;
	}
	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		super.showDetails();
		System.out.println("Author Name:"+this.author);
		System.out.println("Volume Number:"+this.volumeNumber);
		System.out.println("Subject:"+this.subject);
	}
	
	
}
