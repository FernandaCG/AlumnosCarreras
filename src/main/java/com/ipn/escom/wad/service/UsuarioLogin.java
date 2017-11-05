package com.ipn.escom.wad.service;

import com.ipn.escom.wad.dao.AlumnoDAOImpl;
import com.ipn.escom.wad.model.Alumno;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

/**
 *
 * @author fernanda
 */
public class UsuarioLogin extends HttpServlet {

    final static Logger log = Logger.getLogger(UsuarioLogin.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        log.info("[INFO] DENTRO DE DOGET");
        System.out.println("[INFO] DENTRO DE DOGET");
        AlumnoDAOImpl alumnoDAOImpl = new AlumnoDAOImpl();

        // RequestDispatcher view = request.getRequestDispatcher("/AlumnosCarreras/login/index.jsp");
        //request.getRequestDispatcher("../login/index.jsp").forward(request, response);
        //view.forward(request, response);
        /*request.setAttribute("listaAlumnos", alumnoDAOImpl.readAll());
        RequestDispatcher despachador = request.getRequestDispatcher("../login/index.jsp");
        despachador.forward(request, response);*/
        List<Alumno> alumnos = alumnoDAOImpl.readAll();
        request.setAttribute("listaAlumnos", alumnos);
        request.getRequestDispatcher("../login/index.jsp").forward(request, response);
        //RequestDispatcher view = getServletContext().getRequestDispatcher("/AlumnosCarreras/login/index.jsp");  
        //view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log.info("[INFO] DENTRO DE DOPOST");
        System.out.println("[INFO] DENTRO DOPOST");
        AlumnoDAOImpl alumnoDAO = new AlumnoDAOImpl();
//       request.setAttribute("listaAlumnos", alumnoDAO.readAll());
//        RequestDispatcher despachador = request.getRequestDispatcher("/AlumnosCarreras/login/index.jsp");
//        despachador.forward(request, response);
        List<Alumno> alumnos= alumnoDAO.readAll();
        request.setAttribute("listaAlumnos", alumnos);
        RequestDispatcher view = request.getRequestDispatcher("/AlumnosCarreras/login/index.jsp");
        view.forward(request, response);
    }
}
