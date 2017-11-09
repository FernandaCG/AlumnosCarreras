package com.ipn.escom.wad.service;

import com.ipn.escom.wad.dao.UsuarioDAOImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import com.ipn.escom.wad.model.Usuario;

/**
 *
 * @author fernanda
 */
@WebServlet("/")
public class LoginService extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    final static Logger log = Logger.getLogger(LoginService.class);

    Usuario usuario;
    UsuarioDAOImpl usuarioDAOImpl;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        usuarioDAOImpl = new UsuarioDAOImpl();
        usuario = usuarioDAOImpl.readValidUsers(email, password);

        if (usuario != null) {
            switch (usuario.getRol()) {
                case "admin":
                    response.sendRedirect("../AlumnoService");
                    break;

                default:
                    response.sendRedirect("../home/index.jsp");
                    break;
            }
        } else {
            response.sendRedirect("../home/index.jsp");
        }
    }

}
