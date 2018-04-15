package modelo;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class utilidad implements IUtilidad {

    @Override
    public usuarios logear(String nombre, String clave, List<usuarios> lista) {
        for(usuarios p:lista){
            if(p.getNombre().equals(nombre) && p.getPass().equals(clave)){
                return p;
            }
        }
        return null;
    }

    @Override
    public usuarios registrar(String nombre, String pass, List<usuarios> listas) {
        usuarios u = new usuarios(nombre,pass);
        listas.add(u);
        return u;
    }

    @Override
    public usuarios chequear(String nombre, List<usuarios> lista) {
        for(usuarios p:lista){
            if(p.getNombre().equals(nombre)){
                return p;
            }
        }
        return null;
    }

    @Override
    public productos ingresar(String nombre, String descripcion, int precio, String url,List<productos> listas) {
        productos p = new productos(nombre, descripcion, precio, url);
        listas.add(p);
        return p;
    }
}