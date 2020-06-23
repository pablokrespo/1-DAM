package ejemploobjetos;
public class EjemploObjetos 
{
    public static void main(String[] args) 
    { //instanciar objeto
    Alumno pablo= new Alumno();
    pablo.amosar();
    Alumno antia= new Alumno("ant",8);
    antia.amosar();
    antia.setNombre("Lucia");

    System.out.println("****"+ antia.getNombre());
    
    /*pablo.darNota(10);
    int valorNota= pablo.verNota();
    System.out.println("Pablo tiene un: "+valorNota);*/
    
    }
}
