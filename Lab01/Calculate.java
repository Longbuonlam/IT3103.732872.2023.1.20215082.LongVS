package Lab1;
import java.lang.String;
import javax.swing.JOptionPane;
public class Calculate {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Welcome to Long's Program!!");
        String Num1;
        Num1 = JOptionPane.showInputDialog(null, "Input the first number: ");
        double num1 = Double.parseDouble(Num1);
        String Num2;
        Num2 = JOptionPane.showInputDialog(null, "Input the second number: ");
        double num2 = Double.parseDouble(Num2);
        //Tinh Tong, Hieu, Tich, Thuong
        double sum = num1+num2;
        double difference = num1-num2;
        double product = num1*num2;
        double quotient = num1/num2;

        //In ra man hinh Tong, Hieu, Tich, Thuong
        JOptionPane.showMessageDialog(null,"Sum: " + sum);
        JOptionPane.showMessageDialog(null,"Difference: " + difference);
        JOptionPane.showMessageDialog(null,"Product: " + product);

        if (num2 != 0) {
            JOptionPane.showMessageDialog(null, "Quotient: " + quotient);
        } else {
            JOptionPane.showMessageDialog(null, "Quotient is undefined.");
            System.exit(0);
        }
    }
}
