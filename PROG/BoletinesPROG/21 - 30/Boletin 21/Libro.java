package boletin21;
public class Libro {
    String titulo;
    String autor;
    float precio;
    int unidades;

/*  
Para hacer el mantenimiento, utiliza un menú con los siguientes puntos:
    a) Añadir  añadir un nuevo libro a nuestro archivo
    b) Consultar  dado el titulo de un libro, visualizar su precio. Si el libro no lo tenemos en nuestra librería visualizar un mensaje
    c) Visualizar  visualizar todos los datos del archivo
    d) Borrar  borra los lobros que tengas 0 unidades
    e) Modificar  modifica el precio de un libro determinado
*/
    public Libro() {
    }
    public Libro(String nome, String autor, float prezo, int unidades) {
        this.titulo = nome;
        this.autor = autor;
        this.precio = prezo;
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return titulo + ", " + autor + ", " + precio + ", " + unidades+",";
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo= titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor= autor;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio= precio;
    }
    public int getUnidades() {
        return unidades;
    }
    public void setUnidades(int unidades) {
        this.unidades= unidades;
    }
}
