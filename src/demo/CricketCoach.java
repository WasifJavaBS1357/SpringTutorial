package demo;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Cricket constructor");
	}
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Setter");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Cricket Workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
