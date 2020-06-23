package ejemplo_abstracto;
public class Triangulo extends Poligonos{
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.base= base;
        this.altura= altura;
    }
    
    @Override
    public void calcularArea() {
        System.out.println("Área triangulo= " +(base*altura)/2);
    }
}
