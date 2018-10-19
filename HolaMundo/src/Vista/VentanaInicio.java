/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mr-r
 */
public class VentanaInicio extends JFrame{
    private JButton boton;
    private JLabel etiqueta;
    private JPanel panel;
    
    
    public VentanaInicio() {
        super("HOLA K ACE");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.iniciaComponentes();
    }

    private void iniciaComponentes() {
        LayoutManager disenio = new GridLayout(1,1);
        
        this.panel=new JPanel(disenio);
        
        this.boton= new JButton("HOLA MUNDO");
        
        this.etiqueta = new JLabel("EL HOLA MUNDO ES DE DIOSES");
        
        this.panel.add(this.etiqueta);
        this.panel.add(this.boton);
        this.add(panel);
        
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public JLabel getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
    
    
}
