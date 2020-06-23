package boletin4_4;
public class Cuenta {
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;
    public Cuenta() {
    }
    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombreCliente= nombreCliente;
        this.numeroCuenta= numeroCuenta;
        this.tipoInteres= tipoInteres;
        this.saldo= saldo;
    }
    public void setnombreCliente(String nombreCliente) {
        this.nombreCliente= nombreCliente;
    }
    public String getnombreCliente() {
        return nombreCliente;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta= numeroCuenta;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres= tipoInteres;
    }
    public double getTipoInteres() {
        return tipoInteres;
    }
    public void setSaldo(double saldo) {
        this.saldo= saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void ingreso(double dinero) {
        saldo += dinero;
    }
    public void reintegro(double dinero) {
        saldo -= Math.abs(dinero);
    }
    public void transferencia(Cuenta destinatario, double cantidad) {
        reintegro(cantidad);
        destinatario.setSaldo(destinatario.getSaldo() + cantidad);
    }
    public void amosar() {
        System.out.println("El nombre es:" + nombreCliente + "\n El numero de cuenta es:" + numeroCuenta
                + "\n El tipo de interés es:" + tipoInteres + "\n El saldo existente es:" + saldo);    
}
}