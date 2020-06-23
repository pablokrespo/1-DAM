package ejemploarraysbidimensional;
public class MetodosArraysBidimensional {
    public int [][] crearMatriz(int[][] taboa){
        for(int f=0; f<tabla.length; f++){
            for(int c=0; c<tabla[f].length; c++){
                System.out.println(tabla[f][c]= pedirDatos.pedirInt("Teclea número: "));
            }
            return tabla;
        }
    }
    public void enseñar(int [][]tabla){
        for(int f=0; f<tabla.length; f++){
            for(int c=0; c<tabla[f].length; c++){
                System.out.println(tabla[f][c]= pedirDatos.pedirInt("Teclea número: "));
            }
        }
    }
    public void salir(){
        System.exit(0);
    }
    public void arrayColumnas(int[][]tabla){
        String[]filas= new String[tabla.length];
        for(int i=0; i<filas.length; i++){
            filas[i]= pedirDatos.pedirInt("Nombre filas: ");
        }
        return filas;   
    }
    public void arrayColumnas(int[][]tabla){
        String[]columnas= new String[tabla[0.length];
        for(int i=0; i<columnas.length; i++){
            columnas[i]= pedirDatos.pedirInt("Nombre columnas: ");
        }
        return columnas;
    }
}
