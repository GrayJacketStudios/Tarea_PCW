/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Informatica
 */
public class productos {
    protected int idProducto;
    protected String nombre;
    protected String descripcion;
    protected int precio;
    
    private static final AtomicInteger count = new AtomicInteger(0); 

    public productos(String nombre, String descripcion, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.idProducto = count.incrementAndGet();
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
