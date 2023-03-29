package demo;

public class NotHappyFortune implements FortuneService {

	@Override
	public String getFortune() {
		return "not your lucky day";
	}

}
