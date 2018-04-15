<%-- 
    Document   : index
    Created on : 13-abr-2018, 22:27:38
    Author     : Informatica
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="layer/header.jsp" %>
    <body>
        
        <c:if test = "${not empty sessionScope.usuarios}">
            <c:redirect url="home.jsp"></c:redirect>
        </c:if>
        
        <div class="outer">
            <div class="row middle">
                <div class="col s6 offset-s3 z-depth-3 tarjeta">
                    <h3>Iniciar sesión</h3>
                    <form action="login.do" method="post">
                        <label>Nombre</label>
                        <input type="text" name="nombre" placeholder="Nombre de usuario..." required/>
                        <br><br>
                        <label>Clave</label>
                        <input type="password" name="pass" placeholder="Contraseña..." required/>
                        <br><br>
                        <center>
                        <button type="sumbit" name="btn" class="waves-effect waves-light btn-small">
                            Iniciar sesión
                        </button>
                        
                        <a href="registro.jsp" class="waves-effect waves-light btn-small left-15">Registrarse</a>
                        </center>
                        <br><br>
                    </form>
                    <p>
                        ${requestScope.msg}
                    </p>
                </div>
            </div>
        </div>
        
    </body>
    <%@include file="layer/footer.jsp" %>
</html>
