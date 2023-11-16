package temporizador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class action implements ActionListener{
 
    public void actionPerformed(ActionEvent accion){

        Date horaactual = new Date();
        
        System.out.println("Se imprimira la hora cada 10 segundos: " + horaactual);
        
    }
}
