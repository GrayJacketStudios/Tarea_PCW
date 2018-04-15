<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="modelo.usuarios" %>
<%@page import="modelo.productos" %>


<%@include file="layer/header.jsp" %>
<c:if test="${empty sessionScope.usuarios}">
    Acceso Denegado<br><br>
    <a href="index.jsp">Inicio</a>
</c:if>
<c:if test = "${not empty sessionScope.usuarios}">
    <h6>Bienvenido, ${sessionScope.usuarios.nombre}</h6>
     <div class="outer">
            <div class="row ">
                <div class="col s6 offset-s3 z-depth-3 tarjeta">
                    <%
                    List<productos> LProductos = (List<productos>)getServletContext().getAttribute("dataProductos");
                        
                    for(productos p: LProductos){
                        %>
                        <ul class="collection">
                            <li class="collection-item avatar">
                              <img src="<%=p.getImgUrl()%>" alt="" class="circle">
                              <span class="title"><%=p.getNombre()%></span>
                              <p>$ <%=p.getPrecio()%> CLP<br>
                                 <%=p.getDescripcion()%>
                              </p>
                              <a href="#!" class="secondary-content"><%=p.getIdProducto()%></a>
                            </li>
                        </ul>
                        <div class="item">
                            
                        
                        </div>
                        <%
                    }    
                        
                        
                        
                    %>
                </div>
            </div>
        </div>
    <br>
    
</c:if>
    
<%@include file="layer/footer.jsp" %>