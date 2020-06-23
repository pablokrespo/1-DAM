package boletin12_1;
import javax.swing.JOptionPane;
public class Coche {
    String matricula;
public Coche (String matricula) {this.matricula= matricula;}
public void setMatricula(String matricula) {this.matricula= matricula;}
public String getMatricula() {return matricula;}     
public void aparcar(int plazas){
    if (plazas>0){
        plazas--;
    System.out.println("El coche con la matricula "+matricula+" a sido reguistrado, quedan "+plazas+" plazas");
  
    }else {System.out.println("No quedan plazas disponibles");}
}
    
public void salir(int plazas){
    plazas++;
    int numeroDeHoras=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de Horas:"));
    int precioPagado=Integer.parseInt(JOptionPane.showInputDialog("Introduce dinero a pagar:"));
    double precio;
    if (numeroDeHoras<3){precio=1.5;}else {precio}
    int cambio=precioPagado-precio;
}
}
