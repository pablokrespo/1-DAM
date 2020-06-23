package boletin.pkg3;
public class Consumo {
    private float kms;
    private float litros;
    private float vMed;
    private float pGas;   
//Constructor pero sin parámetros (por defecto)
    public Consumo(){
    }
//Constructor con parámetros
    public Consumo(float kms,float l,float vMed,float pGas){
    this.kms=kms;
    this.litros=l;
    this.vMed=vMed;
    this.pGas=pGas;
    }
//Visualizar características
    public void visualizar(){
        System.out.println("Kms:" +kms+ "Litros:" +litros+ "vMed:" +vMed+ "pGas:" +pGas);
    }
//setters
    public void setKms(float kms){
    this.kms= kms;}
    public void setLitros(float l){
    this.litros= l;}    
    public void setvMed(float vMed){
    this.vMed= vMed;}   
    public void setpGas(float pGas){
    this.pGas= pGas;} 
//getters
    public float getKms(){
    return kms; }
    public float getLitros(){
    return litros;}
    public float getvMed(){
    return vMed;}
    public float getpGas(){
    return pGas;}
//consumoMedio - consumoEuros 
    public float getTiempo(){
    return (1/this.vMed)*this.kms;}
    public float consumoM(){
    float consumoM= 100*this.litros/this.kms;
    return consumoM; }
    public float consumoE(){
    float consumoE= consumoM()*this.pGas;
    return consumoE; }    
}
