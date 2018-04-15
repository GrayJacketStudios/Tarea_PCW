<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="modelo.usuarios" %>

<%@include file="layer/header.jsp" %>
<c:if test="${empty sessionScope.usuarios}">
    Acceso Denegado<br><br>
    <a href="index.jsp">Inicio</a>
</c:if>
<c:if test = "${not empty sessionScope.usuarios}">
    <h5 style="font-family: 'futura', bold, sans-serif; color: white;">Bienvenido, ${sessionScope.usuarios.nombre}</h5>

     <div class="outer">
            <div class="row middle">
                <div class="col s6 offset-s3 z-depth-3 tarjeta">
                    <h5>A�adir producto</h5>
                    <form action="nProducto.do" method="post">
                        <label>Nombre</label>
                        <input type="text" name="producto" placeholder="Nombre del producto..." required/>
                        <br><br>
                        <label>Precio</label>
                        <input type="number" name="precio" placeholder="Precio..." required/>
                        <br><br>
                        <label>Url de imagen</label>
                        <input type="text" name="urlImg" placeholder="Url..." required/>
                        <br><br>
                        <label>Descripci�n</label>
                        <textarea 
                            name="descripcion" 
                            placeholder="A�adir una descripci�n del producto"
                            rows="9"
                            required
                            ></textarea>
                        <center>
                        <button type="sumbit" name="btn" class="waves-effect waves-light btn-small">
                            Insertar producto
                        </button>
                        
                            <input type="reset" class="waves-effect waves-light btn-small left-15" value="Eliminar informaci�n"/>
                        </center>
                        <br><br>
                    </form>
                </div>
            </div>
        </div>
    <br>
    
</c:if>
    
<%@include file="layer/footer.jsp" %>