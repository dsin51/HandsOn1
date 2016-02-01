package com.HandsOnQues2.MediaTypes;

import com.HandsOnQues2.Media;

public class DVD extends Media {
	public int runningTime;
	public int volumeNumber;
	public DVD(String title, int rating, int lendingLength, int runningTime, int volumeNumber) {
		super(title, rating, lendingLength);
		this.runningTime = runningTime;
		this.volumeNumber = volumeNumber;
	}
	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		super.showDetails();
		System.out.println("Running Time of DVD:"+this.runningTime);
		System.out.println("Volume Number:"+this.volumeNumber);
	}
	
	
	
	
}
