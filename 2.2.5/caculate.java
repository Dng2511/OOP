import javax.swing.JOptionPane;

public class caculate {
    public static void main(String[] args){
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number:"));
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        JOptionPane.showMessageDialog(null, "Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + "\nQuotient: " + quotient);
        System.exit(0);
    }
}
