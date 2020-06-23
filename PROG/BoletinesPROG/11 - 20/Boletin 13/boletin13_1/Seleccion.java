package boletin13_1;
public class Seleccion {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;

public void viaxar() {
        System.out.println("Viaja la seleccion");
}
public void concentrarse() {
    System.out.println("Se concentra la seleccion");
}
public Seleccion() {
}
public Seleccion(int id, String nombre, String apellido, int edad) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
}
    @Override
public String toString() {
    return "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad;
}
}
