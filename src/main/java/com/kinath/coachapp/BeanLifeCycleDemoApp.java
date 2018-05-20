package com.kinath.coachapp;

import com.kinath.coachapp.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "beanLifeCycle-applicationContext.xml" );
        Coach coach01 = context.getBean( "myCoach", Coach.class );
        System.out.println(coach01.getDailyWorkout());
        context.close();
    }
}
