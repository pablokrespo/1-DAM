package com.pablo.escritura;
import ejemplo_archivo.Jugador;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter
public class Escritura {
    PrintWriter escribir= null;
    FileWriter fich;
    
    public void escribirNumeros(String nombreFich){
        try {
            fich= new FileWriter(nombreFich); //para añadir ...(nombreFich, true)
            escribir= new PrintWriter(fich);
            escribir.println(1);
            escribir.println(2);
            escribir.println(3);
            escribir.println(4);
            escribir.println(5);
            escribir.println(6);
            escribir.println(7);
        } catch (IOException ex) {
            System.out.println("Error en escribirNumeros "+ex.toString());
        }
    }
    public void añadirNumeros(String nombreFich){
        try {
            fich= new FileWriter(nombreFich, true); //para añadir ...(nombreFich, true)
            escribir= new PrintWriter(fich);
            escribir.println(1);
            escribir.println(2);
            escribir.println(3);
            escribir.println(4);
            escribir.println(5);
            escribir.println(6);
            escribir.println(7);
        } catch (IOException ex) {
            System.out.println("Error en añadirNumeros "+ex.toString());
        }
    }
    public void escribirObjetos(String nombreFich){
        try{
            Jugador J1= new Jugador("Pablo", 7);
            Jugador J2= new Jugador("Rafiña", 12);
            fich= new FileWriter(nombreFich, true);
            escribir= new PrintWriter(fich);
            escribir.print(J1.getNombre()+", "+J1.getDorsal());
            escribir.print(J2);
        } catch (IOException ex) {
              System.out.println("Error en escribirObejetos "+ex.toString());
        }
    }   
}
