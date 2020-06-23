package boletin4_2;
public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;
public Satelite() {
        meridiano= 0;
        paralelo = 0;
        distanciaTerra = 0;
    }
public Satelite(double m, double p, double d) {
        meridiano= m;
        paralelo = p;
        distanciaTerra = d;
    }
public void verPosicion() {
        System.out.println("El satelite se encuentra en el paralelo: " +paralelo
                + " en el meridiano: " +meridiano + " y a una distancia de la tierra de: " +distanciaTerra); 
}
}