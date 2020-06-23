package tarea.pkg1;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
public class Componentes {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    JLabel etiqueta1, etiqueta2;
    JTextField texto1, texto2;
    JTextArea area;
    
    public Componentes(){
        marco= new JFrame(" COMPONENTES ");
        panel= new JPanel();
        etiqueta1= new JLabel();
        etiqueta2= new JLabel();
        texto1= new JTextField();
        texto2= new JTextField();
        boton1= new JButton(" LIMPIAR ");
        boton2= new JButton(" PRIMERO ");
        area= new JTextArea(" AREA DE TEXTO ");
        
        marco.setSize(800, 500);
        panel.setSize(800, 500);
        etiqueta1.setText(" NOMBRE ");
        texto1.setSize(200, 200);
        texto1.setText("       ");
        etiqueta2.setText(" PASSWORD ");
        texto2.setSize(200, 200);
        texto2.setText("       ");
        area.setSize(200, 500);
         
        panel.add(etiqueta1);
        panel.add(texto1);
        panel.add(etiqueta2);
        panel.add(texto2);
        panel.add(area);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
