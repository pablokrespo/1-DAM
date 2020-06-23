package ejemplocondiciones;
public class EjemploCondiciones {
    public static void main(String[] args) {
       Condicional objeto1=new Condicional();
       int ed;
       ed= objeto1.pedirInt();
       objeto1.entrar(ed);
       String respuesta= objeto1.permiso(ed);
       System.out.println(respuesta);
     
    }
}
