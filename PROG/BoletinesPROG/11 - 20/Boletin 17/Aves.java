package boletin17;
public class Aves implements IPuedeVolar, IPuedeCaminar {

    @Override
    public void Volar() {
         System.out.println("Puedo volar, ave");
    }

    @Override
    public void Caminar() {
        System.out.println("Puedo caminar, ave");
    }
    
}
