package Validaciones;
import java.util.Scanner;
public class Validar {
    public float validaFloatPositivo(){
    Scanner sc=new Scanner(System.in);
        float valor;
        do{
           valor=sc.nextFloat();
        }while(valor<=0);
        return valor;
    }    
}