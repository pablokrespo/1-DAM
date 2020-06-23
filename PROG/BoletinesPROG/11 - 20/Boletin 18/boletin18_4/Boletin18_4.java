package boletin18_4;
import javax.swing.JOptionPane;
public class Boletin18_4 {
    public void DNIMuestra (int[] numero, char[] letra) {
        int DNI= Integer.parseInt(JOptionPane.showInputDialog("Introduce el DNI a comprobar"));
        int resto= DNI % 23;
        for (int i= 0; i<numero.length; i++) {
            if (resto== numero[i]) {
                JOptionPane.showMessageDialog(null, "La letra es: " + letra[i]);
            }
        }
    }
}