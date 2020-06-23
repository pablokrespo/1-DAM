package ejemplo_arraylistobjetos;
public class Jugador implements Comparable{
        String nombre;   
        int dorsal;
    public Jugador(){
    }
    public Jugador(String nombre, int dorsal){
        this.nombre= nombre;
        this.dorsal= dorsal;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public int getDorsal(){
        return dorsal;
    }
    public void setDorsal(int dorsal){
        this.dorsal= dorsal;
    }

    @Override
        public String toString() {
            return super.toString(); //To change body of generated methods, choose Tools | Templates.
        }

    public int compareTo(Jugador T){
        if(this.dorsal < T.dorsal)
            return -1;
        else if (this.dorsal > T.dorsal)
            return 1;
        else 
           return 0;
    }
}
