package nuevoPaquete;
public class Libro implements Comparable {
    String titulo;
    String autor;
    String ISBN; 
    float precio;
    int numeroUnidades;

    public Libro(String titulo, String autor, String ISBN, float precio, int numeroUnidades) {
        this.titulo= titulo;
        this.autor= autor;
        this.ISBN= ISBN;
        this.precio= precio;
        this.numeroUnidades= numeroUnidades;
    }
    public Libro(){
    }

    @Override
    public String toString() {
        return "Título= " +titulo + ", Autor= " +autor + ", ISBN= " +ISBN + ","
                + " Precio= " +precio + ", Número Unidades= " +numeroUnidades+"\n";
    }

    @Override
    public int compareTo(Object o) {
        Libro libro = (Libro)o ;
        if(this.titulo.compareToIgnoreCase(libro.titulo)==0)
            return 0;
        else if(this.titulo.compareToIgnoreCase(libro.titulo)>0)
            return 1;
        else 
            return -1 ;   
    }
}
