package boletin9_2;
import java.util.Scanner;
class Numeros {
    Scanner sc=new Scanner(System.in);
public void Operaciones(){
    int contador = 10;
    int suma = 0;
    double producto = 1;
    while (contador < 90){
        suma= suma + contador;
        producto= producto * contador;
        contador= contador +1;
}
    System.out.println("El resultado de la suma es = " + suma);
    System.out.println("El resultado de la multiplicación es = " + producto);    
}
