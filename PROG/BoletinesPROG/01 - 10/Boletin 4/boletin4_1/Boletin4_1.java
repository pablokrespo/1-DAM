package boletin4_1;
import java.util.Scanner;
public class Boletin4_1 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        Coche Coche01 = new Coche();
        System.out.println("Velocidad= " + Coche01.getVelocidad() + " km/h");
        System.out.println("\nCuanto quiero que incremente la velocidad= ");
        Coche01.acelerar(ler.nextInt());
        System.out.println("Velocidad= " + Coche01.getVelocidad() + " km/h");
        System.out.println("\nCuanto quiero frenar la velocidad= ");
        Coche01.frenar(ler.nextInt());
        System.out.println("Velocidad= " + Coche01.getVelocidad() + " km/h");
    }    
}
