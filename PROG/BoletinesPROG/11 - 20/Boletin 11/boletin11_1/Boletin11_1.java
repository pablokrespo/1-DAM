package boletin11_1;
public class Boletin11_1 {
public static void main(String[] args) {
        Clase a=  new Clase () ;
        Clase b=  new Clase (20) ;
        Clase c=  new Clase (20,40) ; 
    System.out.println ("El objeto A contiene: "  + a.getPrimario () + "," + a.getSecundario());
    System.out.println ("El objeto B contiene: "  + b.getPrimario () + "," + b.getSecundario());
    System.out.println ("El objeto C contiene: "  + c.getPrimario () + "," + c.getSecundario());
    }    
}
