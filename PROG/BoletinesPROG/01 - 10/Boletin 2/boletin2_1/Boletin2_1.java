package boletin2_1;
import java.util.Scanner;
public class Boletin2_1 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Precio original=" );
        float precio= sc.nextFloat();
       
        System.out.println("Precio con el descuento=" );
        float descuento= sc.nextFloat();
        float porcentaje1= (precio-descuento);
        float porcentaje2= (porcentaje1/precio);
        float porcentaje3= (porcentaje2*100);
        
        System.out.println("Porcentaje descontado= "+ (porcentaje3)+"%");
    }
}
