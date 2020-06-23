package boletin2_2;
import java.util.Scanner;
public class Boletin2_2 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Grados centigrados=" );
        float celsius= sc.nextFloat();
        
        System.out.println("Grados Fahrenheit = "+ (celsius *9/5)+32);
        
        System.out.println("Grados Kelvin = "+ (celsius + 273.15f));
    }
}
