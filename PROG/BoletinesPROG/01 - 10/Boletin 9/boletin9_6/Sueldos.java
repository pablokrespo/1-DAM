package boletin9_6;
import javax.swing.JOptionPane;
class Sueldos {
public void lecturaSueldos(){
        double sueldo;
        int contTrabajadores= 0;
        int contSueldos1= 0;
        int contSueldos2= 0;
        do{
            sueldo= Double.parseDouble(JOptionPane.showInputDialog("Introduzca el sueldo de un empleado:"));
            if(sueldo > 0){
                contTrabajadores++;
            }
            if(sueldo >= 1000 && sueldo <= 1750){
                contSueldos1++;
            }
            else if(sueldo < 1000 && sueldo > 0){
                contSueldos2++;
            }
        }while(sueldo!= 0);
        JOptionPane.showMessageDialog(null, "Número de trabajadores que ganan entre 1000 y 1750€: " 
                + contSueldos1 + "\nPorcentaje de trabajadores que ganan menos de 1000€: " 
                + (contSueldos2*100/contTrabajadores));    
}}
