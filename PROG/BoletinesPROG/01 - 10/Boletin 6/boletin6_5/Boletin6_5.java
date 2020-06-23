package boletin6_5;
import javax.swing.JOptionPane;
public class Boletin6_5 {
public static void main(String[] args) {
    int numero1, numero2, numero3;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un primer número:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un segundo número:"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un tercer número:"));
    int mayor;
        if(numero1>numero2){
            mayor = numero1;
            if(numero3>numero1){
                mayor = numero3;
            }
        }
        else{
            mayor = numero2;
            if(numero3>numero2){
                mayor = numero3;
            }
        }
        JOptionPane.showMessageDialog(null, "El número mayor es el " + mayor);
    } 
}
