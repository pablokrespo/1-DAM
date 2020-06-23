package tarea7;
public class Yate extends Barco {
    private int potencia;
    private int numeroCamarotes;
    private float precio;
    public Yate() {
    }
    public Yate(int potencia, int numeroCamarotes, int dias, float eslora, String matricula) {
        super(dias, eslora, matricula);
        this.potencia= potencia;
        this.numeroCamarotes= numeroCamarotes; 
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia= potencia;
    }
    public int getNumCamarotes() {
        return numeroCamarotes;
    }
    public void setNumCamarotes(int numeroCamarotes) {
        this.numeroCamarotes= numeroCamarotes;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio= precio;
    }
    @Override
    public String toString() {
        return "Potencia= " +potencia +", numeroCamarotes= " +numeroCamarotes +", Precio= " +precio;
    }
    @Override
    public void calcularPrecio() {
        precio= 2*potencia + 10*super.getEslora()*super.getDias() + 25*numeroCamarotes;
    }
}
