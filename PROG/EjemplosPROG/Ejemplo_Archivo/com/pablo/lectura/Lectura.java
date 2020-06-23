package com.pablo.lectura;
import ejemplo_archivo.Jugador;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Lectura {
    Scanner sc;
    public void leerLineas(File fich){
        try {
            sc= new Scanner(fich); //flujo de datos abierto
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }      
        } catch (FileNotFoundException ex) {
            System.out.println("Error en leerLineas "+ex.toString());
        }
        finally {
            sc.close(); //flujo de datos cerrado
        }
    }
    public void leerPalabras(File fich){
        try {
            sc= new Scanner(fich); //flujo de datos abierto
            while(sc.hasNext()){
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error en leerPalabras "+ex.toString());
        }
        finally {
            sc.close(); //flujo de datos cerrado
        }
    }
    public void leerPalabrasUsoDeLimitadores(File fich){
        try {
            sc= new Scanner(fich).useDelimiter(",\\s*"); //flujo de datos abierto
            while(sc.hasNext()){ 
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error en leerPalabrasUsoDeLimitadores "+ex.toString());
        }
        finally {
            sc.close(); //flujo de datos cerrado
        }
    }
    public LinkedList <Integer> leerNumeros(File fich){
        LinkedList <Integer> listaNumeros= new LinkedList();
        try {
            sc= new Scanner(fich); //flujo de datos abierto
            while(sc.hasNextInt()){
                Integer valor= sc.nextInt();
                //if(valor%2!=0)
                    listaNumeros.add(valor);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error en leerNumeros "+ex.toString());
        }
        finally {
            sc.close(); //flujo de datos cerrado
        }
        return (LinkedList) listaNumeros;
    } 
    public void leerObjetos(File fich){
        String nombre, cadena;
        int dorsal;
        
        Jugador J;
        try {
            sc=new Scanner(fich);
            while(sc.hasNextLine()){
                cadena= sc.nectLine();
                String[] datos= cadena.split(", ");
                
                nombre= datos[0];
                dorsal= Integer.parseInt(datos[1]);
                J= new Jugador(nombre, dorsal);
                System.out.println("// "+J);
                
                lista.add(J);
                lista.add(new Jugador(datos[0], Integer.parseInt(datos[1])))
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error en leerObjetos "+ex.toString());
        }
        finally {
            sc.close(); //flujo de datos cerrado
        }
    }
}
    
