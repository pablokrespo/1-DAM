package segundo_paquete;
public class Personal {
    private int Telefono;
    private String Correo;
    public Personal(int Telefono, String Correo) {
        this.Telefono = Telefono;
        this.Correo = Correo;
    }
    public int getTelefono() {
        return Telefono;
    }
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    @Override
    public String toString() {
        return "Telefono=" + Telefono + ", Correo=" + Correo;
    }    
}
