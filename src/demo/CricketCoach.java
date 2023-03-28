package demo;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("Cricket constructor");
	}
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Setter");
		this.fortuneService = fortuneService;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	public void setTeam(String team) {
		this.team = team;
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



	public String getEmailAddress() {
		return emailAddress;
	}



	public String getTeam() {
		return team;
	}
	
	

}
