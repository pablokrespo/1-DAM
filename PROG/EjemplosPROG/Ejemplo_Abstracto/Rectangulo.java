package ejemplo_abstracto;
public class Rectangulo extends Cuadrilatero{

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }
    
    @Override
    public void calcularArea() {
        //Cuadrilatero cuadrilatero= new Cuadrilatero();
        //Cuadrilatero cuadrilatero= new Rectangulo();
        System.out.println("Area rectángulo= "+super.getBase()*super.getAltura());
    }
    
}
 