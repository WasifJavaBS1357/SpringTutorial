package demo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout(){
		return "Sleep";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
