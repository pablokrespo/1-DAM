package boletin1_5;
public class Boletin1_5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantas millas queres pasar a metros?");
        float millas = sc.nextFloat();
        System.out.println("Son "+millas*1852+" metros");
