package ejemplo_archivo;
import com.pablo.escritura.Escritura;
import com.pablo.lectura.Lectura;
import java.io.File;
import java.util.LinkedList;
public class Ejemplo_Archivo {
public static void main(String[] args) {
    Lectura objetoLectura= new Lectura();
    //File archivo1= new File("palabras1.txt");
    //File archivo2= new File("C:\\Users\\PabloKrespo\\Documents\\NetBeansProjects\\PROG\\2º TRIMESTRE\\Ejemplo_Archivo\\palabras2.txt");
    //File archivo3= new File("numeros1.txt");
    //objetoLectura.leerLineas(archivo1);
    //objetoLectura.leerPalabras(archivo2);
    //objetoLectura.leerPalabrasUsoDeLimitadores(archivo2);
    //LinkedList lista= objetoLectura.leerNumeros(archivo3);
    //    for(Integer v :lista)
    //        System.out.println("** "+v);
    
    Escritura objetoEscritura= new Escritura();
    //objetoEscritura.escribirNumeros("numero7.txt")
    //objetoEscritura.escribirNumeros("C:\\Users\\PabloKrespo\\Documents\\NetBeansProjects\\PROG\\2º TRIMESTRE\\Ejemplo_Archivo\\numeros7.txt");
    
    Escritura objetoEscritura= new Escritura();
    //objetoEscritura.añadirNumeros("numero5.txt")
    //objetoEscritura.añadirNumeros("C:\\Users\\PabloKrespo\\Documents\\NetBeansProjects\\PROG\\2º TRIMESTRE\\Ejemplo_Archivo\\numeros5.txt");
    objetoEscritura.escribirObjetos("futbol.txt");
}
