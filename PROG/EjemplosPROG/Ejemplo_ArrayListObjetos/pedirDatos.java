package ejemplo_arraylistobjetos;
import java.util.Scanner;
public class pedirDatos {
    public static int pedirInt() {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("Introduce un número: ");
        a = sc.nextInt();
        return a;
    }
    public static int pedirInt(String mensaje) {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println(mensaje);
        a = sc.nextInt();
        return a;
    }
    public static float pedirFloat() {
        Scanner sc= new Scanner(System.in);
        float b;
        System.out.println("Introduce un número: ");
        b = sc.nextFloat();
        return b;
    }
    public static String pedirString(String mensaje) {
        Scanner sc= new Scanner(System.in);
        String c;
        System.out.println(mensaje);
        c = sc.next();
        return c;
    }
}
