package ejemplobucle;
import java.util.Scanner;
public class Metodos {
    private int numero;
    private Scanner sc=new Scanner(System.in);
    public void verDatos(){
        System.out.println("Teclea número: ");
        numero= getSc().nextInt();
        while(numero !=0){
            System.out.println(numero);
            System.out.println("Teclea número: ");
            numero= getSc().nextInt();
        }
        System.out.println("Terminamos");
    }
    public Scanner getSc() {
        return sc;
    }

    /**
     * @param sc the sc to set
     */
    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
