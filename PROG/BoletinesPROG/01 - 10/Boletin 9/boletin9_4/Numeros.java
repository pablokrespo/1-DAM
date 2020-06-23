package boletin9_4;
import javax.swing.JOptionPane;
class Numeros {
public void tablaMultiplicar(){
    int numero;
    do{
    numero= Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número positivo:"));
    if(numero > 0){
        System.out.println("Tabla de multiplicar del número " + numero + ":");
            for(int i = 1; i < 21; i++){
        System.out.println(numero + " * " + i + " = " + numero*i);
        }
    }
    else{
        JOptionPane.showMessageDialog(null, "Número inválido. Inténtelo de nuevo");
    }
    }
    while(numero != 10);  
    }    
}
