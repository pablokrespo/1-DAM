package boletin6_6;
import javax.swing.JOptionPane;
public class Boletin6_6 {
public static void main(String[] args) {
    int ventas;
        String artigo;
        ventas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca as ventas anuais:"));
        if(ventas > 1000){
        artigo = "primeira necesidade";
            } else if(ventas > 500 && ventas <= 1000){
            artigo = "alto";
                } else if(ventas > 100 && ventas <= 500){
                artigo = "medio";
                    } else{
                    artigo = "baixo";
        } JOptionPane.showMessageDialog(null, "O artigo de consumo é de tipo " + artigo);
}}
