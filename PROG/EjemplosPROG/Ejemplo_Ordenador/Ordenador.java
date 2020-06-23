package exemploordenador;
public class Ordenador {
private Raton raton= new Raton();
private Pantalla pantalla= new Pantalla();
private Cpu procesador= new Cpu();
public Ordenador() {
    }
public Ordenador(Raton raton, Pantalla pantalla, Cpu procesador) {
    this.raton= raton;
    this.pantalla= pantalla;
    this.procesador= procesador;
}
public void setRaton(Raton raton) {
    this.raton= raton;
}
public Raton getRaton() {
    return raton;
}
public void setPantalla(Pantalla pantalla) {
    this.pantalla= pantalla;
}
public Pantalla getPantalla() {
    return pantalla;
}
public void setProcesador(Cpu procesador) {
    this.procesador= procesador;
}
public Cpu getProcesador() {
    return procesador;
}
public void amosar() {
    System.out.println("\n\n\n////// ORDENADOR //////");
    System.out.println("\nTipo de raton: "+getRaton().getTipo()+"\n\nMarca de la pantalla: "+
    getPantalla().getMarca()+"\nPulgadas: "+getPantalla().getPulgadas()+
    "\n\nVelocidad del procesador: "+getProcesador().getVelocidad()+
    "\nMemoria: "+getProcesador().getMemoria());
    }
}