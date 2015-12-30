package com.mapper;
import com.model.Usuario;
import java.util.List;
public interface UsuarioMapper {
    public void save(Usuario u);
    public List<Usuario> list();
    public List<Usuario> search(Usuario u);
    public void delete(Usuario u);
    public void edit(Usuario u);
 
}
