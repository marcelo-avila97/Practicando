/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mr-r
 */
public class VentanaPuteadora extends JFrame{
    private JLabel puteada;
    private JPanel panel;
    
    
    public VentanaPuteadora() {
        super("PUTITO");
        this.setSize(400, 200);      
        this.iniciaComponentes();
        
    }

    private void iniciaComponentes() {
        LayoutManager disenio = new GridLayout(1,1);
        this.panel=new JPanel(disenio);
        this.puteada=new JLabel("SOS UN PUTASO");
        this.panel.add(this.puteada);
        this.add(panel);
    }
    
}
