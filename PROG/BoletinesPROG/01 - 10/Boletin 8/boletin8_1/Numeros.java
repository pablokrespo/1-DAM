package boletin8_1;
import java.util.Scanner;
public class Numeros {
Scanner sc = new Scanner(System.in);
    private float numeros;
    public Numeros(){
    }
    public Numeros(float numero){
        numeros= numero;
    }
    public void Cantidade(float numero){
        System.out.println("Escribe el numero: ");
        numeros= sc.nextFloat();
    }
    public void Cuentas(){
        if (numeros < 500) {
            System.out.println("Cantidad: "+numeros+"\nIncremeto: "+numeros*50/100+"\nCantidad Final:"+(numeros+((numeros*50)/100)));
        } else if (numeros <= 1000) {
            System.out.println("Cantidad: "+numeros+"\nIncremeto: "+numeros*7/100+"\nCantidad Final:"+(numeros+((numeros*7)/100)));
        } else if (numeros <= 5000) {
            System.out.println("Cantidad: "+numeros+"\nIncremeto: "+numeros*15/100+"\nCantidad Final:"+(numeros+((numeros*15)/100)));
        } else {
            System.out.println("Cantidad: "+numeros+"\nDecremento: -"+numeros*3/100+"\nCantidad Final:"+(numeros-((numeros*3)/100)));
        }
    }    
}

