package primer_paquete;
public class Academia {
    public static int numReferencia = 2020;
    private String nombre;
    private int nota;
    private String personal;
    private int referencia;
    public Academia() {
        referencia=numReferencia;
        numReferencia++;
    }    
    public Academia(String nombre, int nota, String personal) {
        this.nombre = nombre;
        this.nota = nota;
        this.personal = personal;
        referencia=numReferencia;
        numReferencia++;
    }
    public int getNumReferencia() {
        return numReferencia;
    }
    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNome(String nombre) {
        this.nombre = nombre;
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    public String getPersonal() {
        return personal;
    }
    public void setPersoal(String personal) {
        this.personal = personal;
    }
    public static void saberNota(int nota){
        
    }
    @Override
    public String toString() {
        return "numReferencia=" + numReferencia + ", nombre=" + nombre + ", nota=" + nota + ", personal=" + personal;
    }
}
