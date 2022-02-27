package org.ipc_t1.models;

public class Usuario {
    private String username;
    private String password;
    private int dpi;
    private String nombre;
    private String apellido;
    private String rol;


    String res;
    public static Usuario user;

    public Usuario(int dpi, String username, String password, String nombre, String apellido, String rol){
        this.username=username;
        this.password=password;
        this.dpi=dpi;
        this.nombre=nombre;
        this.apellido=apellido;
        this.rol=rol;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
