<%-- 
    Document   : modificar
    Created on : 27/12/2017, 11:45:30 PM
    Author     : fernanda
--%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <title>Modificar Alumno</title>
    </head>
    <body>
        <fieldset>
        <form action="AlumnoService?operacion=Mostrar" method="get">
            <input type="text" name="id"value=" <c:out value="${alumno.id}"/>"/>
            <input type="text" name="nombre" value="<c:out value="${alumno.nombre}"/>"/>
            <input type="text" name="paterno" value="<c:out value="${alumno.paterno}"/>"/>
            <input type="text" name="idCarrera" value="<c:out value="${alumno.idCarrera}"/>"/>
            <input type="submit" value="Actualizar">
        </form>
        </fieldset>
    </body>
</html>
