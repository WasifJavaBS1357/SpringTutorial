package demoForAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach  = context.getBean("theTennisCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}

}
