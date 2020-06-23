package singleton;
public class Persona {
    String nombre;
    String apellido;
    int edad;
    private static Persona unica;
    public Persona(){
    }
    
    private Persona(String nombre, String apellido, int edad){
        this.nombre= nombre;
        this.apellido= apellido;
        this.edad= edad;
    }
    
    public static Persona getInstance(){
        unica= new Persona();
        return unica;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }     
}
