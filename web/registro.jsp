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
        
        
        <script language="javascript" type="text/javascript">
        function compruebaPass()
        {
            var validationElement = document.getElementById('alerta');
            // Get the form values
            var pass1 = document.forms["registro"]["pass"].value;
            var pass2 = document.forms["registro"]["pass2"].value;
            if (pass1 !== pass2) {
                validationElement.innerHTML = "Las contraseñas deben coincidir";
                document.getElementById('submitBtn').disabled=1;
            }
            if (pass1 == pass2) {
                validationElement.innerHTML = "";
                document.getElementById('submitBtn').disabled=0;
            }
            return;
        }
        </script>
        
        <div class="outer">
            <div class="row middle">
                <div class="col s6 offset-s3 z-depth-3 tarjeta">
                    <h3>Registro de usuario</h3>
                    <form name="registro" action="registro.do" method="post">
                        <label>Nombre</label>
                        <input type="text" name="nombre" placeholder="Nombre de usuario..." required/>
                        <br><br>
                        <label>Clave</label>
                        <input 
                            type="password" 
                            name="pass" 
                            placeholder="Contraseña..." 
                            pattern=".{4,}"
                            title="Minimo 4 caracteres"
                            onkeyup="compruebaPass()"
                            required/>
                        <label>Repetir Clave</label>
                        <input 
                            type="password" 
                            name="pass2" 
                            placeholder="Contraseña..."
                            onkeyup="compruebaPass()"
                            required/>
                        <p id="alerta"></p>
                        <br><br>
                        <center>
                        <button disabled id="submitBtn" type="sumbit" name="btn" class="waves-effect waves-light btn-small">
                            Registrarse
                        </button>
                        
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
