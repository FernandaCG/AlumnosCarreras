package com.ipn.escom.wad.dao;

import com.ipn.escom.wad.conexion.ConnectionManager;
import com.ipn.escom.wad.model.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author fernanda
 */
public class AlumnoDAOImpl implements AlumnoDAO {

    final static Logger log = Logger.getLogger(AlumnoDAOImpl.class);

    private static final String CREATE_ALUMNO = "INSERT INTO Alumnos(nombre, paterno, idCarrera) VALUES (?, ?, ?)";
    private static final String READ_ALL_ALUMNOS = "SELECT * FROM Alumnos";
    private static final String READ_ALUMNO_BY_ID = "SELECT * FROM Alumnos WHERE id=?";
    private static final String UPDATE_ALUMNO = "UPDATE Alumnos SET nombre=?, paterno=?, idCarrera=? WHERE id=?";
    private static final String DELETE_ALUMNO = "DELETE FROM Alumnos WHERE id=?";
    private final ConnectionManager connectionManager;
    private Statement statement;
    private Connection conn;
    private ResultSet rs;
    private PreparedStatement ps;

    private Alumno alumno;
    private final List<Alumno> alumnosList;

    public AlumnoDAOImpl() {
        connectionManager = new ConnectionManager();
        alumnosList = new ArrayList<>();
    }

    @Override
    public void create(Alumno entity) {
        conn = connectionManager.connect();
        try {
            ps = conn.prepareStatement(CREATE_ALUMNO);
            ps.setString(1, entity.getNombre());
            ps.setString(2, entity.getPaterno());
            ps.setLong(3, entity.getIdCarrera());

            ps.executeUpdate();
        } catch (SQLException sQLException) {
            log.fatal("sqlException" + sQLException);
        }

        log.info("Alumno agregado: " + entity);
    }

    @Override
    public List<Alumno> readAll() {
        try {
            conn = connectionManager.connect();
            statement = conn.createStatement();
            rs = statement.executeQuery(READ_ALL_ALUMNOS);

            while (rs.next()) {
                alumno = new Alumno();

                alumno.setId(rs.getInt("id"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setPaterno(rs.getString("paterno"));
                alumno.setIdCarrera(rs.getLong("idCarrera"));

                alumnosList.add(alumno);
            }

        } catch (SQLException sQLException) {
            log.fatal("sqlException" + sQLException);
        }

        return alumnosList;
    }

    @Override
    public Alumno readById(long alumnoId) {
        alumno = new Alumno();

        try {
            conn = connectionManager.connect();
            ps = conn.prepareStatement(READ_ALUMNO_BY_ID);
            ps.setLong(1, alumnoId);
            rs = ps.executeQuery();

            while (rs.next()) {
                alumno.setId(rs.getLong("id"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setPaterno(rs.getString("paterno"));
                alumno.setIdCarrera(rs.getLong("idCarrera"));
            }

        } catch (SQLException sQLException) {
            log.fatal("sqlException" + sQLException);
        }

        return alumno;
    }

    @Override
    public void update(Alumno entity) {
        conn = connectionManager.connect();
        try {
            ps = conn.prepareStatement(UPDATE_ALUMNO);
            ps.setString(1, entity.getNombre());
            ps.setString(2, entity.getPaterno());
            ps.setLong(3, entity.getIdCarrera());
            ps.setLong(4, entity.getId());
            
            ps.executeUpdate();
        } catch (SQLException sQLException) {
            log.fatal("sqlException" + sQLException);
        }

        log.info("Alumno actualizado: " + entity);
    }

    @Override
    public void delete(long alumnoId) {
        conn = connectionManager.connect();
        try {
            ps = conn.prepareStatement(DELETE_ALUMNO);
            ps.setLong(1, alumnoId);
            
            ps.executeUpdate();
        } catch (SQLException sQLException) {
            log.fatal("sqlException" + sQLException);
        }

        log.info("Alumno eliminado");
    }
}
