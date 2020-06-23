package boletin4_3;
public class Boletin4_3 {
public static void main(String[] args) {
    Circulo Circulo1 = new Circulo();
    Circulo1.setRadio(12);
    Circulo1.amosar();
    System.out.println("Area: "+Circulo1.calcularArea() +" y una longitud: "+Circulo1.calcularLongitud());
    Circulo Circulo2 = new Circulo(16);
    Circulo2.amosar();
    System.out.println("Area: "+Circulo2.calcularArea() +" y una longitud: "+Circulo2.calcularLongitud());    
    }  
}
