package boletin17;
public class Mamifero implements IPuedeCaminar,IPuedeVolar,IPuedeNadar {

    @Override
    public void Volar() {
         System.out.println("Puedo volar, mamifero");
    }

    @Override
    public void Caminar() {
        System.out.println("Puedo caminar, mamifero");
    }

    @Override
    public void Nadar() {
        System.out.println("Puedo nadar, Mamifero");
    }
}
