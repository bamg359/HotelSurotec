package modelo.casosdeusos;

import modelo.dominio.TipoHabEnum;

import java.util.Scanner;

public class UsoHabitacion {

    static Scanner  sc = new Scanner(System.in);


    public static String asignarTipoHabitacion(){

        System.out.println("Seleccione 1. Habitacion Clasica 2. Habitacion Premium 3. Habitacion Suite");

        int tipoHab = sc.nextInt();
        String tipoHabitacion= "";

        switch (tipoHab){

            case 1:
                System.out.println("Clasica");
                tipoHabitacion = String.valueOf(TipoHabEnum.CLASICA);
                break;
            case 2:
                System.out.println("Premium");
                tipoHabitacion = String.valueOf(TipoHabEnum.PREMIUM);
                break;
            case 3:
                System.out.println("Suite");
                tipoHabitacion = String.valueOf(TipoHabEnum.SUITE);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        return tipoHabitacion;
    }


}
