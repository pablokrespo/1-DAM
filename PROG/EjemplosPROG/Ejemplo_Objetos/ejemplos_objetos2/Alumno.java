package ejemploobjetos;
public class Alumno {
    private String nombre;
    private int nota;
    
    public void darNota(int not) {
        nota= not;
    }
    public int verNota() {
        return nota;
    }
}
