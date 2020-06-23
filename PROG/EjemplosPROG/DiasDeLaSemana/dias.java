package dias_de_la_semana;
import java.util.Scanner;
class dias {
    Scanner sc= new Scanner(System.in);
    public void diaConSwitch(int dia){
        switch(dia){
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
        }
    }
}
