// Example 5: CaculateOfTwoNumber.java
import javax.swing.JOptionPane;
public class CalculateOfTwoNumber {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2, sum, sub, mul, div;
        String result;

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ",
                "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ",
                "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);

        sum= num1 + num2; sub = num1 - num2; mul = num1 * num2;
        if(num2 ==0){
            result = num1 + " + " + num2 + " = " + sum + "\n"
                    + num1 + " - " + num2 + " = " + sub + "\n"
                    + num1 + " * " + num2 + " = " + mul + "\n"
                    + "Cannot be divide by 0";
        }else{
            div = num1/num2;
            result = num1 + " + " + num2 + " = " + sum + "\n"
                    + num1 + " - " + num2 + " = " + sub + "\n"
                    + num1 + " * " + num2 + " = " + mul + "\n"
                    + num1 + " \\ " + num2 + " = " + div;
        }
        JOptionPane.showMessageDialog(null, result, "Result calculate", JOptionPane.INFORMATION_MESSAGE);
    }
}
