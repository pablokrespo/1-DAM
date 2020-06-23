package boletin13_1;
public class Entrenador extends Seleccion {
private String idFederacion;
public void dirigirPartido() {
        System.out.println("El entrenador dirige el partido");
}
public void dirigirEntrenamiento() {
        System.out.println("El entrenador dirige el entrenamiento");
}
public Entrrenador() {
}
public Entrenador(String idFederacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
}
public String getIdFederacion() {
        return idFederacion;
}
public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
}
    @Override
public String toString() {
        return "idFederacion=" + idFederacion;
}
    @Override
public void viajar() {
    System.out.println("Viaja el entrenador");
}
}
