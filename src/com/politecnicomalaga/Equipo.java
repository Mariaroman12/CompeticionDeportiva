package com.politecnicomalaga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Equipo {
    private String codEquipo;
    private String descripcion;
    private String nombreR;
    private String apellidoR;
    private String ciudad;
    private String email;
    private String telefono;
    private Map<String,Jugador>misJugadores;

    public Equipo(String codEquipo, String descripcion, String nombreR, String apellidoR, String ciudad, String email, String telefono) {
        this.codEquipo = codEquipo;
        this.descripcion = descripcion;
        this.nombreR = nombreR;
        this.apellidoR = apellidoR;
        this.ciudad = ciudad;
        this.email = email;
        this.telefono = telefono;
        this.misJugadores = new HashMap<>();
        }


/*public boolean tieneJugadores(){

}*/
    //F
    //Crear objeto en el main
    public boolean addJugador(Jugador miJ) {
      if(misJugadores.containsKey(miJ.getDni())){
      return false;
      }misJugadores.put(miJ.getDni(), miJ);
                     return true;
      }
    
    public boolean tieneJugadores() {
        return !misJugadores.isEmpty();
    }
      //G
    public boolean eliminarJugador(String dni) {
        for (Jugador miJ : misJugadores.values()) {
            if (miJ.getDni().equals(dni)) {
                //if(misJugadores.containsKey(dni)){
                misJugadores.remove(miJ.getDni());
                return true;
            }
        }
            return false;

    }

    //H
    public boolean cambiarDisponibilidad(String dni, boolean disponibilidad){
        for (Jugador miJ : misJugadores.values()) {
            if (miJ.getDni().equals(dni)) {
                miJ.setDisponible(disponibilidad);
                return true;
            }
        }
        return false;

    }
    public Jugador[] listarJugadores(){
      return misJugadores.values().toArray(new Jugador[0]);
      }



    public String getCodEquipo() {
        return codEquipo;
    }

    public void setCodEquipo(String codEquipo) {
        this.codEquipo = codEquipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescrpcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

    public String getApellidoR() {
        return apellidoR;
    }

    public void setApellidoR(String apellidoR) {
        this.apellidoR = apellidoR;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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

    public Map<String, Jugador> getMisJugadores() {
        return misJugadores;
    }

    public void setMisJugadores(Map<String, Jugador> misJugadores) {
        this.misJugadores = misJugadores;
    }
}

