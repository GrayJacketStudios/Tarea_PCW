/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Informatica
 */
public interface IUtilidad {
    //Area Usuarios
    usuarios logear(String nombre, String pass, List<usuarios> lista);
    usuarios chequear(String nombre, List<usuarios> lista);
    usuarios registrar(String nombre, String pass, List<usuarios> lista);
    
    //Area Productos
    productos ingresar(String nombre, String descripcion, int precio, String url,List<productos> lista);
}
