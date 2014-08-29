import java.util.Random;

public class Weapon
{
    int material1;
    int material2;
    int enchantment;

    Random rand = new Random();

    public Weapon()
    {
        int matVal1 = rand.nextInt(5) + 1;
        int matVal2 = rand.nextInt(7) - 1;
        int magVal = rand.nextInt(10) - 2;

        material1 = matVal1;
        material2 = matVal2;
        enchantment = magVal;
    }

    public int getMaterial1()
    {
        return material1;
    }
    public int getMaterial2()
    {
        return material2;
    }
    public int getEnchantment()
    {
        return enchantment;
    }
}