// Exercise 6.3: TriangleStar.java
import java.util.Scanner;
public class TriangleStars {
    public static void main(String[] args) {
        Scanner keboard = new Scanner(System.in);

        System.out.println("Input height triangle: ");
        int n = keboard.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
