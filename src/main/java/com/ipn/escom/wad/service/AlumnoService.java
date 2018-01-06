package com.ipn.escom.wad.service;

import com.ipn.escom.wad.dao.AlumnoDAOImpl;
import com.ipn.escom.wad.model.Alumno;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

/**
 *
 * @author fernanda
 */
@WebServlet(name = "AlumnoService", urlPatterns = {"/AlumnoService"})
public class AlumnoService extends HttpServlet {

    private static final long serialVersionUID = 1L;
    final static Logger log = Logger.getLogger(LoginService.class);

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AlumnoDAOImpl alumnoDAOImpl = new AlumnoDAOImpl();
        String operacion = request.getParameter("operacion");

        if (request.getParameter("id") == null || request.getParameter("id").isEmpty()) {
            switch (operacion) {
                case "Mostrar":
                    request.setAttribute("lista", alumnoDAOImpl.readAll());
                    RequestDispatcher view = getServletContext().getRequestDispatcher("/gestionAlumno/index.jsp");
                    view.forward(request, response);
                    break;
                case "Guardar":
                    Alumno alumno = new Alumno();
                    alumno.setId(0);
                    alumno.setNombre(request.getParameter("nombre"));
                    alumno.setPaterno(request.getParameter("paterno"));
                    alumno.setIdCarrera(Integer.parseInt(request.getParameter("idCarrera")));
                    System.out.println(alumno);
                    alumnoDAOImpl.create(alumno);
                    response.sendRedirect("AlumnoService?operacion=Mostrar");
                    break;
                case "Agregar":
                    RequestDispatcher vista = request.getRequestDispatcher("gestionAlumno/modificar.jsp");
                    vista.forward(request, response);
                    break;
            }
        } else {
            int id = Integer.parseInt(request.getParameter("id"));
            switch (operacion) {
                case "Actualizar":
                    request.setAttribute("alumno", alumnoDAOImpl.readById(id));
                    RequestDispatcher vista = request.getRequestDispatcher("gestionAlumno/modificar.jsp");
                    vista.forward(request, response);
                    break;
                case "Eliminar":
                    alumnoDAOImpl.delete(id);
                    response.sendRedirect("AlumnoService?operacion=Mostrar");
                    break;
                case "Guardar":
                    Alumno alumno = new Alumno();
                    alumno.setId(id);
                    alumno.setNombre(request.getParameter("nombre"));
                    alumno.setPaterno(request.getParameter("paterno"));
                    alumno.setIdCarrera(Integer.parseInt(request.getParameter("idCarrera")));
                    alumnoDAOImpl.update(alumno);
                    response.sendRedirect("AlumnoService?operacion=Mostrar");
                    break;
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
