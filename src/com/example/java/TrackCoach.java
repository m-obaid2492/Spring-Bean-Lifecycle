package com.example.java;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run 5k everyday";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	//add a init method in a spring 
	
	public void initMethod() {
		
		System.out.println("TrackCoach: inside method initMethod():");
		
	}
	
	public void destroyMethod() {
		System.out.println("TrackCoach: inside destroy method():  ");
	}
	

}
