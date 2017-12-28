<%-- 
    Document   : modificar
    Created on : 27/12/2017, 11:45:30 PM
    Author     : fernanda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Alumno</title>
    </head>
    <body>
        <form action="ServletAlumno" method="get">
            <input type="text" name="id">
            <input type="text" name="nombre">
            <input type="text" name="paterno">
            <input type="text" name="idCarrera">
            <input type="submit" value="Actualizar">
        </form>
    </body>
</html>
