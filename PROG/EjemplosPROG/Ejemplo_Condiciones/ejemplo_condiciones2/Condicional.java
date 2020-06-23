package ejemplocondiciones;
public class Condicional {
private int edad;
public Condicional() {
}
        public Condicional (int edad) {
            this.edad= edad;
        }
        public void setEdad(int edad) {
            this.edad= edad;
        }    
        public int getEdad(){
            return edad;
        }
@Override
        public String toString(){
            return ("Edad: "+edad);
        }
        public void entrar(int edadn){
            if(edadn >=18) {
                System.out.println("Puedes entrar");
            } else {
                System.out.println("No puedes entrar");
            }
        }
}