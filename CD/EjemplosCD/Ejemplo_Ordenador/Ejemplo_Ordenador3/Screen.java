package exemploordenador;
/**
 * screen object class
 * @author pcrespopoceiro
 */
public class Screen {
/**
 * I declare the private variables string type "marca" and float type "pulgada"
 */
    private String marca;
    private float pulgada;
    /**
     * constructor sin parametros
     */
    public Screen() {
    }
    /**
     * I think public method "screen" to declare a value "marca" type
     * string
     *
     * @param marca fabricante de la pantalla
     * @param pulgada unidad de medida de la pantalla
     */
    public Screen(String marca, float pulgada) {
        this.marca = marca;
        this.pulgada = pulgada;
    }
    /**
     * I create a constructor with parameters
     * String
     *
     * @param marca valor marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * I use the access method to return a String "marca"
     *
     * @return dI return the variable "marca"
     */
    public String getMarca() {
        return marca;
    }
    /**
     * I create a method that does not return anything called setPulgada in which I send a float type called  "pulgada"
     * "pulgada" tipo float
     *
     * @param pulgada pulgada
     */
    public void setPulgada(float pulgada) {
        this.pulgada = pulgada;
    }
    /**
     * I use the access method to return me "pulgada" type float
     * @return I return  value "pulgada"
     */
    public float getPulgada() {
        return pulgada;
    }
}
