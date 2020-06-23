package boletin4_1;
class Coche {
    private int velocidad;
    public Coche(){
    velocidad= 10;}
    public int getVelocidad(){
    return this.velocidad;}
    public void acelerar(int a){
    this.velocidad= this.velocidad + a;}
    public void frenar(int f){
    this.velocidad= velocidad - f;}    
}
