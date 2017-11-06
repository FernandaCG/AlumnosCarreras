package com.ipn.escom.wad.util;

import com.ipn.escom.wad.conexion.ConnectionManager;
import com.ipn.escom.wad.dao.AlumnoDAOImpl;
import com.ipn.escom.wad.dao.UsuarioDAOImpl;
import com.ipn.escom.wad.model.Alumno;
import com.ipn.escom.wad.model.Usuario;

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
//        
//        UsuarioDAOImpl usuario = new UsuarioDAOImpl();
//        System.out.println(usuario.readById(1));

//        //createAlumno
//        entity.setId(7);
//        entity.setNombre("Cesar11");
//        entity.setPaterno("Hernandez");
//        entity.setIdCarrera(1);
//        alumnoDAOImpl.create(entity);
//
//        //selectAll
//        List<Alumno> alumnos = alumnoDAOImpl.readAll();
        //System.out.println(alumnos);
        Usuario usuario = usuarioDAOImpl.readValidUsers("cesar.je.lo@gmail.com", "admin");
        System.out.println(usuario);
//
//        //deleteAlumno
//        alumnoDAOImpl.delete(6);

        //updatealumno
//        entity.setId(7);
//        entity.setId(8);
//        entity.setNombre("Erick");
//        entity.setPaterno("Lopez");
//        entity.setIdCarrera(1);
//        alumnoDAOImpl.update(entity);

        //selectById
        //System.out.println(alumnoDAOImpl.readById(4));
    }
}
