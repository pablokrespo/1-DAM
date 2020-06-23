package boletin14_1;
import java.util.Scanner;
public class Boletin14_1 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIntroduce la temperatura en grados Celsius: ");
        float temperatura = sc.nextFloat();

        ConversorTemperaturas obx = new ConversorTemperaturas();
        try {
            System.out.println("Temperatura en grados Fahrenheit: "+obx.gradosCaF(temperatura));
            System.out.println("Temperatura en grados Kelvin: "+obx.gradosCaK(temperatura));
        } catch (TemperaturaErroneaExcepcion error) {
            System.out.println("Error "+error.toString());
        }
    }  
}
