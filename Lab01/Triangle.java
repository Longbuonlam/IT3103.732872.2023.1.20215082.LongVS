package Lab1;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Triangle {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Triangle by Long");
        Scanner scanner = new Scanner(System.in);

        // Get the height from the user
        System.out.print("Enter the height of the triangle: ");
        int n = scanner.nextInt();
        scanner.close();

        // Loop through each row from 1 to n
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line to start a new row
            System.out.println();
        }
    }
}
