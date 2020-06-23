package ejemplocondiciones;
import java.util.Scanner;
public class Condicional {
private int edad;
public Condicional() {
    Scanner sc= new Scanner(System.in);
    public void entrar(int edad) {
        if(edad== 18) {
            System.out.println("Queda en la puerta");
                else if(edad< 18) 
            System.out.println("No puede entra");
         
        else 
            System.out.println("Puede entrar");
        System.out.println("Chao");
        } 
    }

    int pedirInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String permiso(int ed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
}