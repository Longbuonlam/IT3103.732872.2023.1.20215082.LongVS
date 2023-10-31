package Lab1;
import javax.swing.JOptionPane;

public class LinearEquation {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Long's program");    // Chuong trinh giai phuong trinh bac nhat 1 an hoac 2 an
        String str;
        str = JOptionPane.showInputDialog(null, "How many variables?: ");
        int i = Integer.parseInt(str);

        switch (i){
            case 1:                         // Truong hop 1 an
                JOptionPane.showMessageDialog(null, "Linear Equation with one variable: ax+b=0");
                String stra;
                stra = JOptionPane.showInputDialog(null, "Input for a: ");
                int a = Integer.parseInt(stra);
                if (a == 0){
                    JOptionPane.showMessageDialog(null, "can't solve, try again");
                }
                else {
                    String strb;
                    strb = JOptionPane.showInputDialog(null, "Input for b");
                    int b = Integer.parseInt(strb);
                    double x;
                    x = -b / a;
                    JOptionPane.showMessageDialog(null, "X = " + x);
                }
                break;

            case 2:                                   //Truong hop 2 an
                JOptionPane.showMessageDialog(null, "Linear Equation with two variable: a11.x1+a12.x2=b1  and  a21.x1+a22.x2=b2");
                String stra11, stra12, stra21, stra22, strb1, strb2;
                stra11 = JOptionPane.showInputDialog(null,"Input for a11: ");
                stra12 = JOptionPane.showInputDialog(null,"Input for a12: ");
                stra21 = JOptionPane.showInputDialog(null,"Input for a21: ");
                stra22 = JOptionPane.showInputDialog(null,"Input for a22: ");
                strb1 = JOptionPane.showInputDialog(null,"Input for b1: ");
                strb2 = JOptionPane.showInputDialog(null,"Input for b2: ");
                int a11,a12,a21,a22,b1,b2;
                double x1,x2;
                a11 = Integer.parseInt(stra11);
                a12 = Integer.parseInt(stra12);
                a21 = Integer.parseInt(stra21);
                a22 = Integer.parseInt(stra22);
                b1 = Integer.parseInt(strb1);
                b2 = Integer.parseInt(strb2);
                x2 = (a21*b1-a11*b2)/(a21*a12-a22*a11) ;
                x1 = (b1-a12*x2)/a11;

                // Xet cac truong hop
                if ((a11/a21)!=(a12/a22)){
                    JOptionPane.showMessageDialog(null,"He phuong trinh co nghiem duy nhat: "+x1+" va "+x2);
                    break;
                } else if ((a11/a21)==(a12/a22)&&(a12/a22)!=(b1/b2)) {
                    JOptionPane.showMessageDialog(null,"He phuong trinh vo nghiem!");

                }else if ((a11/a21)==(a12/a22)&&(a12/a22)==(b1/b2)) {
                    JOptionPane.showMessageDialog(null, "He phuong trinh co vo so nghiem!");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null,"Xin moi nhap lai");
            break;
        }
        System.exit(0);
    }
}
