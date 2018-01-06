

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <title>Gestión Alumnos</title>
    </head>
    <body>
        <button type="button"><a href="login/index.jsp">Regresar</a></button>
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

                    <c:forEach items="${lista}" var="alumno">
                        <tr>
                            <td>${alumno.id}</td>
                            <td>${alumno.nombre}</td>
                            <td>${alumno.paterno}</td>
                            <td>${alumno.idCarrera}</td>
                            <td>
                                <a href="AlumnoService?id=${alumno.id}&operacion=Actualizar">
                                    Actualizar
                                </a>
                                <a href="AlumnoService?id=${alumno.id}&operacion=Eliminar">
                                    Eliminar
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                <tbody>
            </table>
            <a href="AlumnoService?operacion=Agregar">
                                    Agregar
                                </a>
        </div>

    </body>
</html>
