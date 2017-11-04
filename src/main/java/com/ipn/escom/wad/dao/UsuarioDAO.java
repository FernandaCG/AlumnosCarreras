package com.ipn.escom.wad.dao;

import com.ipn.escom.wad.model.Usuario;

/**
 *
 * @author fernanda
 */
public interface UsuarioDAO {

    public void create(Usuario entity);

    public Usuario readById(long usuarioId);

    public Usuario readByCorreo(String correo);

    public void update(Usuario entity);

    public void delete(long usuarioId);
}
