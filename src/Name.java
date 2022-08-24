import java.util.Scanner;
public class Name
{
    public static void main(String [] args)
    {
        String name = "John Cena";
        System.out.print("What Is Your Name: ");
        String w = name.substring(5,9);
        String x = name.substring(0,1);
        System.out.print("Your New Name Is: " + w + ", " + x + ".");
    }
}
