package Lab1;
import javax.swing.JOptionPane;

public class SecondDegreeEquation {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Long's program");
        JOptionPane.showMessageDialog(null,"second-degree equation: ax^2+bx+c=0");
        String stra = JOptionPane.showInputDialog(null,"Input for a: ");
        String strb = JOptionPane.showInputDialog(null,"Input for b: ");
        String strc = JOptionPane.showInputDialog(null,"Input for c: ");
        double a,b,c;
        double x, x1,x2;
        double delta;
        a = Double.parseDouble(stra);
        b = Double.parseDouble(strb);
        c = Double.parseDouble(strc);

        if(a == 0 && b != 0){
            x = -c/b;
            JOptionPane.showMessageDialog(null,"x = "+x);
        }
        else if(a != 0){
            delta = b*b-4*a*c;
            if(delta < 0){
                JOptionPane.showMessageDialog(null,"Phuong trinh vo nghiem!");
            }else if(delta == 0){
                x = -b/2*a;
                JOptionPane.showMessageDialog(null,"Phuong trinh co nghiem kep: x1 = x2 = "+x);
            }else if(delta > 0){
                x1 = (-b+Math.sqrt(delta))/2*a;
                x2 = (-b-Math.sqrt(delta))/2*a;
                JOptionPane.showMessageDialog(null,"Phuong trinh co 2 nghiem: x1 = "+x1+"  x2 = "+x2);
            }
        }else if(a == 0 && b == 0 && c != 0){
            JOptionPane.showMessageDialog(null, "Khong giai duoc!");
        }else if(a == 0 && b == 0 && c == 0){
            JOptionPane.showMessageDialog(null,"Phuong trinh co vo so nghiem!");
        }

        System.exit(0);
    }
}
