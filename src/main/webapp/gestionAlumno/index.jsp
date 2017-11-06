<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <title>Gestión Alumnos</title>
    </head>
    <body>
        <div class="container">
            <table class ="table table-striped">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Nombre</th>
                        <th>Apellido Paterno</th>
                        <th>Carrera</th>
                        <th>Servicios</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaAlumnos}" var="alumno">
                        <tr>
                            <td><c:out value="${alumno.id}"></c:out></td>
                            <td><c:out value="${alumno.nombre}"></c:out></td>
                            <td><c:out value="${alumno.paterno}"></c:out></td>
                            <td><c:out value="${alumno.idCarrera}"></c:out></td>
                            </tr>
                    </c:forEach>
                <tbody>
            </table>
        </div>
    </body>
</html>
