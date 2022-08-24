import java.util.Scanner;
public class TrafficLight
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter A Color Code: ");
        int code = in.nextInt();

        if (code == 1) {
            System.out.println("Next Traffic Light Is Green");
        }
        if (code == 2) {
            System.out.println("Next Traffic Light Is Yellow");
        }
        if (code == 3) {
            System.out.println("Next Traffic Light Is Red");
        }
        else {
            System.out.println("Invalid Color");
        }
    }
}