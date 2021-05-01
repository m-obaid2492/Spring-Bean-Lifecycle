package com.example.java;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int rand=(int)(Math.random()*(4));
		String[] arr= {"Good","Okay","BAD","Excelent"};
		
		return arr[rand]+Math.random()+" "+rand;
	}

}
