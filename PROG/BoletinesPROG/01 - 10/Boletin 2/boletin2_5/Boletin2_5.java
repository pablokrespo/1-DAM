package boletin2_5;
import java.util.Scanner;
public class Boletin2_5 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner (System.in);
        double sueldobruto, sueldoliquido, sueldofijo, euroskm, eurosdias, importe;
        
        System.out.println("Sueldo fijo: ");
        sueldofijo= leer.nextDouble();
       
        System.out.println("€/Km: ");
        euroskm= leer.nextDouble();
        
        System.out.println("€/dia de transporte: ");
        eurosdias= leer.nextDouble();
        
        System.out.println("Importe: ");
        importe= leer.nextDouble();
        sueldobruto= sueldofijo+(euroskm*2)+(eurosdias*30)+(importe*5/100);
        sueldoliquido= sueldobruto -(sueldobruto*18/100)- 36;
        
        System.out.println("El empleado tiene un saldo bruto de "+sueldobruto+" € pero su saldo neto es de " +sueldoliquido+ "€");
    }
}
