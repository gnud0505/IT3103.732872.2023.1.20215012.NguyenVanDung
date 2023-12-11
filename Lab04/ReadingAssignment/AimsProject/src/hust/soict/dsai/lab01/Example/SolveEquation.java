// Example 6: SolveEquation.java
import javax.swing.JOptionPane;
public class SolveEquation {
    static void linearEquation(double a, double b){
        String result;
        if(a == 0){
            if(b ==0) {
                result = "The equation 0 = 0 has ìnfinitely many solutions";
            }else {
                result = "the equation " + b + " = 0 has no solution";
            }
        }else {
            result = "The equation " + a + "x + " + b + " = 0 has a solution of " + -b/a;
        }
        JOptionPane.showMessageDialog(null, result, "Solution",
                JOptionPane.INFORMATION_MESSAGE );
    }

    public static void main(String[] args) {
        String n;
        n = JOptionPane.showInputDialog(null, "1. Linear equation\n" +
                "2. Linear system\n3. The second-degree equation\nPlease choose(1-3)", "Option", JOptionPane.INFORMATION_MESSAGE);
        switch (n){
            case "1":
                String a, b;
                a = JOptionPane.showInputDialog(null, "Enter a: ", "Equation ax+b", JOptionPane.INFORMATION_MESSAGE);
                double c = Double.parseDouble(a);
                b = JOptionPane.showInputDialog(null, "Enter b: ", "Equation ax+b", JOptionPane.INFORMATION_MESSAGE);
                double d = Double.parseDouble(b);

                linearEquation(c,d);
                break;
        }
    }
}
