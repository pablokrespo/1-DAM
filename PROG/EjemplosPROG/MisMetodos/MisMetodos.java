import java.util.Scanner;
public class MisMetodos {

//Valida float positivo
    public static float validarFloatPositivo(){
        Scanner sc= new Scanner(System.in);
    float valor;
    do{
        float valor= sc.nextFloat();
        return valor; //o también: return sc.nextFloat();
    }
    while(valor<=0);
    }
}
