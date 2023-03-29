package demoForAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneService fortuneService;
	
	
	public TennisCoach() {
			System.out.println("Default constructor called");
	}

//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("setter was called");
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void discountSetter(FortuneService fortuneService) {
//		System.out.println("discount setter was called");
//		this.fortuneService = fortuneService;
//	}
//	

	@Override
	public String getDailyWorkout() {
		return "hit the ball";
	}
	

	@Override
	public String getFortuneService() {
		return fortuneService.getFortune();
	}

}
