package boletin2_4;
import java.util.Scanner;
public class Boletin2_4 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
       
        System.out.println("Introduce el dinero total=" );
        int dinero= sc.nextInt();
        int dinero1= ((dinero%5)/1);
        int dinero5= ((dinero%20)/5);
        int dinero20= ((dinero%100)/20));
        int dinero100= (dinero/100);
       
        System.out.println("Son "+dinero100+" billete(s) de 100 ")
       
        System.out.println("+ "+dinero20+" billete(s) de 20 "
        
        System.out.println("+ "+dinero5+" billete(s) de 5 ")
        
        System.out.println("+ "+dinero1+" moneda(s) de 1 ");
    }
}
