package bean_life;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MyApp
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ICoach coach=(ICoach)context.getBean("bkb");
        ICoach coach1=(ICoach)context.getBean("bkb");
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach1.getDailyFortune());
        System.out.println(coach1.getDailyWorkout());
        ((ClassPathXmlApplicationContext)context).close();
    }
}