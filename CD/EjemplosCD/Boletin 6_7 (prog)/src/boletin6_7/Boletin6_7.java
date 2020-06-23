package boletin6_7;
import javax.swing.JOptionPane;
public class Boletin6_7 {
public static void main(String[] args) {
    int opcion;
        double lado, base, altura, radio, area;
        final double PI = 3.14;
        do{
            
    opcion = Integer.parseInt(JOptionPane.showInputDialog
        ("Escoge una de las siguientes figuras geométricas:\n1- Cadrado\n2- Triángulo\n3- Círculo\n\n0- Salir"));
    switch (opcion){
        case 1: lado = Double.parseDouble(JOptionPane.showInputDialog("Introducir el lado del cadrado:"));
            area = lado*lado;
            JOptionPane.showMessageDialog(null, "Introducir área del cadrado = " + area);
            break;
        case 2: base = Double.parseDouble(JOptionPane.showInputDialog("Introducir la base del triángulo:"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Introducir la altura del triángulo:"));
            area = (base * altura) / 2;
            JOptionPane.showMessageDialog(null, "Introducir área del triángulo = " + area);
            break;
        case 3: radio = Double.parseDouble(JOptionPane.showInputDialog("Introducir el radio del círculo:"));
            area = PI * Math.pow(radio, 2);
            JOptionPane.showMessageDialog(null, "Introducir área del círculo = " + area);
            break;
        case 0: break;
            default: JOptionPane.showMessageDialog(null, "Opción errónea");
            break;
        }}while(opcion!=0);
}}
