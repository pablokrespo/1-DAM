package ejemplo_abstracto;
public class Circulo extends Poligonos{

    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }
       
    @Override
    public void calcularArea() {
        System.out.println("Area círculo= "+(Math.PI*Math.pow(radio, 2)));
    }
}
