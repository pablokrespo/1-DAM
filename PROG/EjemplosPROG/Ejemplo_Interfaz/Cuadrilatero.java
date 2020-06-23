package ejemplo_abstracto;
public abstract class Cuadrilatero extends Poligonos{
    private float base;
    private float altura;

    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
        
    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
    
    
}
