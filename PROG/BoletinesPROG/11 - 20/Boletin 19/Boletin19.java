package boletin19;
import javax.swing.JOptionPane;
public class Boletin19 {
public static void main(String[] args) {
    int[][]goles=new int[20][36];
    Metodos objeto= new Metodos();
    String[]equipos={"VCF","ATM","MLL","ALV","BAR","GTF","VIL","LUD","GRA","VLL","SFC","ESP","LEG","RBB",
    "EIB","RSO","ATH","OSA","RMA","CEL"};
    objeto.ordenarEquipos(equipos);
    String[]equiposOrdenados={"VCF","ATM","MLL","ALV","BAR","GTF","VIL","LUD","GRA","VLL","SFC","ESP","LEG","RBB",
    "EIB","RSO","ATH","OSA","RMA","CEL"};
    String[]jornadas=new String[36];
    jornadas=objeto.crearJornadas(jornadas);

    int opcion;
    do{
    opcion = Integer.parseInt(JOptionPane.showInputDialog("***** MENU *****"
            + "\n1--> Crear matriz"
            + "\n2--> Enseñar goles"
            + "\n3--> Enseñar todo"
            + "\n4--> Enseñar equipos ordeados por goles totales"
            + "\n5--> Enseñar máximos goleadores por jornada"
            + "\n6--> Enseñar maximos goleadores"
            + "\n7--> Búsqueda por equipo/jugador"
            + "\n8--> Salir"
            + "\n Teclea la opción"));
    switch(opcion){
        case 1: goles= objeto.crearMatriz(goles);
        break;
        case 2: objeto.enseñar(goles);
        break;
        case 3: objeto.enseñarTodo(goles,equipos,jornadas);
        break;
        case 4: objeto.ordenarCrecienteArrays(goles,equiposOrdenados);
        break;
        case 5: objeto.maximoGoleadorJornada(goles, jornadas, equipos);
        break;
        case 6: objeto.maximosGoleadores(goles, jornadas, equipos);
        break;
        case 7: objeto.consultarGoles(goles, jornadas, equipos);
        break;
        case 8: objeto.salir();
    }
    }while(opcion<8);  
}
}
