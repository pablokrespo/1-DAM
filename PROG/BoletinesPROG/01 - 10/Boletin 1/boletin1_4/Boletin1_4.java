package boletin1_4;

import java.util.Scanner;

public class Boletin1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Da un numero:");
        float a = sc.nextFloat();
        Scanner sca = new Scanner(System.in);       
        System.out.println("Pon outro numero:");
        float b = sca.nextFloat();
        System.out.println("Suma="+(a+b));
        System.out.println("Resta="+(a-b));
        System.out.println("Multiplicacion="+(a*b));
        System.out.println("Division="+(a/b));
        
    }
    
}
