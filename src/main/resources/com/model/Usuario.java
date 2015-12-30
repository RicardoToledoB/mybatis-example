/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author usuario
 */
public class Usuario {
    private int usuario_id;
    private String nombre;
    private String apepat;
    private String apemat;

    public Usuario() {
    }

    public Usuario(int usuario_id, String nombre, String apepat, String apemat) {
        this.usuario_id = usuario_id;
        this.nombre = nombre;
        this.apepat = apepat;
        this.apemat = apemat;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }
    
}
