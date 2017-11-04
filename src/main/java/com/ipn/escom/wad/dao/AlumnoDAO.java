package com.ipn.escom.wad.dao;

import com.ipn.escom.wad.model.Alumno;
import java.util.List;

/**
 *
 * @author fernanda
 */
public interface AlumnoDAO {

    public void create(Alumno entity);

    public List<Alumno> readAll();

    public Alumno readById(long alumnoId);

    public void update(Alumno entity);
    
    public void delete(long alumnoId);
}
