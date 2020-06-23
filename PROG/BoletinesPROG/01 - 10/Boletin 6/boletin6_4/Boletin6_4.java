package boletin6_4;
public class Boletin6_4 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Eduardo", 83.6f);
        Persona persona2 = new Persona("Turipikaka", 64);
        if(persona1.getPeso() > persona2.getPeso()){
            System.out.println(persona1.getNombre() + " pesa más que " + persona2.getNombre());
            System.out.println("La diferencia de peso es de " + (persona1.getPeso() - persona2.getPeso()));
        } else{
            System.out.println(persona2.getNombre() + " pesa más que " + persona1.getNombre());
            System.out.println("La diferencia de peso es de " + (persona2.getPeso() - persona1.getPeso()));
    }  
}}
