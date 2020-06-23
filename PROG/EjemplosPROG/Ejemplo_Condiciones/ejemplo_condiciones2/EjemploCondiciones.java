package ejemplocondiciones;
import java.util.Scanner;
public class EjemploCondiciones {
    public static void main(String[] args) {
       Condicional objeto1=new Condicional();
       Scanner sc= new Scanner(System.in);
       System.out.println("Edad: ");
       int ed= sc.nextInt();
       objeto1.entrar(ed);
    }
}
