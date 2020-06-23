package boletin6_4;
public class Persona {
private String nombre;
private float peso;
    public Persona(){}
    public Persona(String nombre, float peso){
       this.nombre = nombre;
       this.peso = peso;
    }
  
    public float getPeso(){
        return peso;
    }
    public String getNombre(){
       return nombre;
    }}
