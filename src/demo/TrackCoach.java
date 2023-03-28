package demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "don't sleep";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void startingBean() {
		System.out.println("Track er Khela shuru");
	}
	
	public void endingBean() {
		System.out.println("Track er Khela shesh");
	}

}
