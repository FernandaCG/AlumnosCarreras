package com.ipn.escom.wad.service;

import com.ipn.escom.wad.dao.AlumnoDAOImpl;
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
 * @author Erick
 */
@WebServlet(name = "AlumnoService", urlPatterns = {"/AlumnoService"})
public class AlumnoService extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    final static Logger log = Logger.getLogger(LoginService.class);

    AlumnoDAOImpl alumnoDAOImpl = new AlumnoDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("listaAlumnos", alumnoDAOImpl.readAll());
        System.out.println(alumnoDAOImpl.readAll());
        RequestDispatcher view = getServletContext().getRequestDispatcher("/gestionAlumno/");
        view.forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
