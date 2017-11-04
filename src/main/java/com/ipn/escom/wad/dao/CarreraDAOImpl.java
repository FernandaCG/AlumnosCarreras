package com.ipn.escom.wad.dao;

import com.ipn.escom.wad.model.Carrera;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author campos
 */
public class CarreraDAOImpl implements CarreraDAO {

    final static Logger log = Logger.getLogger(CarreraDAOImpl.class);

    private static final String CREATE_CARRERA = "INSERT INTO Carreras (nombreCarrera) VALUES (?)";
    private static final String SELECT_ALL = "SELECT * FROM Carreras";
    private static final String SELECT_CARRERA = "SELECT * FROM Carreras WHERE id = ?";
    private static final String UPDATE_CARRERA = "UPDATE Carreras SET nombreCarrera WHERE id = ?";
    private static final String DELETE_CARRERA = "DELETE FROM Carreras WHERE id = ?";

    @Override
    public void create(Carrera entity) {
    }

    @Override
    public List<Carrera> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Carrera selectCarrera(Long idCarrera) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Carrera entity) {
    }

    @Override
    public void delete(Long idCarrera) {
    }

}
