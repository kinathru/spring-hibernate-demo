package com.kinath.coachapp.services;

import java.util.Random;

public class RandomFortune implements FortuneService
{
    String[] fortuneArray = null;

    public RandomFortune()
    {
        init();
    }

    private void init()
    {
        fortuneArray = new String[]{"Lottery", "Good Luck Charm", "Miracle"};
    }

    public String getFortune()
    {
        if( fortuneArray != null )
        {
            Random random = new Random();
            return fortuneArray[random.nextInt( fortuneArray.length - 1 )];
        }
        return null;
    }
}
