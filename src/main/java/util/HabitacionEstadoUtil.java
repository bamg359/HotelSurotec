package util;

import modelo.dominio.HabitacionEnum;
import modelo.dominio.TipoHabEnum;

import java.util.Scanner;

public class HabitacionEstadoUtil {


    static Scanner sc = new Scanner(System.in);


    public static String asignarEstadoHabitacion(){

        System.out.println("Seleccione 1. Disponible 2. Ocupada 3. Mantenimiento 4. Limpieza 5. Reservada");

        int estadoHab = sc.nextInt();
        String estadoHabitacion= "";

        switch (estadoHab){

            case 1:
                System.out.println("Disponible");
                estadoHabitacion = String.valueOf(HabitacionEnum.DISPONIBLE);
                break;
            case 2:
                System.out.println("Ocupada");
                estadoHabitacion = String.valueOf(HabitacionEnum.OCUPADA);
                break;
            case 3:
                System.out.println("Mantenimiento");
                estadoHabitacion = String.valueOf(HabitacionEnum.MANTENIMIENTO);
                break;
            case 4:
                System.out.println("Limpieza");
                estadoHabitacion = String.valueOf(HabitacionEnum.LIMPIEZA);
                break;
            case 5:
                System.out.println("Reservada");
                estadoHabitacion = String.valueOf(HabitacionEnum.RESERVADA);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        return estadoHabitacion;
    }



}
