package tarea7;
import java.util.ArrayList;
public class Tarea7 {
    public static void main(String[] args) {
        Yate yate1= new Yate(1000, 25, 15, 50, "YateA1");
        Deportivo deportivo1= new Deportivo(1000, 10, 20, "DeportA2");
        Velero velero1= new Velero(5, 7, 35, "VeleroA3");

        yate1.calcularPrecio();
        deportivo1.calcularPrecio();
        velero1.calcularPrecio();

        listaBarco.add(yate1);
        listaBarco.add(deportivo1);
        listaBarco.add(velero1);

        for (int i= 0; i<listaBarco.size(); i++) {
            System.out.println(listaBarco.get(i).toString());
        }
    }
}
