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
        UsuarioDAO uDAO=new UsuarioDAO();
        List<Usuario> lista=uDAO.list();
        for(int i=0;i<lista.size();i++){
            System.out.println(""+lista.get(i).getNombre());
        }
    }
}
