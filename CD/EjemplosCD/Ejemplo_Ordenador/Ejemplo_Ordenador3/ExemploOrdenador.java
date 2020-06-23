package exemploordenador;
/**
 * I import the java class for the scanner
 */
import java.util.Scanner;
/**
 * Main class
 * @author pcrespopoceiro
 */
public class ExemploOrdenador {

    /**
     * public static class that does not return anything main type
     * @param args 
     */
    public static void main(String[] args) {
        /**
         * I create a scanner called sc
         */
        Scanner sc = new Scanner(System.in);
        /**
         * I show a message on the screen asking me to enter the type of mouse
         */
        System.out.println("Introduce tipo raton= ");
        /**
         * it shows me a scanner on which I enter the string data
         */
        String tipo = sc.next();
        /**
         * I show a message on the screen asking me to enter the brand of the screen
         */
        System.out.println("Introduce marca pantalla= ");
       /**
        * It shows me an on-screen scanner in which I enter a string type that is stored in "marca"
        */
        String marca = sc.next();
        /**
         * I show a message on the screen asking me to enter the inches of the screen
         */
        System.out.println("Introduce pulgadas= ");
        /**
         * It shows me a scanner in which I enter the inches of the float type screen stored in the variable "pulgadas"
         */
        float pulgadas = sc.nextFloat();
        /**
         * I show a message on the screen asking me to enter the speed of the CPU
         */
        System.out.println("Introduce velocidade Cpu= ");
        /**
         * I introduce on the screen an int type that is the speed of the cpu that is stored in the variable "velocidade"
         */
        int velocidade = sc.nextInt();
        /**
         * I show a message on the screen asking me to enter the memory of the cpu
         */
        System.out.println("Introduce memoria Cpu");
        /**
         * I enter an int type data on the scanner that would be the memory of the CPU, which is stored in the variable "memoria"
         */
        int memoria = sc.nextInt();
/**
 * I create an object called a computer class pc
 */
        Computer pc = new Computer(tipo, marca, pulgadas, velocidade, memoria);
        /**
         * I show on screen the data entered previously
         */
        System.out.println("Tipo raton = " + pc.getMouse().getRato() + "Marca pantalla= " + pc.getScreen().getMarca() + "Pulgadas pantalla= " + pc.getScreen().getPulgada() + "Velocidade Cpu = " + pc.getCpu().getVelocidade() + "Memoria Cpu= " + pc.getCpu().getMemoria());

    }

}
