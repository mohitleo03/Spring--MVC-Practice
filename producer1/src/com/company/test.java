package com.company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class test {

    public static void main(String[] args) {
	// write your code here
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Iproducer fp=(Iproducer)context.getBean("swork",Iproducer.class);

        consumer c = new consumer(fp);
        c.consumer();


    }
}
