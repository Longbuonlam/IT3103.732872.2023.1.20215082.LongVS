package Lab1;
import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello there, my name is Long!");
        String result;
        result = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hi " + result + "!");
        System.exit(0);
    }
}
