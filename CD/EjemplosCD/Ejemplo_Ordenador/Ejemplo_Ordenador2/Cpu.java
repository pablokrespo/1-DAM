package exemploordenador;
public class Cpu {
    private int velocidad;
    private int memoria;
public Cpu() {
    }
public Cpu(int velocidade, int memoria) {
        this.velocidad= velocidad;
        this.memoria= memoria;
    }
public void setVelocidad(int velocidad) {
        this.velocidad= velocidad;
    }
public int getVelocidad() {
        return velocidad;
    }
public void setMemoria(int memoria) {
        this.memoria= memoria;
    }
public int getMemoria() {
        return memoria;
    }
}