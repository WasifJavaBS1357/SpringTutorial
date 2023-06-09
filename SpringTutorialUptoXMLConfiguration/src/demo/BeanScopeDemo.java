package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scopeApplicationContext.xml");
		Coach theCoach  = context.getBean("anotherCoach",Coach.class);
		Coach alphaCoach = context.getBean("anotherCoach",Coach.class);
		boolean result  = (theCoach == alphaCoach);
		System.out.println("pointing to the same object? "+result);
		
		System.out.println("Location of theCoach "+theCoach);
		System.out.println("Location of theCoach "+alphaCoach);		

	}

}
