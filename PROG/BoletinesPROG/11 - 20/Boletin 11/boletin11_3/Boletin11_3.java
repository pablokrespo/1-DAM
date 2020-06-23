package boletin11_3;
public class Boletin11_3 {
public static void main(String[] args) {
        Fecha a=new Date();
        a.setAno(2020);
        a.setMes(12);
        a.setDia(31);
        System.out.println("Dia "+a.getDia()+"\nMes "+a.getMes()+"\nAno "+a.getAno());
    }    
}
