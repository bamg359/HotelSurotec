package vista;

import modelo.dominio.Huesped;
import repositorio.HuespedRepositorio;
import servicios.HuespedServiceImpl;

import java.util.Scanner;

public class App {

    Scanner sc = new Scanner(System.in);
    Huesped huesped = new Huesped();
    HuespedRepositorio huespedRepositorio = new HuespedRepositorio();
    HuespedServiceImpl huespedService = new HuespedServiceImpl(huespedRepositorio);

    public void menuApp(){


        System.out.println("Bienvenido al sistema de gestión de hotel \n" +
                "presione 1 para iniciar el  sistema");

        int init = sc.nextInt();


        while (init != 0) {


            System.out.println("1. Gestionar Huespedes \n" +
                    "2. Gestionar Empleados \n" +
                    "3. Salir");

            int option = sc.nextInt();

            switch (option){

                case 1:
                    System.out.println("Gestionar Huespedes");
                    gestionarHuespedes();
                    break;
                case 2:
                    System.out.println("Gestionar Empleados");

                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    init = 0; // Salir del bucle
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    continue; // Volver al inicio del bucle para mostrar el menú nuevamente

            }






        }




    }


    public void gestionarHuespedes() {

        System.out.println("Seleccione una opción \n" +
                "1. Registrar Huesped \n" +
                "2. Buscar Huesped \n" +
                "3. Actualizar Huesped \n" +
                "4. Eliminar Huesped \n" +
                "5. Listar Huespedes \n" +
                "0. Salir");

        int option = sc.nextInt();

        switch (option){
            case 1:
                System.out.println("Registrar Huesped");
                huespedService.registrarPersona(huesped);
                break;

            case 2:
                System.out.println("Buscar Huesped por Id");
                int id = sc.nextInt();
                huespedService.buscarPersona(id);
                break;
            case 3:
                System.out.println("Actualizar Huesped");
                huespedService.actualizarPersona(huesped);
                break;
            case 4:
                System.out.println("Eliminar Huesped");
                System.out.println("Eliminar Huesped con Id: ");
                id = sc.nextInt();
                huespedService.eliminarPersona(id);
                break;
            case 5:
                System.out.println("Listar Huespedes");
                huespedService.mostrarHuespedes();
                break;
            case 0:
                System.out.println("Saliendo del menú de gestión de Huespedes...");
                return; // Salir del método gestionarHuespedes
            default:
                System.out.println("Opción no válida, por favor intente de nuevo.");
        }


    }









}
