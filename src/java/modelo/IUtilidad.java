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
    usuarios logear(String nombre, String pass, List<usuarios> lista);
}
