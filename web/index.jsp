<%-- 
    Document   : index
    Created on : 13-abr-2018, 22:27:38
    Author     : Informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="layer/header.jsp" %>
    <body>
        
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
        
        <!--JavaScript at end of body for optimized loading, y cargandolo  como hosted library como buena practica.-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>
    </body>
    <%@include file="layer/footer.jsp" %>
</html>
