package com.dao;

import com.config.mybatis.MyBatisUtil;
import com.mapper.UsuarioMapper;
import com.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author usuario
 */
public class UsuarioDAO implements UsuarioMapper {

  
    public void save(Usuario user) {
        SqlSession session = new MyBatisUtil().getSession();
            try {
                session.insert("Usuario.save", user);
            } finally {
                session.commit();
                session.close();
            }
    }
    
    public List<Usuario> list() {
        List<Usuario> list = new ArrayList<Usuario>();
        SqlSession session = new MyBatisUtil().getSession();
        try {
            list = session.selectList("Usuario.list");
        } finally {
            session.close();
        }
        return list;
    }

    @Override
    public List<Usuario> search(Usuario u) {
        List<Usuario> list = new ArrayList<Usuario>();
        SqlSession session = new MyBatisUtil().getSession();
        try {
            list = session.selectList("Usuario.search",u);
        } finally {
            session.close();
        }
        return list;
    }

    @Override
    public void delete(Usuario user) {
        SqlSession session = new MyBatisUtil().getSession();
        try {
            session.update("Usuario.delete", user);
        } finally {
            session.commit();
            session.close();
        }
    }

    public void edit(Usuario user) {
        SqlSession session = new MyBatisUtil().getSession();
        try {
            session.update("Usuario.edit", user);
        } finally {
            session.commit();
            session.close();
        }
    }
    
}
