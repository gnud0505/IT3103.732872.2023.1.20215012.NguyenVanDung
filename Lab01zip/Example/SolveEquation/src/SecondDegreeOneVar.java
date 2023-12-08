// Example 6
import java.util.Scanner;

public class SecondDegreeOneVar {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a,b,c");
        double a= input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double delta=b*b-4*a*c;
        
        if (a == 0) {
            if (b != 0) {
                double x = -c / b;
                System.out.println("Phương trình là phương trình bậc nhất.");
                System.out.println("Nghiệm của phương trình: x = " + x);
            } else if (c == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình không có nghiệm.");
            }
        } else {
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("Nghiệm 1: x1 = " + x1);
                System.out.println("Nghiệm 2: x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có một nghiệm kép:");
                System.out.println("Nghiệm: x = " + x);
            } else {
                System.out.println("Phương trình không có nghiệm thực.");
            }
        }

        input.close();
    }
}
