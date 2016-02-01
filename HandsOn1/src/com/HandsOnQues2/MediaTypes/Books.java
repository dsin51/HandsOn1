package com.HandsOnQues2.MediaTypes;

import com.HandsOnQues2.Media;

public class Books extends Media{
	public int ISBN;
	public String subject;
	public int volume;

	public Books(String title, int rating, int lendingLength, int iSBN, String subject, int volume) {
		super(title, rating, lendingLength);
		ISBN = iSBN;
		this.subject = subject;
		this.volume = volume;
	}

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		super.showDetails();
		System.out.println("ISBN:"+this.ISBN);
		System.out.println("Subject:"+this.subject);
		System.out.println("Volume:"+this.volume);
		
	}
	
	
	
}
