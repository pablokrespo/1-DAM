package boletin13_1;
public class Jugador extends Seleccion {
private int dorsal;
private String demarcacion;
public void jugarPartido() {
    System.out.println("El jugador juega el partido");
}
public void entrenar() {
    System.out.println("El jugador entrena");
}
public Jugador() {
}
public Jugador(int dorsal, String demarcacion, int id, String nombre, String apellido, int edad) {
    super(id, nombre, apellido, edad);
    this.dorsal = dorsal;
    this.demarcacion = demarcacion;
}
public int getDorsal() {
    return dorsal;
}
public void setDorsal(int dorsal) {
    this.dorsal = dorsal;
}
public String getDemarcacion() {
    return demarcacion;
}
public void setDemarcacion(String demarcacion) {
    this.demarcacion = demarcacion;
}
    @Override
public String toString() {
    return "dorsal=" + dorsal + ", demarcacion=" + demarcacion;
}
    @Override
public void viajar() {
    System.out.println("Viaja el jugador");
}
}
