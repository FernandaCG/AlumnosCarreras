package com.ipn.escom.wad.dao;

import com.ipn.escom.wad.conexion.ConnectionManager;
import com.ipn.escom.wad.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.Logger;

/**
 *
 * @author fernanda
 */
public class UsuarioDAOImpl implements UsuarioDAO {

    final static Logger log = Logger.getLogger(UsuarioDAOImpl.class);

    private static final String READ_USUARIO_BY_ID = "SELECT * FROM Usuario WHERE id=?";

    private final ConnectionManager connectionManager;
    private Statement statement;
    private Connection conn;
    private ResultSet rs;
    private PreparedStatement ps;

    public UsuarioDAOImpl() {
        connectionManager = new ConnectionManager();
    }

    @Override
    public void create(Usuario entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario readById(long usuarioId) {
        Usuario entity = new Usuario();
        try {
            conn = connectionManager.connect();
            ps = conn.prepareStatement(READ_USUARIO_BY_ID);
            ps.setLong(1, usuarioId);
            rs = ps.executeQuery();
            while (rs.next()) {
                entity.setId(rs.getLong("id"));
                entity.setCorreo(rs.getString("correo"));
                entity.setCorreo(rs.getString("password"));
                entity.setId(rs.getLong("idCarrera"));
            }

        } catch (SQLException sQLException) {
            log.fatal("sqlException" + sQLException);
        }

        return entity;
    }

    @Override
    public Usuario readByCorreo(String correo) {
        return null;
    }

    @Override
    public void update(Usuario entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(long usuarioId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
