/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaInicio;
import Vista.VentanaPuteadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mr-r
 */
public class EventoVentanaInicial implements ActionListener{
    private VentanaInicio ventanaInicio;
    
    public EventoVentanaInicial(VentanaInicio ventanaInicial) {
        this.ventanaInicio = ventanaInicial;
    }

    public VentanaInicio getVentanaInicial() {
        return ventanaInicio;
    }

    public void setVentanaInicial(VentanaInicio ventanaInicial) {
        this.ventanaInicio = ventanaInicial;
    }
    
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(this.ventanaInicio.getBoton())){
                
                VentanaPuteadora vp =new VentanaPuteadora();
                vp.setVisible(true);
            }
            
        
            
        
    }
    
}
