package com.HandsOnQues2;

public class Media {
	private String title;
	private int rating;
	private int lendingLength;
	

	public Media(String title, int rating, int lendingLength) {
		super();
		this.title = title;
		this.rating = rating;
		this.lendingLength = lendingLength;
	}

	public void showDetails(){
		
		System.out.println("Title:" + this.title);
		System.out.println("Rating:"+ this.rating + "/10");
		System.out.println("Lending Length:" + this.lendingLength + " Months");
	}
	
}
