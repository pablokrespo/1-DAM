package boletin8_2;
import java.util.Scanner;
class Comprar {
    
public void compra(){
    Scanner sc= new Scanner(System.in);
  
    System.out.println("Unidades: ");
        int unidad= sc.nextInt();

    System.out.println("Precio: ");
        float precio= sc.nextFloat();
        
    
        float total= unidad*precio;
        float descuento= 0;
    

        if (unidad < 100) {
            descuento= 0;
        } else if (unidad < 200) {
            if (precio > 4000) {
                descuento= precio*unidad*0.95f;

            } else {
                descuento= precio*unidad*0.98f;
            }

        } else if (unidad >= 200) {
            if (precio > 4000) {
                descuento= precio*unidad*0.9f;
            } else {
                descuento= precio*unidad*0.92f;
            }

        }

        System.out.println("Unidades: " +unidad);
        System.out.println("Precio por unidad: " +precio +"€");
        System.out.println("Precio: " +total +"€");
        System.out.println("Descuento: " +descuento + "€");
    }
}
