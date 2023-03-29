package demoForAnnotations;

import org.springframework.stereotype.Component;

@Component("theTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "hit the ball";
	}

}
