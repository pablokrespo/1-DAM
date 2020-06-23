package boletin11_2;
public class Boletin11_2 {
    public static void main(String[] args) {
        Media a=new Media();
        a.setNom("texto");
        a.setAutor("pablo");
        a.setDurada(15);
        String n=a.getNom();
        String b=a.getAutor();
        int s=a.getDurada();
        System.out.println("Nome "+n+"\nAutor "+b+"\nDurada "+s);    
    }
}
