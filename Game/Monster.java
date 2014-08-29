package com.company;
import java.util.Random;

public class Monster
{
    public int lifepoints;
    public int damage;
    Random rand= new Random();

    public Monster()
    {
        lifepoints= rand.nextInt(6)+5;
        damage= rand.nextInt(6)+2;
    }



}