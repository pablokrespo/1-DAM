package boletin2_3;
import java.util.Scanner;
public class Boletin2_3 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduce el dinero total=");
        int dinero= sc.nextInt();
        
        System.out.println("Monedas de 1€= "+ (dinero/1));        
        
        System.out.println("Billetes de 5€= "+ (dinero/5));
        
        System.out.println("Billetes de 20€= "+ (dinero/20));
        
        System.out.println("Billetes de 100€= "+ (dinero/100));
    }
}
