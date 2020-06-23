package boletin11_1;
class Clase {
private int valorPrimario;
    private int valorSecundario;

    public Clase() {
        valorPrimario= 5;
        valorSecundario= 10;
    }

    public Clase(int valp) {
        valorPrimario= valp;
        valorSecundario= 10;
    }    
    
    public Clase(int valp, int vals) {
        valorPrimario= valp;
        valorSecundario= vals;
    }
    
    public int getPrimario(){
        return valorPrimario;
    }
    
    public int getSecundario(){
        return valorSecundario;
    }
}
