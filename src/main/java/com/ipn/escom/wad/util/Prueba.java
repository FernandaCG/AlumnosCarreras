package com.ipn.escom.wad.util;

import com.ipn.escom.wad.conexion.ConnectionManager;
import com.ipn.escom.wad.dao.AlumnoDAOImpl;
import com.ipn.escom.wad.model.Alumno;
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

        //createAlumno
        entity.setId(7);
        entity.setNombre("Cesar11");
        entity.setPaterno("Hernandez");
        entity.setIdCarrera(1);
        alumnoDAOImpl.create(entity);

        //selectAll
        List<Alumno> alumnos = alumnoDAOImpl.readAll();
        System.out.println(alumnos);

        //deleteAlumno
        alumnoDAOImpl.delete(6);

        //updatealumno
        entity.setId(7);
        entity.setId(8);
        entity.setNombre("Erick");
        entity.setPaterno("Lopez");
        entity.setIdCarrera(1);
        alumnoDAOImpl.update(entity);

        //selectById
        System.out.println(alumnoDAOImpl.readById(4));
    }
}