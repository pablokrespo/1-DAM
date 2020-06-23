package boletin11_2;
public class Media {
    private String nom;
    private String autor;
    private int duradaSegons;
    public Media(String nom, String autor, int duradaSegons) {
        this.nom= nom;
        this.autor= autor;
        this.duradaSegons= duradaSegons;
    }

    public Media() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String n) {
        nom= n;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String a) {
        autor= a;
    }

    public int getDurada() {
        return duradaSegons;
    }

    public void setDurada(int d) {
        duradaSegons= d;
    }    
}
