package mcd;
 
import javax.swing.JOptionPane;

// cambio en la rama
 
public class MCD {
 
    static int mcd(int a, int b){
        int divisor;
         
        if (a>b) {
            divisor=b;
        } else {
            divisor=a;
        }
        while ((a%divisor!=0 || b%divisor!=0) && divisor>1) {
            divisor--;
        }
        return divisor;
    }
     
    public static void main(String[] args) {
        int valor1, valor2, resultado;
        //Pido al usuario los dos numeros para calcular el mcd:
        try{
            valor1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca primer número:"));
            valor2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca segundo número:"));
            
            resultado=mcd(valor1,valor2);
            
            JOptionPane.showMessageDialog(null, "El máximo común divisor de "+valor1+" y "+valor2+" es "+resultado);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Formato de número incorrecto");
        }
    }
     
}