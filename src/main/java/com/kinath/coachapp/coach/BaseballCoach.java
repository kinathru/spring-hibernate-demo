package com.kinath.coachapp.coach;

import com.kinath.coachapp.services.FortuneService;

public class BaseballCoach implements Coach
{
    private FortuneService fortuneService;

    public BaseballCoach( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout()
    {
        return "Practice Baseball";
    }

    public String getDailyForune()
    {
        if( fortuneService != null )
        {
            return fortuneService.getFortune();
        }
        return null;
    }

    public FortuneService getFortuneService()
    {
        return fortuneService;
    }

    public void setFortuneService( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }
}
