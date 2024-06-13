package com.politecnicomalaga;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Competicion {
    private String codCom;
    private String descripcion;
    private String provincia;
    private ArrayList<Equipo>misEquipos;

    public Competicion (String codCom, String descripcion, String provincia) {
        this.codCom = codCom;
        this.descripcion = descripcion;
        this.provincia = provincia;
        misEquipos = new ArrayList<>();

    }


    // B
    public boolean addEquipo(String codEquipo, String descripcion, String nombreR, String apellidoR, String ciudad, String email, String telefono){
            Equipo nuevoEquipo = new Equipo(codEquipo, descripcion, nombreR, apellidoR, ciudad, email, telefono);
            for (Equipo miE : misEquipos) {
                if (miE.getCodEquipo().equals(codEquipo)) {
                    return false;
                }
            }
            misEquipos.add(nuevoEquipo);
            return true;
    }
    
    // C
    public boolean eliminarEquipo(String codEquipo){
        for (Equipo miE : misEquipos) {
            if (miE.getCodEquipo().equals(codEquipo)) {
            	if (!miE.tieneJugadores()) {
                    misEquipos.remove(miE);
                    return true;
                }
               System.out.println("El equipo tiene jugadores, no se puede eliminar.");
                return false;
            }
        }return false;
    }
    //D
    public String buscarEquipos(String ciudad){
      LinkedList<Equipo> resultado=new LinkedList<>();
      for (Equipo miE:misEquipos){
        if(miE.getCiudad().equals(ciudad)){
            resultado.add(miE);
        }
      } return resultado.toString();
    }

      //E
    public String listarTodosEquipos(){
        StringBuilder listaEquipos = new StringBuilder();
        for (Equipo miE : misEquipos) {
            if (miE != null) {
                listaEquipos.append("Equipo: ").append(miE.getCodEquipo()).append(", Ciudad: ")
                        .append(miE.getCiudad()).append(", Descripcion: ").append(miE.getDescripcion()).append(", Nombre representante: ")
                        .append(miE.getNombreR()).append(", Apellido representante: ").append(miE.getApellidoR()).append(", email: ")
                        .append(miE.getEmail()).append(", Telefono: ").append(miE.getTelefono()).append("\n");
            }
        }
        return listaEquipos.toString();
    }

    //Listar todos los jugadores de un equipo
    public String listarJugadores(String codEquipo){
    	StringBuilder listaJugadores = new StringBuilder();
        for (Equipo miE : misEquipos) {
            if (miE.getCodEquipo().equals(codEquipo)) {
            	Jugador[] jugadores = miE.listarJugadores();
                for (Jugador j : jugadores) {
                    listaJugadores.append("Jugador: ").append(j.getNombre()).append(" ").append(j.getApellidos())
                        .append(", Dorsal: ").append(j.getDorsal()).append(", DNI: ").append(j.getDni())
                        .append(", Email: ").append(j.getEmail()).append(", Teléfono: ").append(j.getTelefono())
                        .append(", Disponible: ").append(j.isDisponible()).append("\n");
                }
                return listaJugadores.toString();
            }
        }
        return null;
    }
    
    public boolean addJugador(String codEquipo, Jugador miJ){
        for (Equipo miE : misEquipos) {
            if (miE.getCodEquipo().equals(codEquipo)) {
                miE.addJugador(miJ);
                return true;
            }
        }return false;
    }
    
    public boolean eliminarJugador(String codEquipo, String dni){
        for (Equipo miE : misEquipos) {
            if (miE.getCodEquipo().equals(codEquipo)) {
                miE.eliminarJugador(dni);
                return true;
            }
        }return false;
    }

    public boolean cambiarDisponibilidad(String codEquipo, String dni,  boolean disponibilidad){
        for (Equipo miE : misEquipos) {
            if (miE.getCodEquipo().equals(codEquipo)) {
                miE.cambiarDisponibilidad(dni, disponibilidad);
                return true;
            }
        }return false;
    }


    public String getCodCom() {
        return codCom;
    }

    public void setCodCom(String codCom) {
        this.codCom = codCom;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }


}
