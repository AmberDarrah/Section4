import java.util.Random;
public class DiceRoll
{
    public static void main(String [] args)
    {
        Random num = new Random();
        System.out.println("Dice 1: " + num.nextInt(6));
        System.out.println("Dice 2: " + num.nextInt(6));
    }
}