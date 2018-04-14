package web;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import modelo.usuarios;

@WebListener()
public class ContextoUsers implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        List<usuarios> lista=new ArrayList();
        lista.add(new usuarios("Pedro","123"));
        lista.add(new usuarios("Juan","123"));
        lista.add(new usuarios("Diego","123"));
        sce.getServletContext().setAttribute("data", lista);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
