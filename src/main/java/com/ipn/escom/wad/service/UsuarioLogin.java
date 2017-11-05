package com.ipn.escom.wad.service;

import com.ipn.escom.wad.dao.AlumnoDAOImpl;
import java.io.IOException;
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

    AlumnoDAOImpl alumnoDAOImpl = new AlumnoDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log.info("[INFO] DENTRO DE DOGET");
        System.out.println("[INFO] DENTRO DE DOGET");
        RequestDispatcher view = request.getRequestDispatcher("/AlumnosCarreras/login/index.jsp");
        request.setAttribute("listaAlumnos", alumnoDAOImpl.readAll());
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log.info("[INFO] DENTRO DE DOPOST");
        System.out.println("[INFO] DENTRO DOPOST");

    }

}
