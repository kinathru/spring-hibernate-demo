package com.kinath.coachapp;

import com.kinath.coachapp.coach.Coach;
import com.kinath.coachapp.coach.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml" );
        Coach myCoach = context.getBean( "myCoach", Coach.class );
        System.out.println( myCoach.getDailyWorkout() );
        System.out.println( myCoach.getDailyForune() );


        CricketCoach cricketCoach = context.getBean( "cricketCoach", CricketCoach.class );
        System.out.println( cricketCoach.getDailyWorkout() );
        System.out.println( cricketCoach.getDailyForune() );
        System.out.println( cricketCoach.getEmailAddress() );
        System.out.println( cricketCoach.getTeamName() );
        context.close();
    }
}
