package ejemploobjetos;
public class Alumno {
    private String nombre;
    private int nota;
    // constructores con parametros
    public Alumno(String nom, int not){
        nombre= nom;
        nota= not;
    }
    /* // contrusctor sin parametros
    public Alumno();{
    } */

    public Alumno(){
        
    }
    public void setNota(int not) {
        nota= not;
    }
    public int getNota() {
        return nota;
    }
    public void setNombre(String nom){
        nombre= nom;
    }
    public String getNombre(){
        return nombre;
    }
    public void amosar() {
        System.out.println("nombre"+ nota + "nombre"+ nota);
    }

}
