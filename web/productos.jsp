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
    <h5 style="font-family: 'futura', bold, sans-serif; color: white;">Bienvenido, ${sessionScope.usuarios.nombre}</h5>
     <div class="outer">
            <div class="row">
                <div class="col s10 offset-s1 z-depth-3 tarjeta">
                    
                    <div >
                    <%
                    List<productos> LProductos = (List<productos>)getServletContext().getAttribute("dataProductos");
                        
                    for(productos p: LProductos){
                        %>
                        
                        
                        
  <div class="card medium s6 m3 col item">
    <div class="card-image waves-effect waves-block waves-light">
      <img class="activator" src="<%=p.getImgUrl()%>">
    </div>
    <div class="card-content">
      <span class="card-title activator grey-text text-darken-4"><%=p.getNombre()%><i class="material-icons right">more_vert</i></span>
      <p>$ <%=p.getPrecio()%> CLP</p>
    </div>
    <div class="card-reveal">
      <span class="card-title grey-text text-darken-4"><%=p.getNombre()%><i class="material-icons right">close</i></span>
      <p>$ <%=p.getPrecio()%> CLP</p>
      <p><%=(p.getDescripcion())%></p>
      <br>
      <p>Id producto: <%=(p.getIdProducto())%></p>
    </div>
  </div>
            
                        
                        
                        
                       
                        <%
                    }    
                        
                        
                        
                    %>
                    </div>
                    
                    
                    
                    
                </div>
            </div>
        </div>
    <br>
    
</c:if>
    
<%@include file="layer/footer.jsp" %>