/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.IUtilidad;
import modelo.productos;

/**
 *
 * @author sebastian
 */
@WebServlet(name = "añadirProducto", urlPatterns = {"/nProducto.do"})
public class añadirProducto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     @Inject
    private IUtilidad utilidad;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String nombre = request.getParameter("producto");
                String descripcion = request.getParameter("descripcion");
                int precio = Integer.parseInt(request.getParameter("precio"));
                String url = request.getParameter("urlImg");
                
                
                if(nombre == null || descripcion == null || precio <= 90 ||  url == null){
                    request.setAttribute("msg", "Favor rellenar los datos correctamente.");
                    request.getRequestDispatcher("nProductos.jsp").forward(request, response);
                }
                
                List<productos> lista = (List<productos>)getServletContext().getAttribute("dataProductos");
                productos personaOk = null;
                
                personaOk = utilidad.ingresar(nombre, descripcion, precio, url, lista);
                
                response.sendRedirect("productos.jsp");
                
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
