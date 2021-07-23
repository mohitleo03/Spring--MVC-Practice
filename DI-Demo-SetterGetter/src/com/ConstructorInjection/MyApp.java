package com.ConstructorInjection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

		ICoach2 iCoach = (ICoach2)context.getBean("BCoach1");
		ICoach2 iCoach2 = (ICoach2)context.getBean("BCoach2");

		System.out.println(iCoach.getDailyWorkout());
		System.out.println(iCoach.getFortune());

		System.out.println(iCoach.toString());

		System.out.println("calling constructor injection");

		System.out.println(iCoach2.getDailyWorkout());
		System.out.println(iCoach2.getFortune());

		System.out.println(iCoach2.toString());
	}
}
