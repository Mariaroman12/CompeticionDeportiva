package com.politecnicomalaga;

public class Jugador {
    private String nombre;
    private String apellidos;
    private String dorsal;
    private String dni;
    private String email;
    private String telefono;
    private boolean disponible;

    public Jugador(String nombre, String apellidos, String dorsal, String dni, String email, String telefono, boolean disponible) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dorsal = dorsal;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

