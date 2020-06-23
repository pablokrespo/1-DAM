package tarea7;
public class Velero extends Barco {
    private int numeroMastiles;
    private float precio;
    public Velero() {
    }
    public Velero(int mastiles, int dias, float eslora, String matricula) {
        super(dias, eslora, matricula);
        this.numeroMastiles= mastiles;
    }
    public int getNumeroMastiles() {
        return numeroMastiles;
    }
    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles= numeroMastiles;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio= precio;
    }
    @Override
    public void calcularPrecio() {
        precio= 8*numeroMastiles + 10*super.getEslora()*super.getDias();
    }
    @Override
    public String toString() {
        return "Número Mastiles= " +numeroMastiles +", Precio= " +precio;
    }
}
