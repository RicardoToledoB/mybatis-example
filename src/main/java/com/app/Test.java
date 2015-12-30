package com.app;
import com.dao.UsuarioDAO;
import com.model.Usuario;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Test {
    public static void main(String[] args){
        //IMPORTANTE CREAR resources /src/main/
        //Listar usuarios
        UsuarioDAO uDAO=new UsuarioDAO();
        List<Usuario> lista=uDAO.list();
        for(int i=0;i<lista.size();i++){
            System.out.println(""+lista.get(i).getNombre());
        }
        //Crear Usuario
        Usuario user=new Usuario();
        user.setNombre("JUAN");
        user.setApepat("PEREZ");
        user.setApemat("ROJAS");
        UsuarioDAO uDAO1=new UsuarioDAO();
        uDAO1.save(user);
        
        //Eliminar Usuario
        Usuario user1=new Usuario();
        user1.setUsuario_id(1);
        UsuarioDAO uDAO4=new UsuarioDAO();
        uDAO4.delete(user1);
        
        
        //Buscar usuarios
        Usuario user2=new Usuario();
        user2.setUsuario_id(2);
        UsuarioDAO uDAO2=new UsuarioDAO();
        List<Usuario> lista1=uDAO2.search(user2);
        for(int i=0;i<lista1.size();i++){
            System.out.println("Encontrado:"+lista.get(i).getNombre());
        }
        //ACTUALIZAR USUARIOS
        Usuario user3=new Usuario();
        user3.setUsuario_id(2);
        user3.setNombre("PEPE");
        user3.setApepat("ROJAS");
        user3.setApemat("FLORES");
        UsuarioDAO uDAO3=new UsuarioDAO();
        uDAO3.edit(user3);
        
    }
}
