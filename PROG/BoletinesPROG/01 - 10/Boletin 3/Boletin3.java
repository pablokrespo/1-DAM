package boletin.pkg3;
public class Boletin3 {
public static void main(String[] args) {
// a) Crea un obxecto, de tipo consume, utilizando o constructor sen parámetros
        Consumo Consumo1= new Consumo();
        Consumo1.visualizar();
        System.out.println("Kms: "+Consumo1.getKms());
        System.out.println("Litros: "+Consumo1.getLitros());
        System.out.println("vMed: "+Consumo1.getvMed());
        System.out.println("pGas: "+Consumo1.getpGas());
// b) Dalle a litros o valor 50 e a prezo da gasolina 1.57
        Consumo1.visualizar();
        Consumo1.setLitros(50f);
        Consumo1.setpGas(1.57f);
        System.out.println("\nLitros: "+Consumo1.getLitros()+" L"+"\nPrecio de la gasolina: "+Consumo1.getpGas()+" Euros");
// c) Crea un obxecto, tipo consumo, utilizando o contructor con todos os parámetros
        Consumo Consumo2= new Consumo(120f,50f,70f,1.57f);
        System.out.println("\nKms: "+Consumo2.getKms());
        System.out.println("Litros: "+Consumo2.getLitros());
        System.out.println("vMed: "+Consumo2.getvMed());
        System.out.println("pGas: "+Consumo2.getpGas());
// d) Visualiza, a  través do 2º obxecto, o consumo medio
        System.out.println("El consumo medio es: "+Consumo2.consumoM()+" L/100km");
// e) Varia o valor dos litros consumidos do 2º obxecto.
        Consumo2.setLitros(70f);
        System.out.println("\nLitros: "+Consumo2.getLitros());
        System.out.println("El consumo medio es: "+Consumo2.consumoM()+" L/100km");
// f) Visualiza a velocidade media do 2º obxecto
        System.out.println("\nVelocidad media: "+Consumo2.getvMed());
    }
}
