package boletin8_3;
import java.util.Scanner;
class Meses {
public int pedirDato(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Escribe el número del mes: ");
    return sc.nextInt();      
}
public String diasMes(){
    int mes= pedirDato();
    int dias= 0;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias= 31;
        }
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dias= 30;
        }
        else if (mes == 2) {
            dias= 28;
        }
        return ("El mes "+mes+" tiene "+dias+" dias");
}
}
