package com.kinath.coachapp;

import com.kinath.coachapp.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "beanscope-applicationContext.xml" );
        Coach coach01 = context.getBean( "myCoach", Coach.class );
        Coach coach02 = context.getBean( "myCoach", Coach.class );

        System.out.println( "Coach 01 and Coach 02 are same : " + ( coach01 == coach02 ) );

        context.close();
    }
}
