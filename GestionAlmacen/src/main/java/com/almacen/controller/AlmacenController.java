
package com.almacen.controller;

import com.almacen.model.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que controla la lógica de la aplicación de gestión de almacén.
 * 
 * @author hugot
 */
public class AlmacenController {
    // Lista que almacena los productos.
    private List<Producto>productos;
    
    // Constructor.
    public AlmacenController(){
        // Inicializar la lista de productos.
        productos = new ArrayList<>();
    
    }
    
    // Método para añadir un producto a la lista.
    public void agregarProducto(Producto producto){
        productos.add(producto);
    
    }
    
    // Método para obtener la lista de productos.
    public List<Producto>getProductos(){
        return productos;
    
    }
}
