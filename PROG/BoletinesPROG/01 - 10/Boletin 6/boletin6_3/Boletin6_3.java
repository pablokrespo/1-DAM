package boletin6_3;
import javax.swing.JOptionPane;
public class Boletin6_3 {
    public static void main(String[] args) {
    double numero1;
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca un número:"));
        if(numero1> 0) {
            JOptionPane.showMessageDialog(null, "+");
            } else if(numero1< 0) {
                JOptionPane.showMessageDialog(null, "-");
            } else {
                JOptionPane.showMessageDialog(null, "0");
            }
    }
    
}
