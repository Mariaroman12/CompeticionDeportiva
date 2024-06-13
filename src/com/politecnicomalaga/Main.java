package com.politecnicomalaga;

import java.util.Scanner;

public class Main {
    public static void main (String [] arg){
        Scanner sc = new Scanner(System.in);
        Competicion miCompeticion = null;
        while (true) {
            System.out.println("\nBienvenido al sistema de competiciones:");
            System.out.println("1. Proporcionar datos de la competición");
            System.out.println("2. Añadir un nuevo equipo");
            System.out.println("3. Eliminar un equipo existente");
            System.out.println("4. Buscar equipos de una localidad");
            System.out.println("5. Listar todos los equipos");
            System.out.println("6. Dar de alta un nuevo jugador");
            System.out.println("7. Eliminar un jugador en un equipo");
            System.out.println("8. Cambiar estado de un jugador de un equipo");
            System.out.println("9. Listar jugadores de un equipo");
            System.out.println("10. Salir");
            System.out.print("Por favor, seleccione una opción: ");
            int opcion = Integer.valueOf(sc.nextLine());
                
            switch (opcion) {
                case 1:
                	System.out.println("Agregue el codigo de competicion");
                    String codCom = sc.nextLine();
                    System.out.println("Agregue la descripcion");
                    String descripcion = sc.nextLine();
                    System.out.println("Agregue la provincia");
                    String provincia = sc.nextLine();
                    miCompeticion = new Competicion(codCom, descripcion, provincia);
                    break;

                case 2:
                    System.out.println("Escriba el codigo del equipo");
                    String codEquipo = sc.nextLine();
                    System.out.println("Agregue la descripcion del equipo");
                    descripcion = sc.nextLine();
                    System.out.println("Escriba el nombre del representante");
                    String nombreR = sc.nextLine();
                    System.out.println("Agregue el apellido del representante");
                    String apellidoR = sc.nextLine();
                    System.out.println("Agregue la ciudad");
                    String ciudad = sc.nextLine();
                    System.out.println("Agregue el email");
                    String email = sc.nextLine();
                    System.out.println("Agregue el telefono");
                    String telefono = sc.nextLine();

                    miCompeticion.addEquipo(codEquipo, descripcion, nombreR, apellidoR, ciudad, email, telefono);
                    break;

                case 3:
                    System.out.println("Escriba el codigo del equipo");
                    codEquipo = sc.nextLine();
                    miCompeticion.eliminarEquipo(codEquipo);
                    break;

                case 4:
                    System.out.println("Escriba la ciudad");
                    ciudad = sc.nextLine();
                    System.out.println(miCompeticion.buscarEquipos(ciudad));
                    break;

                case 5:
                	System.out.println(miCompeticion.listarTodosEquipos());
                    break;

                case 6:
                    System.out.println("Escriba el codigo del equipo");
                    codEquipo = sc.nextLine();
                    System.out.println("Escriba el nombre del jugador");
                    String nombre = sc.nextLine();
                    System.out.println("Escriba los apellidos del jugador");
                    String apellidos = sc.nextLine();
                    System.out.println("Escriba el dorsal del jugador");
                    String dorsal = sc.nextLine();
                    System.out.println("Escriba el dni del jugador");
                    String dni = sc.nextLine();
                    System.out.println("Escriba el email del jugador");
                    email = sc.nextLine();
                    System.out.println("Escriba el telefono del jugador");
                    telefono = sc.nextLine();
                    System.out.println("Escriba si esta disponible el jugador");
                    boolean disponible = Boolean.parseBoolean(sc.nextLine());

                    Jugador miJ = new Jugador(nombre, apellidos, dorsal, dni, email, telefono, disponible);
                    miCompeticion.addJugador(codEquipo, miJ);
                    break;

                case 7:
                    System.out.println("Escriba el codigo del equipo");
                    codEquipo = sc.nextLine();
                    System.out.println("Escriba el dni del jugador");
                    dni = sc.nextLine();
                    miCompeticion.eliminarJugador(codEquipo, dni);
                    break;

                case 8:
                    System.out.println("Escriba el codigo del equipo");
                    codEquipo = sc.nextLine();
                    System.out.println("Escriba el dni del jugador");
                    dni = sc.nextLine();
                    System.out.println("Escriba si esta disponible el jugador para cambiarlo");
                    disponible = Boolean.parseBoolean(sc.nextLine());
                    miCompeticion.cambiarDisponibilidad(codEquipo, dni, disponible);
                    break;

                case 9:
                    System.out.println("Escriba el codigo del equipo");
                    codEquipo = sc.nextLine();
                    System.out.println(miCompeticion.listarJugadores(codEquipo));
                    break;

                case 10:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }

            }
        }

    }
