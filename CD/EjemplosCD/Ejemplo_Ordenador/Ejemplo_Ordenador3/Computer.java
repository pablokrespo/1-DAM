package exemploordenador;
/**
 * computer object class
 * @author pcrespopoceiro
 */
public class Computer {
/**
 * declaration of attributes
 */
    private Mouse mouse;
    private Screen screen;
    private Cpu cpu;

    public Computer() {
        mouse = new Mouse();
        screen = new Screen();
        cpu = new Cpu();
    }
/**
 * Constructor with parameters to initialize the attributes
 * @param tipo example of type
 * @param marca product manufacturer
 * @param pulgadas screen measurements
 * @param velocidade speed
 * @param memoria  Storage capacity
 */
    public Computer(String tipo, String marca, float pulgadas, int velocidade, int memoria) {
        mouse = new Mouse(tipo);
        screen = new Screen(marca, pulgadas);
        cpu = new Cpu(velocidade, memoria);

    }
/**
 * Public method that returns nothing, called "setRato" with Mouse type parameter called mouse
 * @param mouse attribute
 */
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
/**
 * I think public method that returns me Mouse type called getRato
 * @return it gives me back the value that I store in the
 
 */
    public Mouse getMouse() {
        return mouse;
    }
/**
 * I think public method that does not return anything called set Screen with parameter Screen type called screen
 * @param screen I store the value assigned on screen using this to distinguish it
 */
    public void setScreen(Screen screen) {
        this.screen = screen;
    }
/**
 * I create a public method that returns to me Screen type called getScreen, without parameters
 * @return store in the screen attribute
 */
    public Screen getScreen() {
        return screen;
    }
/**
 * I think public method that does not return anything called setCpu, with parameters type Cpu called cpu
 * @param cpu cpu store using this to distinguish
 */
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
/**
 * I think public method that returns me type Cpu called getCpu without parameters
 * @return gives me cpu value
 */
    public Cpu getCpu() {
        return cpu;
    }
}
