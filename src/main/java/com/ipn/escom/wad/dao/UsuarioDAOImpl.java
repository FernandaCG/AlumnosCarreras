package com.ipn.escom.wad.dao;

import com.ipn.escom.wad.conexion.ConnectionManager;
import com.ipn.escom.wad.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;

/**
 *
 * @author fernanda
 */
public class UsuarioDAOImpl implements UsuarioDAO {

    final static Logger log = Logger.getLogger(UsuarioDAOImpl.class);

    private static final String CREATE_USUARIO = "INSERT INTO usuario(correo, password, rol) VALUES (?, ?, ?)";
    private static final String READ_USUARIO_BY_ID = "SELECT * FROM usuario WHERE id=?";
    private static final String READ_USUARIO_VALID_USER = "SELECT * FROM Usuario WHERE correo=? AND password=?";
    private static final String UPDATE_USUARIO = "UPDATE usuario SET correo=?, password=?, rol=? WHERE id=?";
    private static final String DELETE_USUARIO = "DELETE FROM usuario WHERE id=?";

    private final ConnectionManager connectionManager;
    private Connection conn;
    private ResultSet rs;
    private PreparedStatement ps;
    private Usuario usuario;

    public UsuarioDAOImpl() {
        connectionManager = new ConnectionManager();
    }

    @Override
    public void create(Usuario entity) {
        conn = connectionManager.connect();
        try {
            ps = conn.prepareStatement(CREATE_USUARIO);
            ps.setString(1, entity.getCorreo());
            ps.setString(2, entity.getPassword());
            ps.setString(3, entity.getRol());

            ps.executeUpdate();
        } catch (SQLException sQLException) {
            log.fatal("sqlException" + sQLException);
        }

        log.info("Usuario agregado: " + entity);
    }

    @Override
    public Usuario readById(long usuarioId) {
        try {
            usuario = new Usuario();
            conn = connectionManager.connect();
            ps = conn.prepareStatement(READ_USUARIO_BY_ID);
            ps.setLong(1, usuarioId);
            rs = ps.executeQuery();

            while (rs.next()) {
                usuario.setId(rs.getLong("id"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setPassword(rs.getString("password"));
            }

        } catch (SQLException sQLException) {
            log.fatal("sqlException" + sQLException);
        }

        return usuario;
    }

    @Override
    public Usuario readValidUsers(String mail, String password) {
        try {
            usuario = new Usuario();
            conn = connectionManager.connect();
            ps = conn.prepareStatement(READ_USUARIO_VALID_USER);
            ps.setString(1, mail);
            ps.setString(2, password);
            rs = ps.executeQuery();

            while (rs.next()) {
                usuario.setId(rs.getLong("id"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setPassword(rs.getString("password"));
                usuario.setRol(rs.getString("rol"));
            }

        } catch (SQLException sQLException) {
            log.fatal("sqlException" + sQLException);
        }

        return usuario;
    }

    @Override
    public void update(Usuario entity) {
        conn = connectionManager.connect();
        try {
            ps = conn.prepareStatement(UPDATE_USUARIO);
            ps.setString(1, entity.getCorreo());
            ps.setString(2, entity.getPassword());
            ps.setString(3, entity.getRol());
            ps.setLong(4, entity.getId());

            ps.executeUpdate();
        } catch (SQLException sQLException) {
            log.fatal("sqlException" + sQLException);
        }

        log.info("Usuario actualizado: " + entity);
    }

    @Override
    public void delete(long usuarioId) {
                conn = connectionManager.connect();
        try {
            ps = conn.prepareStatement(DELETE_USUARIO);
            ps.setLong(1, usuarioId);
            
            ps.executeUpdate();
        } catch (SQLException sQLException) {
            log.fatal("sqlException" + sQLException);
        }

        log.info("Usuario eliminado");
    }
}
