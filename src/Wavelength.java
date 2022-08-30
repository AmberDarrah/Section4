import java.util.Scanner;
public class Wavelength
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter A Color Code: ");
        double code = s.nextDouble();

        if(code >= 380 && code < 449) {
            System.out.println("The Color Is Violet");
        }

        else if(code >= 450 && code < 494) {
            System.out.println("The Color Is Blue");
        }

        else if(code >= 495 && code < 569) {
            System.out.println("The Color Is Green");
        }

        else if(code >= 570 && code < 589) {
            System.out.println("The Color Is Yellow");
        }

        else if(code >= 590 && code < 619) {
            System.out.println("The Color Is Orange");
        }

        else if(code >= 620 && code < 749) {
            System.out.println("The Color Is Red");
        }

        else {
            System.out.println("The entered wavelength is not part of the visible spectrum");
        }
    }
}
