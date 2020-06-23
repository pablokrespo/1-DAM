package ejemploobjetos;
public class EjemploObjetos 
{
    public static void main(String[] args) 
    { //instanciar objeto
    Alumno pablo= new Alumno();
    pablo.darNota(10);
    int valorNota= pablo.verNota();
    
    System.out.println("Pablo tiene un: "+valorNota);
    
    }
}
