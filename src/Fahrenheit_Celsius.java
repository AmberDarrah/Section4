import java.util.Scanner;

public class Fahrenheit_Celsius
{
    public static void main(String[] args)
    {

        double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Temperature In Fahrenheit: ");
        fahrenheit = s.nextDouble();
        celsius = (fahrenheit-32)*5/9;
        System.out.println("The Temperature In Celsius Is: " + celsius);
    }

}