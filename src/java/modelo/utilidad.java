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
}