/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

/**
 * Cpu object class
 * @author ndiazdossantos
 */
public class Cpu {
/**
 * I declare private attributes type int speed and memory
 */
    private int speed;
    private int memory;
/**
 * Constructor without parameters
 */
    public Cpu() {

    }
/**
 * Constructor with int parameters
 * @param vel unit of measure speed
 * @param mem storage
 */
   public Cpu(int vel, int mem) {
        speed = vel;
        memory = mem;
    }
/**
 * method that returns nothing assigns an int variable called speed
 * @param vel unit of measure speed
 */
    public void setVelocidade(int vel) {
        speed = vel;
    }
/**
 * method that returns an int type called getVelocidade
 * @return variable speed
 */
    public int getVelocidade() {
        return speed;
    }
/**
 * method that returns nothing and sends int type called mem
 * @param mem storage
 */
    public void setMemoria(int mem) {
        memory = mem;
    }
/**
 * method that sends an int called getMemoria
 * @return attribute called memory
 */
    public int getMemoria() {
        return memory;
    }

}
