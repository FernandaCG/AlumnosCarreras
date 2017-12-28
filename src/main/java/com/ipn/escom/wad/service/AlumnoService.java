package com.ipn.escom.wad.service;

import com.ipn.escom.wad.dao.AlumnoDAO;
import com.ipn.escom.wad.dao.AlumnoDAOImpl;
import java.io.IOException;
import java.sql.SQLException;
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
    AlumnoDAOImpl alumnoDAOImpl = new AlumnoDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String operacion=request.getParameter("operacion");
        int parametro = Integer.parseInt(request.getParameter("id"));

        switch (operacion) {
            case "Mostrar":
                request.setAttribute("lista", alumnoDAOImpl.readAll());
                RequestDispatcher view = getServletContext().getRequestDispatcher("/gestionAlumno/index.jsp");
                view.forward(request, response);
                break;
            case "Actualizar":

                break;
            case "Eliminar":
                AlumnoDAOImpl alumno = new AlumnoDAOImpl();
                alumno.delete(parametro);
                response.sendRedirect("AlumnoService?operacion=Mostrar&id=0");
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
