package exemploordenador;
public class Pantalla {
private String marca;
private float pulgadas;
public Pantalla() {
}
public Pantalla(String marca, float pulgadas) {
    this.marca= marca;
    this.pulgadas= pulgadas;
}
public void setMarca(String marca) {
    this.marca= marca;
}
public String getMarca() {
    return marca;
}
public void setPulgadas(float pulgadas) {
    this.pulgadas= pulgadas;
}
public float getPulgadas() {
    return pulgadas;
    }
}