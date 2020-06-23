package boletin19;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Metodos {
    public int[][] crearMatriz(int[][] tabla){
        for (int f=0;f<tabla.length;f++){
            for(int c=0;c<tabla[f].length;c++){
                tabla[f][c]=(int)(Math.random()*(9+1));
            }    
        }
        System.out.println("Array Creado");    
        return tabla;
    }
    public String[] crearJornadas(String[]jornadas){
        for(int i=0;i<jornadas.length;i++){
            jornadas[i]="x"+(i+1);    
        }
        return jornadas;    
    }
    public void enseñar(int[][]tabla){
        for (int f=0;f<tabla.length;f++){
            System.out.println("\n");
        for(int c=0;c<tabla[f].length;c++){
            System.out.print(tabla[f][c]+" ");
            }    
        }
        System.out.println(" ");
    }
    public void enseñarTodo(int[][]tabla,String[]equipos,String[]jornadas){
        System.out.print("\nEquipo/Jornada");
        for(int i=0;i<jornadas.length;i++){
            if(i<10)   
            System.out.print("   "+jornadas[i]);    
            else
            System.out.print("  "+jornadas[i]);      
        }
        for (int f=0;f<tabla.length;f++){
            System.out.print("\n "+equipos[f]);
            System.out.print("    ");
        for(int c=0;c<tabla[f].length;c++){
            System.out.print("  "+tabla[f][c]+"  ");
          }    
        }
        System.out.println("");   
    }
    public void salir(){
        System.exit(0);
    }
    public void ordenarCrecienteArrays(int[][]tabla,String[]equiposOrdenados){
        int[]totalGoles= new int[tabla.length];
        for (int f=0;f<tabla.length;f++){
            for(int c=0;c<tabla[f].length;c++){
            totalGoles[f]=totalGoles[f]+tabla[f][c];  
            }
        }
        int aux;
        String auxEquipo;
        for (int i=0;i<totalGoles.length-1;i++){
            for(int j=i+1;j<equiposOrdenados.length;j++){
                if(totalGoles[i]>totalGoles[j]){
                    aux= totalGoles[i];
                    totalGoles[i]=totalGoles[j];
                    totalGoles[j]= aux;
                    auxEquipo = equiposOrdenados[i];
                    equiposOrdenados[i]=equiposOrdenados[j];
                    equiposOrdenados[j]=auxEquipo;
                }   
            }    
        }
        System.out.println("\n\nTotal de goles marcados en orden ascendoente:");   
        for (int j=0;j<equiposOrdenados.length;j++){
            System.out.println(equiposOrdenados[j]+"  "+totalGoles[j]);    
        }
    }
    public void ordenarEquipos(String[] equipos){
        Arrays.sort(equipos);
    }
    public void maximoGoleadorJornada(int[][]tabla,String[]xornadas,String[]equipos){
        int maximoGoles;
            String equipoMaximo[]=new String[equipos.length];
        for(int i=0;i<tabla[0].length;i++){
            maximoGoles=0;
            for(int j=0;j<tabla.length;j++){
                if(maximoGoles<=tabla[j][i]){
                maximoGoles=tabla[j][i];
                equipoMaximo[j]=equipos[j];
                }
            }
                System.out.println("\nEn la jornada "+(i+1)+" los máximos goleadores fueron (con "+maximoGoles+" goles)" +":");
            for(int k=0;k<tabla.length;k++){
                if(maximoGoles==tabla[k][i]){
                System.out.println(equipoMaximo[k]);
                }
            }
        }
            System.out.println(" ");
    }
    public void maximosGoleadores(int[][]tabla,String[]jornadas,String[]equipos){
        int maximoGoles=0;
        for(int i=0;i<jornadas.length;i++){
            for(int j=0;j<tabla.length;j++){
                if(maximoGoles<=tabla[j][i]){
                maximoGoles=tabla[j][i];
                }
            }

        }
        System.out.println("Los máximos goleadores fueron:");
        for (int x=0;x<tabla[0].length;x++) {
            for (int y=0;y<tabla.length;y++) {
                if (tabla[y][x]==maximoGoles){
                    System.out.println(equipos[y]+" en la "+jornadas[x]);
                }    
            }
        }
    }

    public void consultarGoles(int[][]tabla,String[]jornada,String[]equipos){
    String equipoBuscar= JOptionPane.showInputDialog("Introduce el equipo que quieras buscar(ALV,ATH,ATM...):");
    String jornadaBuscar= JOptionPane.showInputDialog("Introduce la jornada que quieras buscar(x1,x2,x3...):");
    int auxEquipo=0,auxJornada=0;
    int i,j;
    for (i = 0; i <equipos.length ; i++) {
        if(equipos[i].equals(equipoBuscar)){
        auxEquipo=i;   
        } 
    }
    for (j = 0; j <jornada.length; j++) {
        if(jornada[j].equals(jornadaBuscar)){
        auxJornada=j;    
        }    
    }
        System.out.println("El "+equipos[auxEquipo]+" en la "+jornada[auxJornada]+" marcó "+tabla[auxEquipo][auxJornada]+" goles");
    }
}
