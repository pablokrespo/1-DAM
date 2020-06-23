package boletin6_2;
import javax.swing.JOptionPane;
public class Boletin6_2 {
public static void main(String[] args) {
    short numero1, numero2;
        numero1 = Short.parseShort(JOptionPane.showInputDialog("Introduzca el primer número:"));
        numero2 = Short.parseShort(JOptionPane.showInputDialog("Introduzca el segundo número:"));
    if(numero1 > numero2){
        JOptionPane.showMessageDialog(null, "Suma: " + (numero1 + numero2));
        JOptionPane.showMessageDialog(null, "Resta: " + (numero1 - numero2));
    }
    else{
        JOptionPane.showMessageDialog(null, "Suma: " + (numero1 + numero2));
    }
}}
