package ques1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

        coach coach=(coach)context.getBean("myTCoach");

        coach coach1=(coach)context.getBean("myBCoach");

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        System.out.println(coach1.getDailyWorkout());

        System.out.println(coach1.getDailyFortune());
    }

}