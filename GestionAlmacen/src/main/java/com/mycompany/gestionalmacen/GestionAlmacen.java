package com.mycompany.gestionalmacen;

import com.almacen.view.AlmacenView;
import javax.swing.SwingUtilities;

/**
 * Clase principal que inicia la aplicación de gestión de almacén.
 *
 * @author hugot
 */
public class GestionAlmacen {

    public static void main(String[] args) {
        // Ejecutar la GUI en el hilo de eventos de Swing.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crear un instancia de la vista principal de la aplicación.
                AlmacenView view = new AlmacenView();

                // Hacer visible la vista principal.
                view.setVisible(true);
            }
        });

    }
}
