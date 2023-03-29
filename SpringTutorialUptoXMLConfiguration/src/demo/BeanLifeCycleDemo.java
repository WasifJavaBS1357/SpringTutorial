package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("initDemoScopeApplicationContext.xml");
		Coach theCoach  = context.getBean("anotherCoach",Coach.class);
		Coach alphaCoach = context.getBean("anotherCoach",Coach.class);		
		context.close();
	}

}
