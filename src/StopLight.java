import java.util.Scanner;
public class StopLight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter A Color Code: ");
        int code = in.nextInt();

        switch (code) {
            case 1:
                System.out.println("Next Traffic Light Is Green");
                break;
            case 2:
                System.out.println("Next Traffic Light Is Yellow");
                break;
            case 3:
                System.out.println("Next Traffic Light Is Red");
                break;
            default:
                System.out.println("Invalid Color");
        }
    }
}