package com.company;


import java.util.Random;

public class Hero
{
    Random rand=new Random();
    private int lifepoints;
    private int damage;
    private int strength;
    private int weaponStrength;
    Weapon weapon = new Weapon();
    Monster monster1= new Monster();
    int monsterLP= monster1.lifepoints;
    int monsterD= monster1.damage;
    public Hero()
    {
        weaponStrength= 0;
        lifepoints= rand.nextInt(5)+3+ rand.nextInt(4)+2;
        strength= rand.nextInt(7)+3;
        damage= strength+weaponStrength;
    }

    public void giveWeapon()
    {
        int material1=weapon.getMaterial1();
        int material2=weapon.getMaterial2();
        int enchantment=weapon.getEnchantment();
        weaponStrength= material1+material2+enchantment;
        updateDamage();
        returnValues();
        if(damage > 20)
        {
            monsterLP*=3;
            monsterD*=3;
        }
        if(damage> 10)
        {
            monsterLP*=2;
            monsterD*=2;
        }
    }

    private void updateDamage()
    {
       damage=strength+weaponStrength;
    }

    public void returnValues()
    {
        System.out.println("Lifepoints:"+lifepoints);
        System.out.println("Damage:"+damage);
        System.out.println("Strength:"+strength);
        System.out.print("Damage from Weapon:"+ weaponStrength);
    }

    public void attack()
    {
        if(monsterLP <= 0 || lifepoints <= 0)
        {
            System.out.print("The winner has been chosen");
        }
        else
        {
            if(damage>monsterD)
            {
                int gap= monsterD-damage;
                monsterLP = monsterLP+gap;
            }
            if(monsterD>damage)
            {
                int gap= damage-monsterD;
                lifepoints = lifepoints+gap;
            }

            System.out.println("Your Hero:");
            System.out.println("Lifepoints: "+lifepoints);
            System.out.println("Damage: "+damage);
            System.out.println("The Monster:");
            System.out.println("Lifepoints: "+monsterLP);
            System.out.print("Damage: "+monsterD);
        }
    }

}
