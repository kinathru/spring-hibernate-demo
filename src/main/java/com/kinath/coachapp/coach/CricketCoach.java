package com.kinath.coachapp.coach;

import com.kinath.coachapp.services.FortuneService;

public class CricketCoach implements Coach
{
    private FortuneService fortuneService;
    private String teamName;
    private String emailAddress;

    public CricketCoach()
    {
        System.out.println( "CricketCoach : Inside Constructor " );
    }

    public String getDailyWorkout()
    {
        return "Practice batting early in the morning";
    }

    public String getDailyForune()
    {
        return fortuneService.getFortune();
    }

    public FortuneService getFortuneService()
    {
        return fortuneService;
    }

    public void setFortuneService( FortuneService fortuneService )
    {
        System.out.println( "CricketCoach : Fortune Service Setter " );
        this.fortuneService = fortuneService;
    }

    public String getTeamName()
    {
        return teamName;
    }

    public void setTeamName( String teamName )
    {
        System.out.println( "CricketCoach : Setting Team Name " );
        this.teamName = teamName;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress( String emailAddress )
    {
        System.out.println( "CricketCoach : Setting Email Address " );
        this.emailAddress = emailAddress;
    }
}
