import javax.swing.JOptionPane;
public class solve {
    public static void main(String[] args){
        int numVar = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of variable:"));
        if (numVar == 1){
            int a = Integer.parseInt(JOptionPane.showInputDialog("equation has form: ax + b = 0 \nEnter value of a(a != 0): "));
            if (a == 0) JOptionPane.showMessageDialog(null, "ERROR");
            else {
                double b = Integer.parseInt(JOptionPane.showInputDialog("equation has form: ax + b = 0 \nEnter value of b "));
                double x = (double) -b / a;
                JOptionPane.showMessageDialog(null, "x = " + x);
            }
        }
        else if (numVar == 2){
            int a11 = Integer.parseInt(JOptionPane.showInputDialog("equation has form: a11x1 + a12x2 = b1; a21x1 + a22x2 = b2 \nEnter value of a11: "));
            int a12 = Integer.parseInt(JOptionPane.showInputDialog("equation has form: a11x1 + a12x2 = b1; a21x1 + a22x2 = b2  \nEnter value of a12: "));
            int b1 = Integer.parseInt(JOptionPane.showInputDialog("equation has form: a11x1 + a12x2 = b1; a21x1 + a22x2 = b2  \nEnter value of b1: "));
            int a21 = Integer.parseInt(JOptionPane.showInputDialog("equation has form: a11x1 + a12x2 = b1; a21x1 + a22x2 = b2  \nEnter value of a21: "));
            int a22 = Integer.parseInt(JOptionPane.showInputDialog("equation has form: a11x1 + a12x2 = b1; a21x1 + a22x2 = b2  \nEnter value of a22: "));
            int b2 = Integer.parseInt(JOptionPane.showInputDialog("equation has form: a11x1 + a12x2 = b1; a21x1 + a22x2 = b2  \nEnter value of b2: "));
            
            int det = a11 * a22 - a12 * a21;
            int check = a11 * b2 - b1 * a21;
            if (det == 0) {
                if (check == 0) JOptionPane.showMessageDialog(null, "infinitely many solutions");
                else JOptionPane.showMessageDialog(null, "No solution");
            }
            else {
                double x2 = (double) check / det;
                double x1 = (double)(b1-a12*x2) / a11;
                JOptionPane.showMessageDialog(null, "x1 = " + x1 + "\nx2 = " + x2);
            }
        }
    }
}