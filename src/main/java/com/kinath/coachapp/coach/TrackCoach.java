package com.kinath.coachapp.coach;

import com.kinath.coachapp.services.FortuneService;

public class TrackCoach implements Coach
{
    FortuneService fortuneService;

    public TrackCoach( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout()
    {
        return "Run 5km daily";
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

    /**
     * Things to do in bean initialization
     */
    public void doMyStartupStuff()
    {
        System.out.println("TrackCoach : Inside doMyStartupStuff method");
    }

    /**
     * Things to do in bean destroy
     */
    public void doMyCleanupStuff()
    {
        System.out.println("TrackCoach : Inside doMyCleanupStuff method");
    }
}
