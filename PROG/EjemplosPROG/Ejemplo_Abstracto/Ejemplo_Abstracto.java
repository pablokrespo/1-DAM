package ejemplo_abstracto;
public class Ejemplo_Abstracto {
public static void main(String[] args) {

    Poligonos triangulo= new Triangulo(4f,2f);
    triangulo.calcularArea();
    
    Poligonos rectangulo= new Rectangulo(5f,3f);
    rectangulo.calcularArea();
    
    Poligonos circulo= new Circulo(3f);
    circulo.calcularArea();
    
    }
}
