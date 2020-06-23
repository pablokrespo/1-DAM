package figura2_1;
public class Piramide {
public void Piramide() {
    int numFilas= 5;
    int altura;
    int blanco;
    int asterisco;

    for (altura= 1; altura <= numFilas; altura++) {
        for (blanco= 1; blanco <= numFilas - altura; blanco++) {
            System.out.print(" ");
        }
        for (asterisco= 1; asterisco <= (altura * 2) - 1; asterisco++) {
            System.out.print("*");
        }
            System.out.println();
    }
}
}    

