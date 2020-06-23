package tarea7;
public abstract class Barco {
    private int dias;
    private float eslora;
    private String matricula;
    public Barco() {
    }
    public Barco(int dias, float eslora, String matricula) {
        this.dias= dias;
        this.eslora= eslora;
        this.matricula= matricula;
    }
    public int getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias= dias;
    }
    public float getEslora() {
        return eslora;
    }
    public void setEslora(float eslora) {
        this.eslora= eslora;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula= matricula;
    }
    @Override
    public String toString() {
        return "Eslora= " +eslora +", Dias= " +dias +", Matricula= " +matricula;
    }
    public abstract void calcularPrecio();
}
