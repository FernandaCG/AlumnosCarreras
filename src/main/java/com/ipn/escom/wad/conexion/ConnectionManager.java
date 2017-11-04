package com.ipn.escom.wad.conexion;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import org.apache.log4j.Logger;

/**
 *
 * @author fernanda
 */
public class ConnectionManager {

    final static Logger log = Logger.getLogger(ConnectionManager.class);

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/wad";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private Connection connection = null;

    public Connection connect() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException classNotFoundException) {
            log.fatal("No se encontró el driver" + DRIVER);
        } catch (SQLException sQLException) {
        }
        return connection;
    }
}
