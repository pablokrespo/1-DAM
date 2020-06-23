package ejemplobucle;
import java.util.Scanner;
public class Metodos {
    private int numero;
    private Scanner sc=new Scanner(System.in);
    
    public int pedirDatos(){
        System.out.println("Teclea número: ");
//        numero= sc.nextInt();
//        return numero;
          return sc.nextInt();
    }
            
    public void verDatos(){
        int contador= 0;
        while (contador < 5){
            numero= pedirDatos(){
            System.out.println(numero);
            contador++ ;
        }
    System.out.println("Terminamos");
}

