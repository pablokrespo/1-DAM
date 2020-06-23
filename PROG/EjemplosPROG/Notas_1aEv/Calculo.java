package notas_1ev;
import javax.swing.JOptionPane;
class Calculo {
private String nome; 
private float teo1,teo2,pract;
private int nFinal;
    
public boolean pruebaNombre (){
    if ("fin".equals(nome))
        return true;
        else return false;
}
    
public float pideNota (){
    float nota=Float.parseFloat(JOptionPane.showInputDialog("Nota:"));
    while (nota<0){
        JOptionPane.showMessageDialog(null, "Nota con formato erroneo");
        nota=Float.parseFloat(JOptionPane.showInputDialog("Nota:"));
    }
    return nota;
}

public int boletines (){
    float bole=Float.parseFloat(JOptionPane.showInputDialog("Numero de boletines entregados (0-19):"));
    while (bole<0||bole>19){
        JOptionPane.showMessageDialog(null, "Dato erroneo intentelo de nuevo");
        bole=Float.parseFloat(JOptionPane.showInputDialog("Numero de boletines entregados (0-19):"));
    }
    if ((bole*100/19)>=90) return 2;
    else if ((bole*100/19)>=70&&(bole*100/19)<90) return 1;
    else return 0;
}
    
public int operaDatos(){
    JOptionPane.showMessageDialog(null, "Introduzca nota del 1er examen teorico");
        teo1=pideNota();
    JOptionPane.showMessageDialog(null, "Introduzca nota del 2do examen teorico");
        teo2=pideNota();
    JOptionPane.showMessageDialog(null, "Introduzca nota del examen práctico");
        pract = pideNota();
    JOptionPane.showMessageDialog(null, "Número de boletines echo?");
    float media = (teo1+teo2)/2;
    return nFinal=(int) (media*0.4+pract*0.4+boletines());
}
    
public void cargaDatos(){
    nome=(JOptionPane.showInputDialog("Nombre del alumno?"));
    while (pruebaNombre()==false){
        System.out.println("Alumno: "+nome+" Nota final: "+operaDatos());
        nome=(JOptionPane.showInputDialog("Nombre del alumno?"));
    }    
}
}}