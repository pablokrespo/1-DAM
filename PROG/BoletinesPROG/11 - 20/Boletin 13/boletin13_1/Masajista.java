package boletin13_1;
public class Masajista extends Seleccion {
private String titulacion;
private int anosExperencia;
public void darMasajes() {
    System.out.println("El entrenador da masajes");
}
public Masajista() {
}
public Masajista(String titulacion, int anosExperencia, int id, String nombre, String apellido, int edad) {
    super(id, nombre, apellido, edad);
    this.titulacion = titulacion;
    this.anosExperencia = anosExperencia;
}
public String getTitulacion() {
    return titulacion;
}
public void setTitulacion(String titulacion) {
    this.titulacion = titulacion;
}
public int getAnosExperencia() {
    return anosExperencia;
}
public void setAnosExperencia(int anosExperencia) {
    this.anosExperencia = anosExperencia;
}
    @Override
public String toString() {
    return "titulacion=" + titulacion + ", anosExperencia=" + anosExperencia;
}
    @Override
public void viaxar() {
    System.out.println("Viaja el masajista");
}
}
