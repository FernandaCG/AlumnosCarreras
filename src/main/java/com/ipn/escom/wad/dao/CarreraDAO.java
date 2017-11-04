package com.ipn.escom.wad.dao;

import com.ipn.escom.wad.model.Carrera;
import java.util.List;

/**
 *
 * @author campos
 */
public interface CarreraDAO {

    public void create(Carrera entity);

    public List<Carrera> selectAll();

    public Carrera selectCarrera(Long idCarrera);

    public void update(Carrera entity);

    public void delete(Long idCarrera);

}
