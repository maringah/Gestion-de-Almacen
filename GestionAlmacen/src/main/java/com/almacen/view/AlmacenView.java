
package com.almacen.view;

import java.awt.*;
import javax.swing.*;

/**
 * Clase que representa la ventana principal de la aplicación de gestión de almacén.
 * 
 * @author hugot
 */

public class AlmacenView extends JFrame {
    public AlmacenView(){
        // Establecer el nombre de la ventana.
        setTitle("Gestión de Almacén");
        
        // Configurar el tamaño de la ventana.
        setSize(800, 600);
        
        // Configurar el comportamiento del cierre de ventana.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Establecer el layout().
        setLayout(new BorderLayout());
        
        // Crear un label de bienvenida y añadirlo al frame.
        JLabel label = new JLabel("Bienvenido a la gestión de almacén", JLabel.CENTER);
        add(label, BorderLayout.NORTH);
        
    
    }
    
}
