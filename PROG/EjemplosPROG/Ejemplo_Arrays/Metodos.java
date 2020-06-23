package ejemplo_arrays;
public class Metodos {
int[] numeros= new int[6];
    public void crearArray(){
        for(int i=0; i<numeros.length; i++){
            numeros[i]= pedirDatos.pedirInt();
        }
    }
    public void enseñar() {
        for(int i=0; i<numeros.length; i++)
            System.out.println(numeros[i]);
    }
//recibimos el Array como parámetro
    public void visualizar(int[] numeros){
        for (int i=0; i<numeros.length; i++)
            System.out.println("Segundo "+numeros[i]);
    }
    public int[] llenarArray(int[] numeros){
        for(int i=0; i<numeros.length; i++)
            numeros[i]= pedirDatos.pedirInt();
        return numeros;
    }
    public int buscarElemento(int []numeros, int elemento){
        int encontrado= 0; //no está
        int indice= 0;
        for(int i= 0; <lista.length; i++){
            if(numeros[i]== elemento){
                indice= 1;
                encontrado= 1;
            }
        }
        if(encontrado== 0){
            System.out.println(elemento +"No está en la lista");
            return -1;
        }
        else {
            System.out.println(elemento +"Está en la lista");
            return indice;
        }
    }
    public void borrar(int[]lista, int elemento){
        int encontrado= buscarElemento
    }
}
