/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

/**
 * Object class mouse
 * @author ndiazdossantos
 */
public class Mouse {
/**
 * I declare the private variable string type called "rato"
 */
    private String rato;
/**
 * I think builder without parameters
 */
    public Mouse() {

    }
/**
 * I create a constructor with parameters in which I initialize the string variable called "rato"
 * @param rato name of "rato"
 */
    public Mouse(String rato) {
        this.rato = rato;
    }
/**
 * I create a method that doesn't return anything called setRato that sends a String type called "rato"
 * @param rato name of "rato"
 */
    public void setRato(String rato) {
        this.rato = rato;
    }
/**
 * I create a method called getRato that returns a string type
 * @return returns me a string type variable called "rato"
 */
    public String getRato() {
        return rato;
    }

}
