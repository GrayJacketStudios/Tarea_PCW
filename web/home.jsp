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
                <div class="col s8 offset-s2 z-depth-3 tarjeta">
                    <h3>Titulo de la pagina</h3>
                    Bienvenido a <<'Nombre de tienda generico'>>, donde podras encontrar relojes de todo tipo y otros productos.
                    <br>
                    Puedes ver nuestro stock de productos a travez de este <a href="productos.jsp">enlace</a> o desde el menu.
                </div>
            </div>
        </div>
    <br>
    
</c:if>
    
<%@include file="layer/footer.jsp" %>