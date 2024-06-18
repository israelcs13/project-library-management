package org.example;
public class User {

    private String id;
    private String nombre;
    private String rol;

 //Constructor
    public User(String id, String rol, String nombre) {
        this.id = id;
        this.rol = rol;
        this.nombre = nombre;
    }

    //Getters&Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }


}


