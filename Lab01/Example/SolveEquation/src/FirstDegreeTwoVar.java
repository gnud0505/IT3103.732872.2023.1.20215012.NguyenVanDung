// Example 6
import java.util.Scanner;

public class FirstDegreeTwoVar {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a11, a12, b1, a21, a22, b2:");
        double a11= input.nextDouble();
        double a12= input.nextDouble();
        double b1= input.nextDouble();
        double a21= input.nextDouble();
        double a22= input.nextDouble();
        double b2= input.nextDouble();
        
        double D = a11 * a22 - a12 * a21;
        double Dx = b1 * a22 - a12 * b2;
        double Dy = a11 * b2 - b1 * a21;
        
        if (D != 0) {
            double x = Dx / D;
            double y = Dy / D;
            System.out.println("The system has a unique solution:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else if (D == 0 && Dx == 0 && Dy == 0) {
            System.out.println("The system has infinitely many solutions.");
        } else {
            System.out.println("The system has no solution.");
        }
  input.close();
    }
}
