package web;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import modelo.productos;

@WebListener()
public class ContextoProductos implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        List<productos> lista=new ArrayList();
        lista.add(new productos("Reloj Storm London Tuscany XL Slate 47208/SL","Reloj Storm London Tuscany XL Slate 47208/SL para hombre. Tipo de display analógico con movimiento de cuarzo. Tiene una esfera de color negro y una correa de color negro. Material de la caja acero inoxidable y correa de acero inoxidable. cierre con pulsador. Tamaño aproximado de la esfera 43 mm. Resistencia al agua 50 m ",120000,"https://www.todo-relojes.com/fotos/Sin%20t%C3%ADtulo-3(3).jpg"));
        lista.add(new productos("Reloj Guess Collection Mini Chic Ceramic Mujer X70012L2S","Reloj Guess Collection Mini Chic Ceramic Mujer X70012L2S con caja de acero y correa de ceramica con cristal zafiro y movimiento de cuarzo.",190000,"https://www.todo-relojes.com/fotos/982b4508-9695-4526-b9c2-34aaaaf4fdd7.jpg"));
        lista.add(new productos("Reloj Adidas Questra unisex ADP3269"," Reloj Adidas Questra unisex ADP3269\n" +
            "reloj ideal para mujer o cadete\n" +
            "Con un diseño clásico de Adidas es ideal para practicar cualquier deporte ",30000,"https://www.todo-relojes.com/fotos/ADP3269(1).jpg"));
        lista.add(new productos("Reloj Chronotech Active Next caballero RW0034","Reloj de caballero\n" +
            "correa de caucho con cierre de hebilla\n" +
            "caja de acero y policarbonato\n" +
            "agujas e indices luminiscentes\n" +
            "cronografo\n" +
            "resistente al agua 50m\n" +
            "tamaño de 43 mm de caja\n" +
            "moviminento de cuarzo\n" +
            "\n" +
            "2 años de garantia ",80000,"https://www.todo-relojes.com/fotos/RW0034.jpg"));
        lista.add(new productos("Reloj Festina coleccion Extra Mujer F20259/2","Reloj FESTINA F20259/2",110000,"https://www.todo-relojes.com/fotos/F20259-2.jpg"));
        lista.add(new productos("Reloj Marea Hombre Dual Time B54097/2","reloj Marea Hombre Dual Time B54097/1.\n" +
            "reloj para hombre analógico de tres agujas con doble uso horario con un movimiento de cuarzo\n" +
            "La caja de metal y un cristal mineral ",28000,"https://www.todo-relojes.com/fotos/b45097-2.jpg"));
        lista.add(new productos("Reloj Marea Infantil Comunión B35284-3","Reloj Marea B35284-3 para niña. Tipo de display analógico con movimiento de cuarzo. Tiene una esfera de color blanco y una correa de color morado. Material de la caja metal y correa de piel. Cierre de hebilla. Tamaño aproximado de la esfera 25 mm. Resistencia al agua 30 m .Se envía en un estuche junto a una pulsera .",20000,"https://www.todo-relojes.com/fotos/B35284-3.jpg"));
        lista.add(new productos("Reloj Cluse Mujer CL30010","Reloj Cluse CL30010 para mujer. Tipo de display analógico con movimiento de cuarzo. Tiene una esfera de color blanco y una correa de color dorado. Material de la caja acero inoxidable y correa de acero inoxidable. cierre de gancho. Tamaño aproximado de la esfera 33 mm. Resistencia al agua 30 m ",55000,"https://www.todo-relojes.com/fotos/3e79a180-a7e7-419d-a515-3460caebb6d8.jpg"));
        lista.add(new productos("Reloj Maserati Hombre R8873618005","Reloj Maserati Hombre R8873618005\n" +
            "calendario\n" +
            "cronografo\n" +
            "cja y correa color oro rosa",295000,"https://proxy.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.kechiq.es%2Fsrc%2Fimg%2Fproducts%2Fthumbnail%2Fmaserati-r8873618005-13295.jpeg&f=1"));
        lista.add(new productos("Reloj Armani Exchange Modelo: AX2328 ","Marca ARMANI EXCHANGE Modelo AX2328 Familia o Colección Nico Tamaño de la Caja 44 mm Material del Extensible Acero Color del Extensible Dorado Color de la Caratula Negro Resistencia al Agua 50 m Género Caballero Bisel Acero Edición Línea Cristal Reloj Mineral Estilo de Vida Moda Fijación Mariposa doble Forma Circular Funcionamiento Análogo Detalle de carátula Logotipo de la marca Tipo de reloj Reloj moda Otra Información Limpiar con un paño suave",1470719,"https://i2.linio.com/p/6cd14ee395f393e38e8a8841348500d3-product.jpg"));
        sce.getServletContext().setAttribute("dataProductos", lista);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
