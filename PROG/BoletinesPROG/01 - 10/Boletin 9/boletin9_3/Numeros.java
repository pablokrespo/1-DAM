package boletin9_3;
import java.util.Scanner;
class Numeros {
    private int base;
    private int altura;
    Scanner sc=new Scanner(System.in);
public int pedirBase(){
    System.out.println("Base: ");
    base=sc.nextInt();
    return base;
}   
public int pedirAltura(){
    System.out.println("Altura: ");
    altura=sc.nextInt();
    return altura;
}
public void Operaciones(){
    base=pedirBase();
    while (base<0){
    System.out.println("Dato no válido");
        base=pedirBase();
    }
    altura=pedirAltura();
    while (altura<0){
    System.out.println("Dato no válido");
        altura=pedirAltura();
    }
    System.out.println("El area del rectangulo es:" + base * altura);    
}
}