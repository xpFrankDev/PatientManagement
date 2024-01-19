/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class RestarFechas {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
     Date fechaInicial;
     Date fechaFinal;
     int dias;
    public int RestarFechas(String fInicial, String fFinal){
        
        try {
            dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            fechaInicial=dateFormat.parse(fInicial);
            fechaFinal = dateFormat.parse(fFinal);
            dias =(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
            
        } catch (ParseException ex) {
            Logger.getLogger(RestarFechas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return dias;
    }
}
