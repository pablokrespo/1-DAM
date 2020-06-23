package boletin4_4;
public class Boletin4_4 {
    public static void main(String[] args) {
        Cuenta Cuenta1 = new Cuenta("Pablo", "0001", 1.5, 1000);
        Cuenta1.amosar();
        Cuenta1.ingreso(250);
        System.out.println("Saldo despues del ingreso: " + Cuenta1.getSaldo());
        Cuenta1.reintegro(100);
        System.out.println("Saldo despues del reintegro: " + Cuenta1.getSaldo());

        Cuenta Cuenta2 = new Cuenta("Alex", "0002", 1.5, 500);
        System.out.println("Saldo de la Cuenta1: " + Cuenta1.getSaldo() + "\n Saldo de la Cuenta2: " + Cuenta2.getSaldo());
        Cuenta1.transferencia(Cuenta2, 200);
        System.out.println("Saldo de la cuenta1 despues de la transferencia: " + Cuenta1.getSaldo()
                + "\n Saldo de la cuenta2 despues de la transferencia: " + Cuenta2.getSaldo());
    }
}
