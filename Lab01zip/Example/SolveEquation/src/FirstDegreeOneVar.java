// Example 6
import java.util.Scanner;

public class FirstDegreeOneVar {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a,b");
        double a= input.nextDouble();
        double b=input.nextDouble();
        if(a==0){
            if(b==0)
            System.out.println("Always true");
            else
             System.out.println("Not solution equation");
        }
        else{
        double res=-b/a;
        System.out.println("solution="+res);
        }
        input.close();
    }
}
