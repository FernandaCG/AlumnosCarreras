package com.ipn.escom.wad.util;

import com.ipn.escom.wad.conexion.ConnectionManager;
import com.ipn.escom.wad.dao.AlumnoDAOImpl;
import com.ipn.escom.wad.dao.UsuarioDAOImpl;
import com.ipn.escom.wad.model.Alumno;
import com.ipn.escom.wad.model.Usuario;
import java.util.List;

/**
 *
 * @author fernanda
 */
public class Prueba {

    public static void main(String[] args) {
        ConnectionManager conn = new ConnectionManager();
        Alumno entity = new Alumno();
        AlumnoDAOImpl alumnoDAOImpl = new AlumnoDAOImpl();
        UsuarioDAOImpl usuarioDAOImpl = new UsuarioDAOImpl();
        
        ConnectionManager connectionManager = new ConnectionManager();
        connectionManager.connect();
        
    }
}
