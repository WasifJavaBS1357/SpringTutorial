package demo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		System.out.println("Baseball inside default constructor");
	}
	
	public BaseballCoach(FortuneService theFortuneService) {
		System.out.println("Baseball inside parameterized constructor");
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
	
	public void startingBean() {
		System.out.println("Baseball Khela shuru");
	}
	
	public void endingBean() {
		System.out.println("Baseball Khela shesh");
	}
	
}
